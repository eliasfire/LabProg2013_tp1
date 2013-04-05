package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;
import ar.edu.untdf.labprog.tp1.ejer1.MysqlConn;
import ar.edu.untdf.labprog.tp1.ejer1.OracleConn;
import ar.edu.untdf.labprog.tp1.ejer1.PostgresConn;

public class SqlSol {

	public static void main(String args[]){
        CreatorConn conn = null;
        conn = new ConcreteCreatorConn();
        MysqlConn mysql = conn.factoryMethod();
        mysql.connect();
        mysql.query();
        
    }
}