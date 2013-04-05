package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.MysqlConn;

public class SqlSol {

	public static void main(String args[]){
        CreatorConn conn = null;
        conn = new ConcreteCreatorConn();
        MysqlConn mysql = conn.factoryMethod();
        mysql.connect();
        mysql.query();
        
    }
}