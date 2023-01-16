package misc;

import java.text.DecimalFormat;

public class CatcherUtil {
	
	
	public static boolean validNote(double note) {
		if(note < 0 || note > 100) {
			return false;
		}else {
			return true;
		}
		
		
		
	}
	
	
	public static String cutDecimals(double num) {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(num);
	}
	
	

}
