import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords() {
		
		loginInfo.put("Chun", "steak");
		loginInfo.put("Stephanie", "ramen");
		loginInfo.put("Maria", "meat");
		loginInfo.put("Debby", "bread");
		
	}
 	
	protected HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}
	
}
