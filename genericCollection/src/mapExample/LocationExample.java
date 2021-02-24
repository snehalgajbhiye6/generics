package mapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LocationExample {
	
	public static void main(String[] args)
	{
		List<String> pune=new ArrayList<>();
		pune.add("warje");
		
		HashMap<String,List<String>> mh=new HashMap<>();
		mh.put("Pune",pune);
		
		HashMap<String,HashMap<String,List<String>>> india=new HashMap<>();
		india.put("Maharashtra",mh);
		
		HashMap<String,HashMap<String,HashMap<String,List<String>>>> world=new HashMap<>();
		world.put("India",india);
		
		Set <String> country=world.keySet();
		for (String countryKey : country) {
			System.out.println(countryKey);
			
			HashMap<String,HashMap<String,List<String>>> setOfCountry=world.get(countryKey);
			
			Set<String> states=setOfCountry.keySet();
			for(String stateKey:states)
			{
				System.out.println("\t"+stateKey);
				
				HashMap<String,List<String>> setOfStates=setOfCountry.get(stateKey);
				
				Set<String> location=setOfStates.keySet();
				for(String locationKey:location)
				{
					System.out.println("\t\t"+locationKey);
					
					List<String> list=setOfStates.get(locationKey);
					for(String listKey:list)
					{
						System.out.println("\t\t\t"+listKey);
					}
				}
			}
		}
	}
}
