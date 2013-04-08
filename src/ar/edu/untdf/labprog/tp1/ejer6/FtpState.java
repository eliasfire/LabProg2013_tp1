package ar.edu.untdf.labprog.tp1.ejer6;

public interface FtpState {
	 
	public void checkUser(String ruser);
	public void checkPasswd(String pass);
	public String getFile();
    public void close();
    
}