package ar.edu.untdf.labprog.tp1.ejer6;

public class Conected implements FtpState{

	Ftp ftp;

	public Conected(Ftp newftp) {
		this.ftp = newftp;
	}
	
	@Override
	public void checkUser(String ruser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPasswd(String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFile() {
		// TODO Auto-generated method stub
		return ftp.getArchivo();
	}

	@Override
	public void close() {
        System.out.println("Conexion cerrada");
		
	}

}
