using MdiProject.todo;
using MdiProject.user;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MdiProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
            this.IsMdiContainer = true; // mdi 형식으로 만드는 코드
        }

        private void 사용자관리ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //UserForm userform = new UserForm();

            // 메인 폼에 userForm이 존재하면 더 이상 userForm이 생기지 않도록.
            // = 메모리상에 자원을 낭비하지 않도록 만듦
            UserForm userform = UserForm.getInstance();
            userform.MdiParent = this;
            userform.Show();
        }

        private void 할일관리ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //TodoForm todoform = new TodoForm();
            TodoForm todoform = TodoForm.getInstance();
            todoform.MdiParent = this;
            todoform.Show();
        }

        private void 종료ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // 개체가 더 이상 필요하지 않을 때 리소스를 해제하는 메서드
            Dispose();
        }
    }
}
