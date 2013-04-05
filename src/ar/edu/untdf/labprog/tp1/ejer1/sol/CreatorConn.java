package ar.edu.untdf.labprog.tp1.ejer1.sol;

import ar.edu.untdf.labprog.tp1.ejer1.Conn;
import ar.edu.untdf.labprog.tp1.ejer1.MysqlConn;
import ar.edu.untdf.labprog.tp1.ejer1.OracleConn;
import ar.edu.untdf.labprog.tp1.ejer1.PostgresConn;

public abstract class CreatorConn{
    // Operación que realiza 
    public Conn  anOperation() {
 
        return factoryMethod();
    }
 
    // Definimos método abstracto
    public abstract MysqlConn factoryMethod();
    public abstract OracleConn factoryMethod2();
    public abstract PostgresConn factoryMethod3();
    
}