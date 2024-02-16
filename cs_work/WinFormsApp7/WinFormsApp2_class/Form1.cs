using System.ComponentModel.DataAnnotations;

namespace WinFormsApp2_class
{
    public partial class Form1 : Form
    {
        class Car
        {
            public string Name { get; set; } // getter, setter
            // 기본생성자와 다른생성자는 만들 필요없다.
        }

        int y = 10;
        List<Car> list = new List<Car>();
        
        public Form1()
        {
            InitializeComponent();

            MakeLabel(10, y, "안녕");
            MakeLabel(10, y += 40, "동적으로 라벨 생성할거임");

            Car c = new Car() { Name = "myFirstCar" }; // 생성자없이 값을 넣을 수 있다.
            Car c2 = new Car() { Name = "mySecontCar" }; // 생성자없이 값을 넣을 수 있다.

            list.Add(c);
            list.Add(c2);

            //       var car in list 도 가능함
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
            label1.Font = new Font("한컴 말랑말랑 Bold", 15.7499981F, FontStyle.Bold, GraphicsUnit.Point, 129);
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
