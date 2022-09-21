package problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
	
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
	
	
	public String addMobile(String company , String model) {
		
		if(mobiles.containsKey(company)) {
			
			ArrayList<String> temp = mobiles.get(company);
			
			temp.add(model);
			
			mobiles.put(company, temp);
		}
		else {
			
			ArrayList<String> temp = new ArrayList<>();
			
			temp.add(model);
			mobiles.put(company, temp);
		}
		
		return "Moblie Added Successfully";
		
	}
	
	public List<String> getModels(String company) {
		
		if(mobiles.containsKey(company)) {
			
			return mobiles.get(company);
		}
		else {
			
			return new ArrayList<>();
		}
	}
	
	public static void main(String[] args) {
		
		Mobile m1 = new  Mobile();
		
		m1.addMobile("Mi", "Poco M3");
		m1.addMobile("Apple", "iPhone 13");
		m1.addMobile("Apple", "iPhone 14");
		m1.addMobile("Mi", "Mi 10T");
		m1.addMobile("oneplus", "oneplus nord 2");
		
		List<String> res = m1.getModels("Apple");
		System.out.println(res);
		
	}

}
