namespace MdiProject.todo
{
    partial class TodoForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(TodoForm));
            System.Windows.Forms.Panel compl_panel;
            this.panel1 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.insertBtn = new System.Windows.Forms.Button();
            this.dateTimePicker_finishDate = new System.Windows.Forms.DateTimePicker();
            this.label7 = new System.Windows.Forms.Label();
            this.textBox_content = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.comboBox_userIdx = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.textBox_title = new System.Windows.Forms.TextBox();
            this.compl_panel = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.panel3.SuspendLayout();
            this.compl_panel.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.AutoScroll = true;
            this.panel1.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("panel1.BackgroundImage")));
            this.panel1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.panel1.Controls.Add(this.label1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(350, 564);
            this.panel1.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.Location = new System.Drawing.Point(0, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(100, 23);
            this.label1.TabIndex = 0;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("국민연금체 Regular", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label2.Location = new System.Drawing.Point(6, 6);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(61, 35);
            this.label2.TabIndex = 1;
            this.label2.Text = "완료";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("국민연금체 Regular", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label3.Location = new System.Drawing.Point(6, 6);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(61, 35);
            this.label3.TabIndex = 2;
            this.label3.Text = "기재";
            // 
            // panel3
            // 
            this.panel3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.panel3.Controls.Add(this.insertBtn);
            this.panel3.Controls.Add(this.dateTimePicker_finishDate);
            this.panel3.Controls.Add(this.label7);
            this.panel3.Controls.Add(this.textBox_content);
            this.panel3.Controls.Add(this.label6);
            this.panel3.Controls.Add(this.label5);
            this.panel3.Controls.Add(this.comboBox_userIdx);
            this.panel3.Controls.Add(this.label4);
            this.panel3.Controls.Add(this.textBox_title);
            this.panel3.Controls.Add(this.label3);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Right;
            this.panel3.Location = new System.Drawing.Point(798, 0);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(339, 564);
            this.panel3.TabIndex = 2;
            // 
            // insertBtn
            // 
            this.insertBtn.Font = new System.Drawing.Font("온글잎 밑미 Regular", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.insertBtn.Location = new System.Drawing.Point(188, 474);
            this.insertBtn.Name = "insertBtn";
            this.insertBtn.Size = new System.Drawing.Size(116, 48);
            this.insertBtn.TabIndex = 11;
            this.insertBtn.Text = "입력";
            this.insertBtn.UseVisualStyleBackColor = true;
            this.insertBtn.Click += new System.EventHandler(this.insertBtn_Click);
            // 
            // dateTimePicker_finishDate
            // 
            this.dateTimePicker_finishDate.Font = new System.Drawing.Font("KCC-차쌤체", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.dateTimePicker_finishDate.Location = new System.Drawing.Point(21, 414);
            this.dateTimePicker_finishDate.Name = "dateTimePicker_finishDate";
            this.dateTimePicker_finishDate.Size = new System.Drawing.Size(283, 27);
            this.dateTimePicker_finishDate.TabIndex = 10;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("온글잎 밑미 Regular", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label7.Location = new System.Drawing.Point(17, 391);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(92, 20);
            this.label7.TabIndex = 9;
            this.label7.Text = "FINISH DATE";
            // 
            // textBox_content
            // 
            this.textBox_content.Font = new System.Drawing.Font("KCC-차쌤체", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.textBox_content.Location = new System.Drawing.Point(21, 202);
            this.textBox_content.Multiline = true;
            this.textBox_content.Name = "textBox_content";
            this.textBox_content.Size = new System.Drawing.Size(283, 157);
            this.textBox_content.TabIndex = 8;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("온글잎 밑미 Regular", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label6.Location = new System.Drawing.Point(17, 179);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(73, 20);
            this.label6.TabIndex = 7;
            this.label6.Text = "CONTENT";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("온글잎 밑미 Regular", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label5.Location = new System.Drawing.Point(19, 120);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(48, 20);
            this.label5.TabIndex = 6;
            this.label5.Text = "TITLE";
            // 
            // comboBox_userIdx
            // 
            this.comboBox_userIdx.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.comboBox_userIdx.Font = new System.Drawing.Font("KCC-차쌤체", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.comboBox_userIdx.FormattingEnabled = true;
            this.comboBox_userIdx.Location = new System.Drawing.Point(79, 64);
            this.comboBox_userIdx.Name = "comboBox_userIdx";
            this.comboBox_userIdx.Size = new System.Drawing.Size(225, 28);
            this.comboBox_userIdx.TabIndex = 5;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("온글잎 밑미 Regular", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label4.Location = new System.Drawing.Point(23, 69);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(42, 20);
            this.label4.TabIndex = 4;
            this.label4.Text = "USER";
            // 
            // textBox_title
            // 
            this.textBox_title.Font = new System.Drawing.Font("KCC-차쌤체", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.textBox_title.Location = new System.Drawing.Point(79, 115);
            this.textBox_title.Name = "textBox_title";
            this.textBox_title.Size = new System.Drawing.Size(225, 27);
            this.textBox_title.TabIndex = 3;
            // 
            // compl_panel
            // 
            this.compl_panel.AutoScroll = true;
            this.compl_panel.Controls.Add(this.label2);
            this.compl_panel.Dock = System.Windows.Forms.DockStyle.Fill;
            this.compl_panel.Location = new System.Drawing.Point(350, 0);
            this.compl_panel.Name = "compl_panel";
            this.compl_panel.Size = new System.Drawing.Size(787, 564);
            this.compl_panel.TabIndex = 1;
            // 
            // TodoForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1137, 564);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.compl_panel);
            this.Controls.Add(this.panel1);
            this.Name = "TodoForm";
            this.Text = "TodoForm";
            this.panel1.ResumeLayout(false);
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.compl_panel.ResumeLayout(false);
            this.compl_panel.PerformLayout();
            this.ResumeLayout(false);

        }
        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel compl_panel;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox textBox_title;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.ComboBox comboBox_userIdx;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBox_content;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DateTimePicker dateTimePicker_finishDate;
        private System.Windows.Forms.Button insertBtn;
    }
}