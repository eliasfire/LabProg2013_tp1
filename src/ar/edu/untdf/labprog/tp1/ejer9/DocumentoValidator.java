package ar.edu.untdf.labprog.tp1.ejer9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentoValidator implements FieldValidator{

	@Override
	public String validate(String documento) {
		if(isValid(documento)){
            return "DNI correcto";
        }else{
            return "DNI incorrecto";
        }		
	}

	@Override
	public boolean isValid(String documento) {
		Pattern dniPattern = Pattern.compile("(\\d{1,8})");
		Matcher m = dniPattern.matcher(documento);
		if(m.matches()){
			return true;
		}
		else
			return false;
	    }

	
}
