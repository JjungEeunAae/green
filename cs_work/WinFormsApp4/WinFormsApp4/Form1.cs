namespace WinFormsApp4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            Friend f = new Friend("ȫ�浿");   // ��ü����
            Console.WriteLine(f);

            label1.Text = f.ToString();
        }
    }
}
