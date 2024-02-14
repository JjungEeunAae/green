using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WinFormsApp5.mamber;

namespace WinFormsApp5
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine(textBox2.Text);
            Console.WriteLine(textBox1.Text);

            if
            (
                textBox2.Text == "admin" &&
                textBox1.Text == "1234"
            )
            {
                MessageBox.Show("로그인 성공!");

                Hide();
                Member me = new Member(textBox2.Text, textBox1.Text);
                me.ShowDialog();
                Show();
            }
            else
            {
                MessageBox.Show("아이디와 비밀번호를 확인해주세요.");
            }

        }
    }
}
