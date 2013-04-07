package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;
import ar.edu.untdf.labprog.tp1.ejer1.OracleConn;

public class QueryOracle extends Query{

	@Override
	Conn getConn() {
		return new OracleConn();
	}
	

}
