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
                    // 예외 상황이 발생하더라도 종료되지 않음(안전한 형변환)
                    Panel p = control as Panel;
                    foreach(Control subConrol in p.Controls)
                    {
                        subConrol.Text = "패널위";
                    }
                }

                control.Text = "바껴라";
                control.Font = new Font("한컴 말랑말랑 Bold", 15.7499981F, FontStyle.Bold, GraphicsUnit.Point, 129);

                if(control is Button)
                {
                    Button btn = control as Button;
                    btn.AutoSize = true;
                }
            }
        }
    }
}
