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
            Hide();                     // ��ư Ŭ���ϸ� form1�� �����
            MessageBox.Show("form2");   // form1�� ������� �� �� �˾�â�� ��
            new Form2().Show();         // form2�� ��Ÿ��
            Show();                     // form1�� ��Ÿ��
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Hide();                     // ��ư Ŭ���ϸ� form1�� �����
            MessageBox.Show("form3");   // form1�� ������� �� �� �˾�â�� ��
            Form3 frm3 = new Form3();   // ��ü����
            frm3.ShowDialog();          // form3�� ��Ÿ��
            Show();                     // form3�� 'x' ������ form1�� ��Ÿ��
        }
    }
}
