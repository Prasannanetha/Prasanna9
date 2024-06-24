package collections;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer>countryCodes=new LinkedHashMap<String,Integer>();
		countryCodes.put("South Korea", 82);
		countryCodes.put("Ukraine", 380);
		countryCodes.put("Georgia", 995);
		countryCodes.put("Brazil",55);
		countryCodes.put("Maldives", 960);
		countryCodes.put("Italy", 39);
		

		System.out.println(countryCodes);
		System.out.println(countryCodes.values());
	}

}
