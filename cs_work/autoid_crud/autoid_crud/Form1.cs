using autoid_crud.db;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Data;
using System.Windows.Forms;

namespace autoid_crud
{
    public partial class Form1 : Form
    {
        private int autoid = 0;
        public Form1()
        {
            InitializeComponent();
            genderComboBox.SelectedIndex = 0;

            dataGridView1.ReadOnly = true;     // dataGridView 읽기전용
            dataGridView1.AutoSizeColumnsMode  // 컬럼 넓이를 넓게 만드러 줌
                        = DataGridViewAutoSizeColumnsMode.Fill;
            dataGridView1.AllowUserToAddRows = false;

            select();
            cleanControll();
        }

        private void cleanControll()
        {
            firstNameTextBox.Text = string.Empty;
            lastNameTextBox.Text = string.Empty;
            genderComboBox.SelectedIndex = 0;
            button_update.Text = "UPDATE";
            button_delete.Text = "DELETE";
        }

        private void insert(object sender, EventArgs e)
        {
            // IsNullOrEmpty() : 공백이거나 널 여부를 체크한다.
            // 'firstName이나 lastName이 공백이거나 널이면' 이라는 조건
            if (string.IsNullOrEmpty(firstNameTextBox.Text.Trim())
                    || string.IsNullOrEmpty(lastNameTextBox.Text.Trim()))
            {
                MessageBox.Show("이름을 입력하세요"
                                ,"경고"
                                ,MessageBoxButtons.OK
                                ,MessageBoxIcon.Information);
                return;
            }

            try 
            {
                CRUD.con.Open();
                CRUD.sql = "INSERT INTO tb_smart_crud (autoid, firstname, lastname, gender) VALUES (tb_seq.NEXTVAL, :firstName, :lastName, :gender)";
                //CRUD.sql = "INSERT INTO tb_smart_crud (autoid, firstname, lastname, gender) VALUES (tb_seq.NEXTVAL, 'a', 'b', '정체모를 성별')";
                CRUD.cmd = new OracleCommand(CRUD.sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();
                CRUD.cmd.Parameters.Add("firstName", firstNameTextBox.Text);
                CRUD.cmd.Parameters.Add("lastName", lastNameTextBox.Text);
                CRUD.cmd.Parameters.Add("gender", genderComboBox.SelectedItem.ToString());
                CRUD.cmd.ExecuteNonQuery();
                MessageBox.Show("데이터가 저장되었습니다.");
            }
            catch(Exception ex)
            {
                MessageBox.Show("에러발생ㅇㅇㅇㅇ : " + ex.Message);
            }
            finally
            {
                CRUD.sql = "";
                CRUD.con.Close();
            }
        }

        // 안보내면 빈공백이다.
        private void select(string searchText="")
        {
            try
            {
                CRUD.con.Open();

                OracleDataAdapter oracleDataAdapter = new OracleDataAdapter();
                CRUD.sql = "SELECT * " +
                             "FROM tb_smart_crud " +
                            "WHERE firstname LIKE '%' || :search || '%' " +
                               "OR lastname LIKE '%' || :search || '%' " +
                            "ORDER BY 1 DESC";

                CRUD.cmd = new OracleCommand(CRUD.sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();
                CRUD.cmd.Parameters.Add("search", searchText);
                oracleDataAdapter.SelectCommand = CRUD.cmd;

                DataSet dataSet = new DataSet();
                oracleDataAdapter.Fill(dataSet);

                // 화면과 연결
                dataGridView1.DataSource = dataSet.Tables[0];
            }
            catch (Exception ex)
            {
                MessageBox.Show("에러발생 : " + ex.Message);
            }
            finally
            {
                CRUD.sql = "";
                CRUD.con.Close();
                cleanControll();

                // 메소드가 실행되면 
                // datagridview의 [행 첫번째] 중 [첫 열]의 [값]을 [숫자로 바꿔서] autoid의 변수에 삽입
                if (dataGridView1.Rows.Count > 0)
                {
                    this.autoid = int.Parse(dataGridView1.Rows[0].Cells[0].Value.ToString());
                }
            }
        }

        private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            this.autoid = int.Parse(dataGridView1.CurrentRow.Cells[0].Value.ToString());

            string firstName = dataGridView1.CurrentRow.Cells[1].Value.ToString();
            string lastName = dataGridView1.CurrentRow.Cells[2].Value.ToString();
            string gender = dataGridView1.CurrentRow.Cells[3].Value.ToString();

            firstNameTextBox.Text = firstName;
            lastNameTextBox.Text = lastName;
            genderComboBox.Text = gender;

            button_update.Text = $"UPDATE ({autoid})";
            button_delete.Text = $"DELETE ({autoid})";
        }

        private void button_select_Click(object sender, EventArgs e)
        {
            if(searchText.Text.Equals(""))
            {
                select();
            } else
            {
                select(searchText.Text);
            }
        }

        private void button_update_Click(object sender, EventArgs e)
        {
            // IsNullOrEmpty() : 공백이거나 널 여부를 체크한다.
            // 'firstName이나 lastName이 공백이거나 널이면' 이라는 조건
            if (string.IsNullOrEmpty(firstNameTextBox.Text.Trim())
                    || string.IsNullOrEmpty(lastNameTextBox.Text.Trim()))
            {
                MessageBox.Show("이름을 입력하세요"
                                , "경고"
                                , MessageBoxButtons.OK
                                , MessageBoxIcon.Information);
                return;
            }

            try
            {
                CRUD.con.Open();
                CRUD.sql = "UPDATE tb_smart_crud " +
                              "SET firstname = :firstName" +
                                ", lastname = :lastName" +
                                ", gender = :gender " +
                            "WHERE autoid = :autoid";

                CRUD.cmd = new OracleCommand(CRUD.sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();
                CRUD.cmd.Parameters.Add("firstName", firstNameTextBox.Text);
                CRUD.cmd.Parameters.Add("lastName", lastNameTextBox.Text);
                CRUD.cmd.Parameters.Add("gender", genderComboBox.SelectedItem.ToString());
                CRUD.cmd.Parameters.Add("autoid", this.autoid);
                CRUD.cmd.ExecuteNonQuery();
                MessageBox.Show("데이터가 수정되었습니다.");
            }
            catch (Exception ex)
            {
                MessageBox.Show("에러발생 : " + ex.Message);
            }
            finally
            {
                CRUD.sql = "";
                CRUD.con.Close();
                select();
                cleanControll();
            }
        }

        private void button_delete_Click(object sender, EventArgs e)
        {
            if(this.autoid == 0)
            {
                MessageBox.Show("삭제할 행을 선택해주세요");
                return;
            }

            try
            {
                CRUD.con.Open();
                CRUD.sql = "DELETE FROM tb_smart_crud WHERE autoid = :autoid";

                CRUD.cmd = new OracleCommand(CRUD.sql, CRUD.con);
                CRUD.cmd.Parameters.Clear();
                CRUD.cmd.Parameters.Add("autoid", this.autoid);
                CRUD.cmd.ExecuteNonQuery();
                MessageBox.Show("데이터가 삭제되었습니다.");
            }
            catch (Exception ex)
            {
                MessageBox.Show("에러발생 : " + ex.Message);
            }
            finally
            {
                CRUD.sql = "";
                CRUD.con.Close();
                select();
                cleanControll();
            }
        }
    }
}
