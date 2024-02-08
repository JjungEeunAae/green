namespace EX240208
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            button1 = new Button();
            tb = new TextBox();
            button2 = new Button();
            button3 = new Button();
            button4 = new Button();
            button5 = new Button();
            label2 = new Label();
            label3 = new Label();
            tb_num1 = new TextBox();
            tb_num2 = new TextBox();
            lb_result = new Label();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(235, 197);
            label1.Name = "label1";
            label1.Size = new Size(39, 15);
            label1.TabIndex = 0;
            label1.Text = "label1";
            // 
            // button1
            // 
            button1.Location = new Point(581, 224);
            button1.Name = "button1";
            button1.Size = new Size(77, 23);
            button1.TabIndex = 1;
            button1.Text = "button1";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // tb
            // 
            tb.Location = new Point(235, 224);
            tb.Name = "tb";
            tb.Size = new Size(320, 23);
            tb.TabIndex = 2;
            // 
            // button2
            // 
            button2.Location = new Point(237, 279);
            button2.Name = "button2";
            button2.Size = new Size(75, 23);
            button2.TabIndex = 3;
            button2.Text = "더하기";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Location = new Point(318, 279);
            button3.Name = "button3";
            button3.Size = new Size(75, 23);
            button3.TabIndex = 4;
            button3.Text = "빼기";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // button4
            // 
            button4.Location = new Point(399, 279);
            button4.Name = "button4";
            button4.Size = new Size(75, 23);
            button4.TabIndex = 5;
            button4.Text = "나누기";
            button4.UseVisualStyleBackColor = true;
            button4.Click += button4_Click;
            // 
            // button5
            // 
            button5.Location = new Point(480, 279);
            button5.Name = "button5";
            button5.Size = new Size(75, 23);
            button5.TabIndex = 6;
            button5.Text = "곱하기";
            button5.UseVisualStyleBackColor = true;
            button5.Click += button5_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("경기천년제목 Bold", 14.25F, FontStyle.Bold);
            label2.Location = new Point(233, 50);
            label2.Name = "label2";
            label2.Size = new Size(79, 19);
            label2.TabIndex = 7;
            label2.Text = "첫번째 수";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("경기천년제목 Bold", 14.25F, FontStyle.Bold);
            label3.Location = new Point(233, 97);
            label3.Name = "label3";
            label3.Size = new Size(79, 19);
            label3.TabIndex = 8;
            label3.Text = "두번째 수";
            // 
            // tb_num1
            // 
            tb_num1.Location = new Point(318, 46);
            tb_num1.Name = "tb_num1";
            tb_num1.Size = new Size(152, 23);
            tb_num1.TabIndex = 9;
            // 
            // tb_num2
            // 
            tb_num2.Location = new Point(318, 93);
            tb_num2.Name = "tb_num2";
            tb_num2.Size = new Size(152, 23);
            tb_num2.TabIndex = 10;
            // 
            // lb_result
            // 
            lb_result.AutoSize = true;
            lb_result.Font = new Font("경기천년제목 Bold", 14.25F, FontStyle.Bold);
            lb_result.Location = new Point(250, 141);
            lb_result.Name = "lb_result";
            lb_result.Size = new Size(42, 19);
            lb_result.TabIndex = 11;
            lb_result.Text = "결과";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(lb_result);
            Controls.Add(tb_num2);
            Controls.Add(tb_num1);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(button5);
            Controls.Add(button4);
            Controls.Add(button3);
            Controls.Add(button2);
            Controls.Add(tb);
            Controls.Add(button1);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Button button1;
        private TextBox tb;
        private Button button2;
        private Button button3;
        private Button button4;
        private Button button5;
        private Label label2;
        private Label label3;
        private TextBox tb_num1;
        private TextBox tb_num2;
        private Label lb_result;
    }
}
