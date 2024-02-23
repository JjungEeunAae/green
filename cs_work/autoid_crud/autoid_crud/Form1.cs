using autoid_crud.db;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.OleDb;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace autoid_crud
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            genderComboBox.SelectedIndex = 0;
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
    }
}
