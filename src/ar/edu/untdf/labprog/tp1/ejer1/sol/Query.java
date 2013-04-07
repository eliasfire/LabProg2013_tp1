/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;
import ar.edu.untdf.labprog.tp1.ejer1.*;
/**
 *
 * @author matiasgel
 */
public abstract class Query {

	abstract Conn getConn();
	
	
	public void update(){
		Conn conn=getConn();
		//......
		}
	
	public void del(){
		Conn conn=getConn();
		//......
		}
    public void query() {
        Conn conn=getConn();
    	conn.connect();
        conn.query();
    }
}