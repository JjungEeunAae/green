using ex240220_File_InputAndOutput.database;
using ex240220_File_InputAndOutput.file;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace ex240220_File_InputAndOutput
{
    public partial class Form1 : Form
    {
        FileControl fc = new FileControl();
        FileTBDataBase ftdb = new FileTBDataBase();

        private string selectedString = "";

        public Form1()
        {
            InitializeComponent();

            List<string> list = ftdb.read();
            listBox1.DataSource = null;
            listBox1.DataSource = list;
        }

        private void readButtonClick(object sender, EventArgs e)
        {
            List<string> list = ftdb.read();
            listBox1.DataSource = null;
            listBox1.DataSource = list;
        }

        private void insertButtonClick(object sender, EventArgs e)
        {
            //textBox가 빈 칸이면?
            if(textBox1.Text == "")
            {
                MessageBox.Show("글자 입력해주시오");
                return;
            }

            ftdb.insert(textBox1.Text);
            List<string> list = ftdb.read();

            listBox1.DataSource = null;
            listBox1.DataSource = list;
            textBox1.Text = "";
        }

        private void 수정하기(object sender, EventArgs e)
        {

            MessageBox.Show("수정");
            if (textBox1.Text == "")
            {
                MessageBox.Show("글자입력해라");
                return;
            }
            string updateStr = textBox1.Text;

            ftdb.update(selectedString, updateStr);
            

            // select 버튼 누른거 이벤트 발생
            button1.PerformClick(); // button1(read하는거)을 누른것처럼 이벤트를 발생 함
            textBox1.Text = "";

            // 불러오기 함수 호출
            //불러오기(null, null);
        }

        private void 삭제하기(object sender, EventArgs e)
        {
            MessageBox.Show("삭제");

            string connectionString = "DATA SOURCE=127.0.0.1; User Id=hr; Password=1234";

            // DB 연결...
            OracleConnection con = new OracleConnection(connectionString);

            con.Open();  // db 열기

            OracleCommand oracleCommand = new OracleCommand($" DELETE FROM filetb WHERE str = '{textBox1.Text}'", con);
            oracleCommand.ExecuteNonQuery();

            con.Close();  // db 닫기

            button1.PerformClick();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            /*Console.WriteLine(listBox1.SelectedIndex);
            Console.WriteLine(listBox1.SelectedItem);*/

            if(listBox1.SelectedItem != null)
            {
                textBox1.Text = listBox1.SelectedItem.ToString();
                selectedString = listBox1.SelectedItem.ToString();
                //MessageBox.Show("글자 수정하고 싶은거 바꿨음? >> " + selectedString);
            }
        }
    }
}
