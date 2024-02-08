namespace EX240208
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show(((Button)sender).ToString());
            MessageBox.Show(tb.Text);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int num1;   // 빈 객체 선언
            int num2;
            //MessageBox.Show("더하기" + (num1 + num2));
            int.TryParse(tb_num1.Text.ToString(), out num1);
            int.TryParse(tb_num2.Text.ToString(), out num2);
            lb_result.Text = (num1 + num2) + "";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("빼기");
            int num1 = int.Parse(tb_num1.Text);
            int num2 = int.Parse(tb_num2.Text);
            lb_result.Text = (num1 - num2) + "";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("나누기");

            // 0으로 못나누면 트라이캐치 써야 함
            try
            {
                int num1; 
                int num2;

                int.TryParse(tb_num1.Text.ToString(), out num1);
                int.TryParse(tb_num2.Text.ToString(), out num2);

                lb_result.Text = (num1 / num2) + "";
            }
            catch (Exception)
            {

                MessageBox.Show("0으로 나눌 수 없습니다.");
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("곱하기");
            int num1 = int.Parse(tb_num1.Text);
            int num2 = int.Parse(tb_num2.Text);
            lb_result.Text = (num1 * num2) + "";
        }
    }
}
