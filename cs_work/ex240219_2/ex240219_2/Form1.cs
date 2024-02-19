using System;
using System.Collections;
using System.Collections.Generic;
using System.Drawing;
using System.Runtime.InteropServices;
using System.Threading;
using System.Windows.Forms;

namespace ex240219_2
{
    public partial class Form1 : Form
    {
        List<string> listboxdata = new List<string>() { "hong", "park", "lee"};
        List<Person> presonList = new List<Person>
        {
            new Person() { name = "kim", age = 20},
            new Person() { name = "lee", age = 30}
        };
        public Form1()
        {
            InitializeComponent();
            dataGridView1.DataSource = presonList;

            List<int> ints = new List<int>() { 11, 22, 33, 44, 55 };
            string result = "";
            foreach (int i in ints)
            {
                result += i;
            }
            label1.Text = result;

            
        }

        public void MyThread()
        {
            Random random = new Random();
            double ran = random.NextDouble();
            //button1.Text = ran.ToString();
            while (true)
            {
                Thread.Sleep(1000);
                Invoke(new Action(() => {
                    button1.Location = new Point(random.Next(700), random.Next(500));
                }));
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Thread th1 = new Thread(MyThread);
            th1.Start();

            button1.Text = "동적으로 버튼 생성";
            button1.Width = 400;

            for (int i = 0; i < 5; i++)
            {
                Button button = new Button();
                button.Text = i.ToString();
                this.Controls.Add(button);

                Point point = new Point();
                point.X = 10;
                point.Y = 100 + 40 * i;
                button.Location = point;

                bool visible = new Random().Next(2) == 0 ? true : false;
                Thread.Sleep(10);
                button.Visible = visible;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            A a = new A() { x = 10, y = 20 };
            A b = a;

            AA aa = new AA() { x = 10, y = 20 };
            AA bb = aa;

            a.x = 100;
            Console.WriteLine($"a.x = {a.x}");
            Console.WriteLine($"b.x = {b.x}");

            aa.x = 100;
            Console.WriteLine($"a.x = {aa.x}");
            Console.WriteLine($"a.x = {bb.x}");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            List<int> list = new List<int>() { 10, 20, 30, 40, 50 };
            foreach (int i in list)
            {
                Console.WriteLine(i);
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            listBox1.DataSource = null;
            listboxdata.Add("kim");
            listBox1.DataSource = listboxdata;
        }
        private void button5_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = null;
            presonList.Add(new Person() { name = "new", age = 100 });
            dataGridView1.DataSource = presonList;
        }
    }
}
