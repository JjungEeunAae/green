using WinFormsApp5.aaa;

namespace WinFormsApp5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Hide();                     // 버튼 클릭하면 form1이 사라짐
            MessageBox.Show("form2");   // form1이 사라지고 난 후 팝업창이 뜸
            new Form2().Show();         // form2가 나타남
            Show();                     // form1이 나타남
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Hide();                     // 버튼 클릭하면 form1이 사라짐
            MessageBox.Show("form3");   // form1이 사라지고 난 후 팝업창이 뜸
            Form3 frm3 = new Form3();   // 객체생성
            frm3.ShowDialog();          // form3이 나타남
            Show();                     // form3을 'x' 누르면 form1이 나타남
        }
    }
}
