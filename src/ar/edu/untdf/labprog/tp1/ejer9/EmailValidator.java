package ar.edu.untdf.labprog.tp1.ejer9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements FieldValidator{

	

	@Override
	public String validate(String email) {
		if(isValid(email)){
			return "Mail correcto";
        }else{
        	return "Mail incorrecto";
        }
		
	}

	@Override
	public boolean isValid(String email) {
		// Establecer el patron
	    Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");

	    // Asociar el string al patron
	    Matcher m = p.matcher(email);

	   // Comprobar si encaja
	   return m.matches();
	}

}
