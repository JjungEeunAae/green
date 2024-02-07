using Oracle.ManagedDataAccess.Client;
using System.Data;

namespace ex240207
{
    public partial class Form1 : Form
    {
        string strConnection = "Data Source=(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=xe)));User Id=hr;Password=1234;";
        OracleConnection conn;
        OracleCommand cmd;

        public Form1()
        {
            InitializeComponent();

            // 주석처리 단축키 ctrl + k + c

            // mbox 치고 tab -> tab 치면 됨
            MessageBox.Show(strConnection);
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            conn = new OracleConnection(strConnection);

            conn.Open();   // database 열기

            DataSet dataSet = new DataSet();
            string sql = "select * from emp";

            OracleDataAdapter adapter = new OracleDataAdapter();
            adapter.SelectCommand = new OracleCommand(sql, conn);
            adapter.Fill(dataSet);

            //MessageBox.Show(dataSet.Tables[0].ToString());
            dataGridView1.DataSource = dataSet.Tables[0];

            conn.Close();   // database 닫기

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
