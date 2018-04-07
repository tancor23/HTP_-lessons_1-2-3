package by.htp.carparking.web.util;

public class HTPRequestParamValidator {

	private HTPRequestParamValidator() {}
	
	public static void validateRequestParamNotNull(String ... str) {
		for(String s : str) {
			if(s==null) {
				throw new ValidateNullParamException("Empty parameter recieved");
			}
		}
	}

}
