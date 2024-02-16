namespace WinFormsApp2_class
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            textBox1 = new TextBox();
            button1 = new Button();
            button2 = new Button();
            textBox2 = new TextBox();
            button3 = new Button();
            textBox3 = new TextBox();
            SuspendLayout();
            // 
            // textBox1
            // 
            textBox1.Font = new Font("경기천년제목 Light", 9F);
            textBox1.Location = new Point(421, 419);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(236, 19);
            textBox1.TabIndex = 0;
            textBox1.TextChanged += textBox1_TextChanged;
            textBox1.KeyUp += textBox1_KeyUp;
            // 
            // button1
            // 
            button1.BackgroundImage = (Image)resources.GetObject("button1.BackgroundImage");
            button1.BackgroundImageLayout = ImageLayout.Stretch;
            button1.Font = new Font("경기천년제목 Bold", 18F, FontStyle.Bold, GraphicsUnit.Point, 129);
            button1.Location = new Point(663, 309);
            button1.Name = "button1";
            button1.Size = new Size(125, 129);
            button1.TabIndex = 1;
            button1.Text = "자동차추가";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.BackgroundImage = (Image)resources.GetObject("button2.BackgroundImage");
            button2.BackgroundImageLayout = ImageLayout.Stretch;
            button2.Font = new Font("경기천년제목 Bold", 18F, FontStyle.Bold, GraphicsUnit.Point, 129);
            button2.Location = new Point(421, 284);
            button2.Name = "button2";
            button2.Size = new Size(125, 129);
            button2.TabIndex = 3;
            button2.Text = "자동차추가";
            button2.UseVisualStyleBackColor = true;
            // 
            // textBox2
            // 
            textBox2.Font = new Font("경기천년제목 Light", 9F);
            textBox2.Location = new Point(552, 284);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(236, 19);
            textBox2.TabIndex = 2;
            // 
            // button3
            // 
            button3.BackgroundImage = (Image)resources.GetObject("button3.BackgroundImage");
            button3.BackgroundImageLayout = ImageLayout.Stretch;
            button3.Font = new Font("경기천년제목 Bold", 18F, FontStyle.Bold, GraphicsUnit.Point, 129);
            button3.Location = new Point(663, 149);
            button3.Name = "button3";
            button3.Size = new Size(125, 129);
            button3.TabIndex = 5;
            button3.Text = "자동차추가";
            button3.UseVisualStyleBackColor = true;
            // 
            // textBox3
            // 
            textBox3.Font = new Font("경기천년제목 Light", 9F);
            textBox3.Location = new Point(421, 149);
            textBox3.Name = "textBox3";
            textBox3.Size = new Size(236, 19);
            textBox3.TabIndex = 4;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button3);
            Controls.Add(textBox3);
            Controls.Add(button2);
            Controls.Add(textBox2);
            Controls.Add(button1);
            Controls.Add(textBox1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private TextBox textBox1;
        private Button button1;
        private Button button2;
        private TextBox textBox2;
        private Button button3;
        private TextBox textBox3;
    }
}
