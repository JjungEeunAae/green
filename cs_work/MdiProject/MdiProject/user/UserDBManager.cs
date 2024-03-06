using MdiProject.database;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MdiProject.user
{
    public class UserDBManager
    {
        public UserDBManager() { }

        // 삽입기능
        public bool insert(Users user)
        {
            try
            {
                OracleConnection con = DBINFO.openConnect();

                string sql = "INSERT INTO users " +
                                "(idx, email, addr, password, name) " +
                            "VALUES " +
                                "(usersidx.NEXTVAL, :email, :addr, :password, :name)";
                OracleCommand cmd = new OracleCommand(sql,con);
                cmd.Parameters.Clear();
                cmd.Parameters.Add(":email", user.Email);
                cmd.Parameters.Add(":addr", user.Addr);
                cmd.Parameters.Add(":password", user.Password);
                cmd.Parameters.Add(":name", user.Name);
                cmd.ExecuteNonQuery();

                return true;
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
                return false;
            }
            finally
            {
                DBINFO.closeConnect();
            }
        }

        // 수정기능
        public void update(Users user)
        {

        } 

        // 삭제기능
        public void delete(Users user)
        {

        }

        // 조회기능
        public DataTable select()
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();

                string sql = "SELECT * FROM users";

                OracleDataAdapter adapter = new OracleDataAdapter();
                DataSet ds = new DataSet();

                OracleCommand cmd = new OracleCommand(sql, conn);
                adapter.SelectCommand = cmd;

                adapter.Fill(ds);

                return ds.Tables[0];
            } 
            catch(Exception e)
            {
                Console.WriteLine(e.StackTrace);
                Console.WriteLine(e.Message);
                return null;
            }
            finally
            {
                DBINFO.closeConnect();
            }
        }

        public List<String> selectUserId()
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();

                string sql = "SELECT idx FROM users";

                OracleDataAdapter adapter = new OracleDataAdapter();
                DataSet ds = new DataSet();

                OracleCommand cmd = new OracleCommand(sql, conn);
                adapter.SelectCommand = cmd;

                adapter.Fill(ds);

                List<string> list = new List<string>();
                foreach(DataRow dr in ds.Tables[0].Rows)
                {
                    list.Add(dr["idx"].ToString());
                }
                return list;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.StackTrace);
                Console.WriteLine(e.Message);
                return null;
            }
            finally
            {
                DBINFO.closeConnect();
            }
        }
    }
}
