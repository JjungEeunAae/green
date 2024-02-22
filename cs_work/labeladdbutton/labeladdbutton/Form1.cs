using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.NetworkInformation;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace labeladdbutton
{
    public partial class Form1 : Form
    {
        List<int> ints = new List<int>();
        Random r = new Random();
        int size = 3;
        public Form1()
        {
            InitializeComponent();

            addButtions();
            setLableList();
        }

        /*private void Btn_Click1(object sender, EventArgs e)
        {
            MessageBox.Show("또 연결됨?");
        }*/

        private void Btn_Click(object sender, EventArgs e)
        {
            Button button = (Button)sender;
            //MessageBox.Show("test " + button.Text);
            int tmp = int.Parse(button.Text);
            ints.Add(tmp);

            setLableList();
        }

        private void setLableList()
        {
            string result = "";
            for (int i = 0; i < ints.Count; i++)
            {
                if (ints.Count != (i + 1))
                    result += ints[i] + ", ";
                else
                    result += ints[i];
            }
            label2.Text = result;
        }

        #region

        private void addButtions()
        {
            for (int i = 0; i < 5; i++)
            {
                string ramdomStr = r.Next(100).ToString();
                // 추가하는 버튼
                Button btn = new Button();
                btn.Text = ramdomStr;
                btn.Font = new System.Drawing.Font("학교안심 꽈배기 R", 27.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
                btn.AutoSize = true;
                btn.Location = new Point(80 + (i * 110), 210);
                btn.Click += Btn_Click;
                /*btn.Click += new System.EventHandler(Btn_Click1);
                btn.Click += (sender, e) =>
                {
                    MessageBox.Show("람다 가능");
                };*/
                Controls.Add(btn);

                // 삭제하는 버튼
                Button btn2 = new Button();
                btn2.Text = ramdomStr;
                btn2.Font = new System.Drawing.Font("학교안심 꽈배기 R", 27.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
                btn2.AutoSize = true;
                btn2.Location = new Point(80 + (i * 110), 330);
                btn2.Click += (sender, e) =>
                {
                    Button tmp = sender as Button;
                    int itmp = int.Parse(tmp.Text);
                    ints.Remove(itmp);
                    setLableList();
                };
                Controls.Add(btn2);

            }
        }
        #endregion

        private void Form1_Load(object sender, EventArgs e)
        {
            //폼이 나오는 순간 실행되는 함수
            //MessageBox.Show("test");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("추가버튼누름");
        }
    }
}