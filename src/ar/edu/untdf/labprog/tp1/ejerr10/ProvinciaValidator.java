package ar.edu.untdf.labprog.tp1.ejerr10;

import java.util.Arrays;

import ar.edu.untdf.labprog.tp1.ejer9.FieldValidator;

public class ProvinciaValidator implements FieldValidator{

	String provincias[] = {"Ciudad de Buenos Aires","Buenos Aires","Catamarca","Chaco","Chubut",
			   "Cordoba","Corrientes","Entre Rios","Formosa","Jujuy","La Pampa","La Rioja","Mendoza",
			   "Misiones","Neuquen","Rio Negro","Salta","San Juan","San Luis","Santa Cruz","Santa Fe",
			   "Santiago del Estero","Tierra del Fuego","Tucuman"};
	@Override
	public String validate(String provincia) {
		if(isValid(provincia)){
			return "Provincia correcta";
        }else{
        	return "Provincia incorrecta";
        }
	}

	@Override
	public boolean isValid(String provincia) {
		Arrays.sort(provincias);
		int idx = Arrays.binarySearch(provincias, provincia);
		if (idx >= 0) { 
		return true;}
		else 
		return false;
		
	}

}
