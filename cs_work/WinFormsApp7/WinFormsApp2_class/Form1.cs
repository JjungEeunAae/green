using System.ComponentModel.DataAnnotations;

namespace WinFormsApp2_class
{
    public partial class Form1 : Form
    {
        class Car
        {
            public string Name { get; set; } // getter, setter
            // �⺻�����ڿ� �ٸ������ڴ� ���� �ʿ����.
        }

        int y = 10;
        List<Car> list = new List<Car>();
        
        public Form1()
        {
            InitializeComponent();

            MakeLabel(10, y, "�ȳ�");
            MakeLabel(10, y += 40, "�������� �� �����Ұ���");

            Car c = new Car() { Name = "myFirstCar" }; // �����ھ��� ���� ���� �� �ִ�.
            Car c2 = new Car() { Name = "mySecontCar" }; // �����ھ��� ���� ���� �� �ִ�.

            list.Add(c);
            list.Add(c2);

            //       var car in list �� ������
            foreach (Car car in list)
            {
                Console.WriteLine(car);
                MakeLabel(10, y, car.Name);
                y += 40;
            }

        }

        public void MakeLabel(int x, int y, string text)
        {
            Label label1 = new Label();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(x, y);
            label1.Font = new Font("���� �������� Bold", 15.7499981F, FontStyle.Bold, GraphicsUnit.Point, 129);
            label1.TabIndex = 0;
            label1.Text = text;

            Controls.Add(label1);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine(textBox1.Text);
            MakeLabel(10, y += 40, textBox1.Text);
            textBox1.Text = "";
        }

        private void textBox1_KeyUp(object sender, KeyEventArgs e)
        {
            if(e.KeyCode == Keys.Enter)
            {
                button1_Click(null, null);
            }
        }
    }
}
