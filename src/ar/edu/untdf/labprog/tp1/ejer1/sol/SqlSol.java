package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;
import ar.edu.untdf.labprog.tp1.ejer1.MysqlConn;

public class SqlSol {

	public static void main(String args[]){
        Query conn = null;
        conn = new QueryMysql();
        Conn mysql = conn.getConn();
        mysql.connect();
        mysql.query();
        
    }
}