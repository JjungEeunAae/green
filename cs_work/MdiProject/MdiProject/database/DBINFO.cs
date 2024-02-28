using Oracle.ManagedDataAccess.Client;

namespace MdiProject.database
{
    public class DBINFO
    {
        public static string dbstr = "DATA SOURCE=localhost; User Id=usertodo; Password=1234";
        public static OracleConnection conn = null;

        public static OracleConnection openConnect()
        {
            if(conn == null)
            {
                conn = new OracleConnection(dbstr);
                conn.Open();
            } else
            {
                conn.Open();
            }
           return conn;
        }

        public static void closeConnect()
        {
            if( conn != null)
            {
                conn.Close();
                conn.Dispose();
                conn = null;
            }
        }

    }
}
