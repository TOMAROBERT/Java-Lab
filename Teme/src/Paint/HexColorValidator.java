package Paint;

import java.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValidator {
	public static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
	
	Boolean valCuloare(String hex) {
		
		Pattern pattern = Pattern.compile(HEX_PATTERN);
		Matcher matcher = pattern.matcher(hex);
		return matcher.matches();

	}
	Boolean valPat(double p) {
		boolean var =true;
		if(p<0) { 
			var=false;
			throw new IllegalArgumentException("Numar negativ");
		}else {
			return var;
		}
	}
	
	Boolean valDrep(double p) {
		boolean var =true;
		if(p<0) { 
			var=false;
			throw new IllegalArgumentException("Numar negativ");
		}else {
			return var;
		}
	}
	
	Boolean valCerc(double p) {
		boolean var =true;
		if(p<0) { 
			var=false;
			throw new IllegalArgumentException("Numar negativ");
		}else {
			return var;
		}
	}
}
