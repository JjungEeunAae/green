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

namespace MdiProject.todo
{
    public partial class TodoForm : Form
    {
        private static TodoForm instance = null;


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
        }
    }
}
