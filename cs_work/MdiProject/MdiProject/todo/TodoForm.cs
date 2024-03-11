using MdiProject.user;
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
        private UserDBManager userDBManager = new UserDBManager();

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
            todoSelect();
            todoSelectComplete();

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

        public void todoSelect()
        {
            // 패널 초기화
            panel1.Controls.Clear();
            // 만들어진 패널에 DB 값 넣기
            DataTable dataTable = dbManager.select("");
            int y = 80;
            int evenOdd = 1;

            foreach (DataRow row in dataTable.Rows)
            {
               /*Console.WriteLine("row[idx] = " + row["idx"]);
                Console.WriteLine("row[title] = " + row["title"]);
                Console.WriteLine("row[content] = " + row["content"]);
                Console.WriteLine("row[date] = " + row["finishdate"]);
                Console.WriteLine("row[name] = " + row["name"]);*/

                int user_idx = int.Parse(row["idx"].ToString());
                string title = row["title"].ToString();
                string content = row["content"].ToString();
                DateTime finishdate = new DateTime(
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[0]),
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[1]),
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[2])
                                        );

                Todo todo = new Todo();
                todo.user_idx = user_idx;
                todo.title = title;
                todo.content = content;
                todo.finishdate = finishdate;
                todo.name = row["name"].ToString();

                // y는 220씩 증가해야함
                makeTodoPanel(20, y, todo, evenOdd % 2);
                evenOdd += 1;
                y += 220;
            }
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

                todoSelect();
            } else
            {
                MessageBox.Show("에러가 발생하였습니다.");
            }
        }

        private void makeTodoPanel(int panelx, int panely, Todo todo, int evenOdd, string panel = "panel1")
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
            success_checkbox.Tag = todo.user_idx;
            success_checkbox.Click += Compete_checkBox_Click; // 체크박스 이벤트 생성
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
            // nameLabel
            //
            Label nameLabel = new Label();
            nameLabel.Text = "할 사람 : " + todo.name.ToString();
            nameLabel.AutoSize = true;
            nameLabel.Location = new Point(160, 70);
            nameLabel.Font = new Font("함초롱돋움", 10F);
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

            panel4.Controls.Add(nameLabel);
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

            if(panel.Equals("panel1"))
            {
                // 목록보는 기능의 메소드에서 panel4의 모든 도구들을 클린해서
                // '예약'이라는 제목을 가진 label1을 동적으로 붙혀넣어주었음.
                // 
                // label1
                // 
                this.label1.AutoSize = true;
                this.label1.BackColor = Color.Transparent;
                this.label1.Font = new Font("국민연금체 Regular", 18F, FontStyle.Bold, GraphicsUnit.Point, ((byte)(129)));
                this.label1.Location = new Point(8, 6);
                this.label1.Name = "label1";
                this.label1.Size = new Size(61, 35);
                this.label1.TabIndex = 0;
                this.label1.Text = "예약";
                this.panel1.Controls.Add(panel4);
                this.panel1.Controls.Add(this.label1);
            }
            else
            {
                this.compl_panel.Controls.Add(panel4);
                this.compl_panel.Controls.Add(this.label2);
            }

            #endregion
        }

        private void Compete_checkBox_Click(object sender, EventArgs e)
        {
            CheckBox cb = sender as CheckBox;
            //MessageBox.Show(cb.Tag.ToString());
            bool result = dbManager.update(cb.Tag.ToString());

            if (result)
            {
                MessageBox.Show("수정 성공");
                todoSelect();
                todoSelectComplete();
            } else
            {
                MessageBox.Show("수정 실패");
            }
        }

        public void todoSelectComplete()
        {
            // 패널 초기화
            compl_panel.Controls.Clear();
            // 만들어진 패널에 DB 값 넣기
            DataTable dataTable = dbManager.select("Y");
            int y = 80;
            int evenOdd = 1;

            foreach (DataRow row in dataTable.Rows)
            {
                int user_idx = int.Parse(row["idx"].ToString());
                string title = row["title"].ToString();
                string content = row["content"].ToString();
                DateTime finishdate = new DateTime(
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[0]),
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[1]),
                                            int.Parse(row["finishdate"].ToString().Split('-', ' ')[2])
                                        );

                Todo todo = new Todo();
                todo.user_idx = user_idx;
                todo.title = title;
                todo.content = content;
                todo.finishdate = finishdate;
                todo.name = row["name"].ToString();

                // y는 220씩 증가해야함
                makeTodoPanel(20, y, todo, evenOdd % 2, "centerPanel");
                evenOdd += 1;
                y += 220;
            }
        }

        private void comboboxInit()
        {
            List<String> list = userDBManager.selectUserId();
            comboBox_userIdx.DataSource = list;
            comboBox_userIdx.SelectedItem = "1";

            /*comboBox_userIdx.DataSource = new List<string>()
            {
                "1", "2", "3", "4", "5"
            };*/
        }
    }
}
