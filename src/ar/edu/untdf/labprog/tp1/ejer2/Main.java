package ar.edu.untdf.labprog.tp1.ejer2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MsSqlServerAdapter mssqlserver = new MsSqlServerAdapter();
		mssqlserver.connect();
		mssqlserver.query();
	}

}
