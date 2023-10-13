
import java.util.HashMap;


public class GFG {


	public static void main(String[] args)
	{
		
		HashMap<String, Integer> map = new HashMap<>();

	
		map.put("Universe", 10);
		map.put("Chaya", 30);
		map.put("Ramana", 20);

		
		System.out.println("Size of map is:- "
						+ map.size());

		System.out.println(map);

	
		if (map.containsKey("Universe")) {

	
			Integer a = map.get("Universe");


			System.out.println("value for key"
							+ " \"Universe\" is:- " + a);
		}
	}
}
