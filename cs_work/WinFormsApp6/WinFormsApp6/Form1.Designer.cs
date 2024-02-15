namespace WinFormsApp6
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
            components = new System.ComponentModel.Container();
            panel1 = new Panel();
            panel2 = new Panel();
            panel3 = new Panel();
            panel4 = new Panel();
            timer1 = new System.Windows.Forms.Timer(components);
            label1 = new Label();
            SuspendLayout();
            // 
            // panel1
            // 
            panel1.BackColor = Color.IndianRed;
            panel1.Location = new Point(115, 36);
            panel1.Name = "panel1";
            panel1.Size = new Size(129, 173);
            panel1.TabIndex = 0;
            // 
            // panel2
            // 
            panel2.BackColor = Color.IndianRed;
            panel2.Location = new Point(266, 36);
            panel2.Name = "panel2";
            panel2.Size = new Size(129, 173);
            panel2.TabIndex = 1;
            // 
            // panel3
            // 
            panel3.BackColor = Color.IndianRed;
            panel3.Location = new Point(417, 36);
            panel3.Name = "panel3";
            panel3.Size = new Size(129, 173);
            panel3.TabIndex = 2;
            // 
            // panel4
            // 
            panel4.BackColor = Color.IndianRed;
            panel4.Location = new Point(568, 36);
            panel4.Name = "panel4";
            panel4.Size = new Size(129, 173);
            panel4.TabIndex = 3;
            // 
            // timer1
            // 
            timer1.Interval = 1000;
            timer1.Tick += timer1_Tick;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("한컴 말랑말랑 Regular", 27.75F, FontStyle.Italic, GraphicsUnit.Point, 129);
            label1.Location = new Point(115, 259);
            label1.Name = "label1";
            label1.Size = new Size(118, 47);
            label1.TabIndex = 4;
            label1.Text = "label1";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label1);
            Controls.Add(panel4);
            Controls.Add(panel3);
            Controls.Add(panel2);
            Controls.Add(panel1);
            Name = "Form1";
            Text = "Form1";
            KeyDown += Form1_KeyDown;
            KeyUp += Form1_KeyUp;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Panel panel1;
        private Panel panel2;
        private Panel panel3;
        private Panel panel4;
        private System.Windows.Forms.Timer timer1;
        private Label label1;
    }
}
