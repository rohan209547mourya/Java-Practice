package problem3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Map<String, String> obj = new LinkedHashMap<>();
		
		obj.put("Goa", "Panaji");
		obj.put("Odisha", "Bhubanswar");
		obj.put("Bihar" ,"patna");
		obj.put("Utter Pardesh", "Lucknow");
		obj.put("Punjab", "Chandigarh");
		
		
		Set<String> keys = obj.keySet();
		
		for(String key : keys) {
			
			System.out.println(key + " =========> " + obj.get(key));
		}
	}
}
