package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.MysqlConn;
import ar.edu.untdf.labprog.tp1.ejer1.OracleConn;
import ar.edu.untdf.labprog.tp1.ejer1.PostgresConn;

public class ConcreteCreatorConn extends CreatorConn{

	@Override
	public MysqlConn factoryMethod() {
		return new MysqlConn();
	}

	@Override
	public OracleConn factoryMethod2() {
		return new OracleConn();
	}

	@Override
	public PostgresConn factoryMethod3() {
		return new PostgresConn();
	}

}
