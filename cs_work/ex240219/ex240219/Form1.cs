using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex240219
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public void MyThread()
        {
            Random r = new Random();
            //double ran = r.NextDouble();
            //button1.Text = ran;
            /*while (true)
            {
                // 1초 쉬다가 버튼의 위치를 이동시켜라
                Thread.Sleep(1000);
                button1.Location = new Point(r.Next(300), r.Next(250));
            }*/
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // Thread th1 = new Thread(MyThread);
            // th1.Start();

            button1.Text = "동적으로 버튼 생성";
            button1.Width = 400;

            for (int i = 0; i < 5; i++)
            {
                Button button = new Button();
                button.Text = i.ToString();
                this.Controls.Add(button);

                Point point =   new Point();
                point.X = 10;
                point.Y = 100 + 40 * i;
                button.Location = point;

                bool visible = new Random().Next(2) == 0 ? true : false;
                Thread.Sleep(10);
                button.Visible = visible;
            }
        }
    }
}
