using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Data.SqlTypes;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;

namespace ex240220_File_InputAndOutput.database
{
    public class FileTBDataBase
    {
        private static string connectionString = "DATA SOURCE=127.0.0.1; User Id=hr; Password=1234";
        private static OracleConnection con = null;

        // ORACLE DB Connection
        public static OracleConnection connect() {
            if(con == null)
            {
                con = new OracleConnection(connectionString);
                con.Open();
            }
            else
            {
                con.Open();
            }
            return con;
        }

        public void insert(string text)
        {
            OracleConnection con = connect();

            string sql = "INSERT INTO filetb (str) VALUES (:text)";

            using(OracleCommand command = new OracleCommand(sql, con))
            {
                command.Parameters.Add(":text", text);
                int rowId = command.ExecuteNonQuery();
                Console.WriteLine($" {rowId} 행을 삽입했습니다!");

            }
            con.Close();
        }

        internal List<string> read()
        {
            List<string> list = new List<string>();

            OracleConnection con = connect();

            string sql = "SELECT str FROM filetb";

            using (OracleCommand command = new OracleCommand(sql, con))
            {
                OracleDataReader reader = command.ExecuteReader();
                while(reader.Read())
                {
                    list.Add(reader.GetString(0));
                }

            }
            con.Close();

            return list;
        }
    }
}
