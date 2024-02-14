namespace WinFormsApp4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            Friend f = new Friend("全辨悼");   // 按眉积己
            Console.WriteLine(f);

            label1.Text = f.ToString();
        }
    }
}
