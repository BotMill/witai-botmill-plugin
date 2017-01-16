/*
 * 
 */
package co.aurasphere.botmill.witaiplg;

public class WitAiPluginContext {
	
	private static String token;
	
	public static void setToken(String tokenInput) {
		token = tokenInput;
	}
	
	public static String getToken(){
		return token;
	}
}
