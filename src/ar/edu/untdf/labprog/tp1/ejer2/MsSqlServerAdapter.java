package ar.edu.untdf.labprog.tp1.ejer2;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;

public class MsSqlServerAdapter implements Conn{

	private MsSqlServer mssqlserver = new MsSqlServer();
	
	
	@Override
	public void connect() {
		this.mssqlserver.getConnect();
	}

	@Override
	public void query() {
		this.mssqlserver.ExecuteQuery();
	}

}
