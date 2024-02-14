using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WinFormsApp4
{
    internal class Friend
    {
        String name;

        public Friend(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public override String ToString() 
        {
            return $"Friend name = {name}";
        }
    }
}
