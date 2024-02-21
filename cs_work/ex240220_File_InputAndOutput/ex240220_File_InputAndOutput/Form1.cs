using ex240220_File_InputAndOutput.database;
using ex240220_File_InputAndOutput.file;
using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace ex240220_File_InputAndOutput
{
    public partial class Form1 : Form
    {
        FileControl fc = new FileControl();
        FileTBDataBase ftdb = new FileTBDataBase();
        //List<string> list = new List<string>();

        public Form1()
        {
            InitializeComponent();

            List<string> list = ftdb.read();
            listBox1.DataSource = null;
            listBox1.DataSource = list;
        }

        private void readButtonClick(object sender, EventArgs e)
        {
            //List<string> list = fc.read();
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

            //list.Add(textBox1.Text);
            //fc.write(textBox1.Text, list);

            ftdb.insert(textBox1.Text);
            List<string> list = ftdb.read();

            listBox1.DataSource = null;
            listBox1.DataSource = list;
            textBox1.Text = "";
        }

    }
}
