using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Drawing.Text;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace autoid_crud.db
{
    public class CRUD
    {
        private static string getConnection()
        {
            string dbStr = "DATA SOURCE=localhost; User Id=hr; Password=1234";
            return dbStr;
        }

        public static OracleConnection con = new OracleConnection(getConnection());
        public static OracleCommand cmd = new OracleCommand();
        public static string sql = "";
    }
}
