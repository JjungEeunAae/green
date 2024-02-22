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
                    
                    list.Add(reader["str"].ToString());
                }

            }
            con.Close();

            return list;
        }

        internal void update(string selectedString, string updateStr)
        {
            string connectionString = "DATA SOURCE=127.0.0.1; User Id=hr; Password=1234";

            // DB 연결...
            OracleConnection con = new OracleConnection(connectionString);
            con.Open();  // db 열기

            // sql 구문 만들기
            OracleCommand oracleCommand = new OracleCommand($" update filetb set str='{updateStr}' where str='{selectedString}'", con);

            // 실행하기
            oracleCommand.ExecuteNonQuery();

            con.Close();  // db 닫기
        }
    }
}
