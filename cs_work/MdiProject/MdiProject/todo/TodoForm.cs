using System;
using System.Collections.Generic;
using System.Data;
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
            comboboxInit();

            // 만들어진 패널에 DB 값 넣기
            DataTable dataTable = dbManager.select();
            int y = 80;
            int evenOdd = 1;
            foreach (DataRow row in dataTable.Rows)
            {
                Console.WriteLine("row[idx] = " + row["idx"]);
                Console.WriteLine("row[title] = " + row["title"]);
                Console.WriteLine("row[content] = " + row["content"]);
                Console.WriteLine("row[date] = " + row["finishdate"]);

                int user_idx = int.Parse(row["idx"].ToString());
                string title = row["title"].ToString();
                string content = row["content"].ToString();
                DateTime finishdate = new DateTime(
                                            int.Parse(row["finishdate"].ToString().Split('-',' ')[0]),
                                            int.Parse(row["finishdate"].ToString().Split('-',' ')[1]),
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[2])
                                        );
                //Console.WriteLine(finishdate.ToString("yyyy/MM/dd"));
                Todo todo = new Todo();
                todo.user_idx = user_idx;
                todo.title = title;
                todo.content = content;
                todo.finishdate = finishdate;

                // y는 220씩 증가해야함
                makeTodoPanel(20, y, todo, evenOdd%2);
                evenOdd += 1;
                y += 220;
            }

            #region 주석처리한 내용
            // '예약' panel 설정
            /*Label title_id = new Label();
            title_id.Text = "title";
            title_id.AutoSize = true;
            title_id.Font = new Font("국민연금체 Regular", 18F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(129)));

            Panel resuvPanel = new Panel();
            resuvPanel.BackColor = Color.White;
            resuvPanel.Size = new Size(200, 80);
            resuvPanel.Location = new Point(20, 50);

            resuvPanel.Controls.Add(title_id);
            panel1.Controls.Add(resuvPanel);*/
            #endregion
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

        private void makeTodoPanel(int panelx, int panely, Todo todo, int evenOdd)
        {
            #region panel 화면구현
            Label title_lb = new Label();
            Label finishDate_lb = new Label();
            Label content_lb = new Label();
            CheckBox success_checkbox = new CheckBox();
            Label finishDate_lb_value = new Label();
            Label content_lb_value = new Label();
            Label title_lb_value = new Label();
            // 
            // finishDate_lb_value
            // 
            finishDate_lb_value = new Label();
            finishDate_lb_value.AutoSize = true;
            finishDate_lb_value.Font = new Font("국민연금체 Regular", 9.749999F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            finishDate_lb_value.ForeColor = Color.Black;
            finishDate_lb_value.Location = new Point(7, 155);
            finishDate_lb_value.Name = "finishDate_lb_value";
            finishDate_lb_value.Size = new Size(78, 19);
            finishDate_lb_value.TabIndex = 7;
            finishDate_lb_value.Text = todo.finishdate.ToString("yyyy-MM-dd");
            finishDate_lb_value.TextAlign = ContentAlignment.TopRight;
            // 
            // content_lb_value
            // 
            content_lb_value = new Label();
            content_lb_value.AutoSize = true;
            content_lb_value.Font = new Font("국민연금체 Regular", 9.749999F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            content_lb_value.ForeColor = Color.Black;
            content_lb_value.Location = new Point(7, 59);
            content_lb_value.Name = "content_lb_value";
            content_lb_value.Size = new Size(63, 19);
            content_lb_value.TabIndex = 6;
            content_lb_value.Text = todo.content.ToString();
            content_lb_value.TextAlign = ContentAlignment.TopCenter;
            // 
            // title_lb_value
            // 
            title_lb_value = new Label();
            title_lb_value.AutoSize = true;
            title_lb_value.Font = new Font("국민연금체 Regular", 9.749999F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            title_lb_value.ForeColor = Color.Black;
            title_lb_value.Location = new Point(90, 9);
            title_lb_value.Name = "title_lb_value";
            title_lb_value.Size = new Size(37, 19);
            title_lb_value.TabIndex = 5;
            title_lb_value.Text = todo.title.ToString();
            // 
            // success_checkbox
            // 
            success_checkbox = new CheckBox();
            success_checkbox.AutoSize = true;
            success_checkbox.Font = new Font("온글잎 밑미 Regular", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            success_checkbox.Location = new Point(222, 172);
            success_checkbox.Name = "success_checkbox";
            success_checkbox.Size = new Size(45, 20);
            success_checkbox.TabIndex = 4;
            success_checkbox.Text = "완료";
            success_checkbox.UseVisualStyleBackColor = true;
            // 
            // finishDate_lb
            // 
            finishDate_lb = new Label();
            finishDate_lb.AutoSize = true;
            finishDate_lb.Font = new Font("국민연금체 Regular", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            finishDate_lb.ForeColor = Color.Black;
            finishDate_lb.Location = new Point(7, 131);
            finishDate_lb.Name = "finishDate_lb";
            finishDate_lb.Size = new Size(96, 24);
            finishDate_lb.TabIndex = 2;
            finishDate_lb.Text = "finishDate";
            finishDate_lb.TextAlign = ContentAlignment.TopRight;
            // 
            // content_lb
            // 
            content_lb = new Label();
            content_lb.AutoSize = true;
            content_lb.Font = new Font("국민연금체 Regular", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            content_lb.ForeColor = Color.Black;
            content_lb.Location = new Point(7, 35);
            content_lb.Name = "content_lb";
            content_lb.Size = new Size(78, 24);
            content_lb.TabIndex = 1;
            content_lb.Text = "content";
            content_lb.TextAlign = ContentAlignment.TopCenter;
            // 
            // title_lb
            // 
            title_lb = new Label();
            title_lb.AutoSize = true;
            title_lb.Font = new Font("국민연금체 Regular", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            title_lb.ForeColor = Color.Black;
            title_lb.Location = new Point(7, 5);
            title_lb.Name = "title_lb";
            title_lb.Size = new Size(46, 24);
            title_lb.TabIndex = 0;
            title_lb.Text = "title";
            // 
            // panel4
            //
            Panel panel4 = new Panel();
            panel4.Location = new Point(0, 0);
            panel4.Name = "panel4";
            panel4.Size = new Size(200, 100);
            panel4.TabIndex = 3;
            // 패널 백 그라운드 색상 번갈라가며 드로잉
            if(evenOdd % 2 == 0)
            {
                panel4.BackColor = Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            } else
            {
                panel4.BackColor = Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            }
            panel4.Controls.Add(finishDate_lb_value);
            panel4.Controls.Add(content_lb_value);
            panel4.Controls.Add(title_lb_value);
            panel4.Controls.Add(success_checkbox);
            panel4.Controls.Add(finishDate_lb);
            panel4.Controls.Add(content_lb);
            panel4.Controls.Add(title_lb);
            panel4.Location = new Point(panelx, panely);
            panel4.Name = "panel4";
            panel4.Size = new Size(280, 195);
            panel4.TabIndex = 1;
            panel4.ResumeLayout(false);
            panel4.PerformLayout();

            this.panel1.Controls.Add(panel4);

            #endregion
        }

        private void comboboxInit()
        {
            comboBox_userIdx.DataSource = new List<string>()
            {
                "1", "2", "3", "4", "5"
            };
            comboBox_userIdx.SelectedItem = "1";
        }
    }
}
