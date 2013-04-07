package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;
import ar.edu.untdf.labprog.tp1.ejer1.MysqlConn;

public class QueryMysql extends Query{

	
	Conn getConn() {
		return new MysqlConn();
	}

}
