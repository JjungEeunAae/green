namespace WinFormsApp7
{
    partial class FirstCustomControl
    {
        /// <summary> 
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region 구성 요소 디자이너에서 생성한 코드

        /// <summary> 
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            label3 = new Label();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("한컴 말랑말랑 Regular", 12F, FontStyle.Regular, GraphicsUnit.Point, 129);
            label1.Location = new Point(417, 100);
            label1.Name = "label1";
            label1.Size = new Size(51, 21);
            label1.TabIndex = 0;
            label1.Text = "label1";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Rosewood Std Regular", 72F, FontStyle.Bold, GraphicsUnit.Point, 0);
            label2.ForeColor = Color.FromArgb(255, 192, 128);
            label2.Location = new Point(25, 63);
            label2.Name = "label2";
            label2.Size = new Size(191, 112);
            label2.TabIndex = 0;
            label2.Text = "$19";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("한컴 말랑말랑 Bold", 12F, FontStyle.Bold, GraphicsUnit.Point, 129);
            label3.ForeColor = Color.FromArgb(255, 192, 128);
            label3.Location = new Point(25, 42);
            label3.Name = "label3";
            label3.Size = new Size(48, 21);
            label3.TabIndex = 0;
            label3.Text = "Only";
            // 
            // FirstCustomControl
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            Controls.Add(label2);
            Controls.Add(label3);
            Controls.Add(label1);
            Name = "FirstCustomControl";
            Size = new Size(695, 335);
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Label label3;
    }
}
