namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            foreach (Control control in Controls)
            {
                Console.WriteLine(control);

                if(control is Panel)
                {
                    // ���� ��Ȳ�� �߻��ϴ��� ������� ����(������ ����ȯ)
                    Panel p = control as Panel;
                    foreach(Control subConrol in p.Controls)
                    {
                        subConrol.Text = "�г���";
                    }
                }

                control.Text = "�ٲ���";
                control.Font = new Font("���� �������� Bold", 15.7499981F, FontStyle.Bold, GraphicsUnit.Point, 129);

                if(control is Button)
                {
                    Button btn = control as Button;
                    btn.AutoSize = true;
                }
            }
        }
    }
}
