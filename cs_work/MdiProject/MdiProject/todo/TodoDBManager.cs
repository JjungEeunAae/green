﻿using MdiProject.database;
using MdiProject.user;
using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MdiProject.todo
{
    public class TodoDBManager
    {
        public TodoDBManager() { }

        public DataTable select()
        {
            try
            {
                OracleConnection conn = DBINFO.openConnect();

                string sql = "SELECT * FROM todo ORDER BY 5 DESC";

                OracleDataAdapter adapter = new OracleDataAdapter();
                DataSet ds = new DataSet();

                OracleCommand cmd = new OracleCommand(sql, conn);
                adapter.SelectCommand = cmd;

                adapter.Fill(ds);

                return ds.Tables[0];
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

        public bool insert(Todo todo)
        {
            try
            {
                OracleConnection con = DBINFO.openConnect();

                string sql = "INSERT INTO TODO " +
                                "(IDX, USERS_IDX, TITLE, CONTENT, FINISHDATE) " +
                            "VALUES " +
                                "(todoidx.nextval, :useridx, :title, :content, :finishdate)";
                OracleCommand cmd = new OracleCommand(sql, con);
                cmd.Parameters.Clear();
                cmd.Parameters.Add(":useridx", todo.user_idx);
                cmd.Parameters.Add(":title", todo.title);
                cmd.Parameters.Add(":content", todo.content);
                cmd.Parameters.Add(":finishdate", todo.finishdate);
                cmd.ExecuteNonQuery();

                return true;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return false;
            }
            finally
            {
                DBINFO.closeConnect();
            }
        }

    }
}
