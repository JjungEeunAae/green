namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private int y = 30;

        private void button1_Click(object sender, EventArgs e)
        {
            for(int i = 0; i < 10; i++)
            {
                Button btn1 = new Button();
                btn1.Text = "OK";
                btn1.Location = new Point(300, 10+y*i);
                btn1.UseVisualStyleBackColor = false;
                btn1.Click += Btn1_Click;   // btn1�� Ŭ���ϸ� Btn1_Click �Լ��� �����ض�.
                Controls.Add(btn1);
            }

        }

        private void Btn1_Click(object? sender, EventArgs e)
        {
            Random random = new Random();
            int x = random.Next(1, 300);
            int y = random.Next(10,200);

            Console.WriteLine("[ " + x + ", " + y + " ]");

            // !!! (Button)sender;�� �������� ���� ����ȯ�̴� !!!
            Button btn = sender as Button;   // ���ܰ� �߻����� �ʴ� ����ȯ

            if(btn.BackColor == Color.OrangeRed)
            {
                btn.BackColor = Color.White;
                btn.Text = "OK";
                btn.Location = new Point(x, y);
            }
            else {
                // �Ӽ� ����
                btn.BackColor = Color.OrangeRed;
                btn.Text = "NOT OK";
                btn.Location = new Point(x, y);
            }
        }
    }
}
