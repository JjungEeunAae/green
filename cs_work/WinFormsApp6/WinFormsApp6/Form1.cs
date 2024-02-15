using NAudio.Wave;

namespace WinFormsApp6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            KeyPreview = true;
            timer1.Enabled = true;
        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            Console.WriteLine("누름 " + e.KeyCode);

            if (e.KeyCode == Keys.Q)
            {
                panel1.Visible = false;
                WaveOutEvent woe = new WaveOutEvent();  // NAudio 패키지
                woe.Init(new AudioFileReader(@"D:\Students\cs_work\WinFormsApp6\WinFormsApp6\do\\도도도.mp3"));
                woe.Play();
            }
        }

        private void Form1_KeyUp(object sender, KeyEventArgs e)
        {
            Console.WriteLine("뗏음 " + e.KeyCode);
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            // Console.WriteLine("출력됨");
            label1.Text = DateTime.Now.ToString();  // 현재시간을 라벨로 출력
        }
    }
}
