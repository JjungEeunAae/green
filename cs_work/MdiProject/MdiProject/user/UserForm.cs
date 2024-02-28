using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace MdiProject.user
{
    public partial class UserForm : Form
    {
        private static UserForm instance = null;
        private UserDBManager dbManager = new UserDBManager();


        // 메인 폼에 userForm이 존재하면 더 이상 userForm이 생기지 않도록.
        public static UserForm getInstance()
        {
            if(instance == null || instance.IsDisposed)
            {
                instance = new UserForm();
                return instance;
            } else
            {
                return instance;
            }
        }

        public UserForm()
        {
            InitializeComponent();
            LoadData();
        }

        private void LoadData()
        {
            DataTable dt = dbManager.select();
            if(dt != null)
            {
                dataGridView1.DataSource = dt;
            }
        }

        private void button_insert_Click(object sender, EventArgs e)
        {
           Users users = new Users() {
                                        Name = textBox_name.Text,
                                        Addr = textBox_addr.Text,
                                        Email = textBox_email.Text,
                                        Password = textBox_pw.Text,
                                      };
            bool result = dbManager.insert(users);

            if(result)
            {
                MessageBox.Show("저장완료");
                textBox_name.Text = "";
                textBox_addr.Text = "";
                textBox_email.Text = "";
                textBox_pw.Text = "";
                LoadData();
            }
            else
            {
                MessageBox.Show("에러! 정상적으로 실행되지 않았습니다.");
            }
        }

        private void button_update_Click(object sender, EventArgs e)
        {

        }

        private void button_delete_Click(object sender, EventArgs e)
        {

        }

        private void button_select_Click(object sender, EventArgs e)
        {

        }
    }
}
