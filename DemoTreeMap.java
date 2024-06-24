package collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> TM= new TreeMap<Integer,String>();
		TM.put(100,"Cognizant");
		TM.put(200,"Accenture");
		TM.put(300,"Wipro");
		TM.put(400,"Amazon");
		TM.put(500,"Infosys");
		TM.put(600,"TCS");
		TM.put(-700, "Delloitte");
		
		TM.put(000,null);

		System.out.println(TM);
		System.out.println(TM.values());
		

	}

}
