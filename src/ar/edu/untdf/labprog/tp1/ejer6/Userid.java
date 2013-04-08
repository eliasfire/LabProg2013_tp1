package ar.edu.untdf.labprog.tp1.ejer6;

public class Userid implements FtpState {

	Ftp ftp;

	public Userid(Ftp newftp) {
		this.ftp = newftp;
	}

	@Override
	public void checkUser(String ruser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkPasswd(String pass) {
		if (pass.equals(ftp.getPasswd())) {
			System.out.println("Password correcta!");
			ftp.setEstado(ftp.getConected());
			System.out.println("Usted tiene acceso al siguiente archivo: " + ftp.getArchivo());
		} else {
			System.out.println("Password incorrecto!");
			ftp.setEstado(ftp.getStart());
			ftp.close();
		}
	}

	@Override
	public String getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
        System.out.println("Conexion cerrada");

	}

}
