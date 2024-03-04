using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace MdiProject.todo
{
    public partial class TodoForm : Form
    {
        private static TodoForm instance = null;
        private TodoDBManager dbManager = new TodoDBManager();


        // 메인 폼에 userForm이 존재하면 더 이상 userForm이 생기지 않도록.
        public static TodoForm getInstance()
        {
            if (instance == null || instance.IsDisposed)
            {
                instance = new TodoForm();
                return instance;
            }
            else
            {
                return instance;
            }
        }

        public TodoForm()
        {
            InitializeComponent();
            // combobox list add
            comboBox_userIdx.DataSource = new List<string>()
            {
                "1", "2", "3", "4", "5"
            };
            comboBox_userIdx.SelectedItem = "1";

            // '예약' panel 설정
            Label title_id = new Label();
            title_id.Text = "title";
            title_id.AutoSize = true;
            title_id.Font = new Font("국민연금체 Regular", 18F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(129)));

            Panel resuvPanel = new Panel();
            resuvPanel.BackColor = Color.White;
            resuvPanel.Size = new Size(200, 80);
            resuvPanel.Location = new Point(20, 50);

            resuvPanel.Controls.Add(title_id);
            panel1.Controls.Add(resuvPanel);
        }

        private void insertBtn_Click(object sender, EventArgs e)
        {
            bool result =
                    dbManager.insert(new Todo() {
                                                    user_idx = int.Parse(comboBox_userIdx.Text),
                                                    title = textBox_title.Text,
                                                    content = textBox_content.Text,
                                                    finishdate = dateTimePicker_finishDate.Value,
                                                }
                                    );

            if(result)
            {
                MessageBox.Show("입력하였습니다.");
                textBox_title.Text = "";
                textBox_content.Text = "";
                comboBox_userIdx.SelectedItem = "1";
            } else
            {
                MessageBox.Show("에러가 발생하였습니다.");
            }
        }
    }
}
