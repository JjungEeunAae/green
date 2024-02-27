using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MdiProject.user
{
    public partial class UserForm : Form
    {
        private static UserForm instance = null;


        // 메인 폼에 userForm이 존재하면 더 이상 userForm이 생기지 않도록.
        public static UserForm getInstance()
        {
            if(instance == null || instance.IsDisposed)
            {
                instance = new UserForm();
                return instance;
            } else
            {
                return instance;
            }
        }

        public UserForm()
        {
            InitializeComponent();
        }
    }
}
