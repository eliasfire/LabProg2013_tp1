package ar.edu.untdf.labprog.tp1.ejer6;

public class Start implements FtpState{

	Ftp ftp;
	
	public Start(Ftp newftp) {
		this.ftp = newftp;
	}

	public void checkUser(String ruser) {
		System.out.println("Bienvenido");
        System.out.println("Chequeando usuario");
        if (ruser.equals(ftp.getUser())) {
        	ftp.setEstado(ftp.getUserid());
            System.out.println("Ingrese su clave");
        } else {
            System.out.println("Usuario incorrecto");
        	ftp.setEstado(ftp.getStart());
        }
	}

	public void checkPasswd(String pass) {
	}

	public String getFile() {
		return null;
	}

	public void close() {
        System.out.println("Conexion cerrada");
		
	}

}
