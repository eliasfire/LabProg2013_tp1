package ar.edu.untdf.labprog.tp1.ejer6;

/**
 * 
 * @author Abraham
 */
public class Ftp {

    FtpState start;
    FtpState userid;
    FtpState conected;

    FtpState estado;
    
    private String user = "admin";
    private String passwd = "1234";
    private final String archivo = "unarchivo.txt";

    
    public Ftp() {
    	
    	start = new Start(this);
    	userid = new Userid(this);
    	conected = new Conected(this);
    	
        estado = start;
    }
    
    
    public String getUser() {
		return user;
	}
    
	public String getPasswd() {	
		return passwd;	
	}

 	public String getArchivo() {
		return archivo;
	}


	public void checkUser(String ruser) {
       estado.checkUser(ruser);
    }
    
    public void checkPasswd(String pass) {
       estado.checkPasswd(pass);
    }

    public String getFile() {
       return estado.getFile();
    }
    
	public void close(){
		estado.close();
	}
	
	public void setEstado(FtpState estado) {
		this.estado = estado;
	}
    
    
	public FtpState getStart() {return start;}
	public FtpState getConected() {	return conected;}
	public FtpState getUserid() {	return userid;}

    /**
     * Verifica el usuario
     * @param ruser el usuario a verificar
     
    public void checkUser(String ruser) {
        if (estado.equals(FtpState.START)) {

            if (ruser.equals(user)) {
                estado = FtpState.USERID;
                System.out.println("Ingrese su clave");
            }
        } else {
            System.out.println("error, comando no esperado");
            this.estado = FtpState.START;
        }

    }

    public void checkPasswd(String pass) {
        if (estado.equals(FtpState.USERID)) {
            System.out.println("Bienvenido");
            if (pass.equals(passwd)) {
                estado = FtpState.CONECTED;
            }
        } else {
            System.out.println("error, comando no esperado");
            this.estado = FtpState.START;
        }

    }

    public String getFile() {
        if (estado.equals(FtpState.CONECTED)) {
            return archivo;
        } else {
            System.out.println("error, comando no esperado");
            this.estado = FtpState.START;
            return null;
        }
    }

    public void close() {
        estado = FtpState.START;
    }

   */
}
