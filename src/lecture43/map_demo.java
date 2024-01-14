package lecture43;
import java.util.*;
public class map_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> map = new HashMap<>();
map.put("Mohini", 78);
map.put("Hunir", 98);
map.put("Raja", 88);
map.put("Nandini", 55);
map.put("Amisha", 48);
map.put("Kunal", 78);
map.put("Ankit", 69);
map.put("Ankita", 53);
map.put("Ankit", 99);
map.put(null, 89);  //null as a key daal sakte hai parr ek hi hoga value bahooot saari daal sakte hai
// hashmap ko implement karne ke liye linkedlist use kiya gaya hai
System.out.println(map);
//get O(1)
System.out.println(map.get("Ankita"));
System.out.println(map.get("Atul"));

//containskey O(1)
System.out.println(map.containsKey("Ankita"));
System.out.println(map.containsKey("Pintu"));

//remove O(1)
System.out.println(map.remove("Puneet"));
System.out.println(map.remove("Palak"));
System.out.println(map);
for(String key : map.keySet()) {
	System.out.println(key + " " +map.get(key));
}
//Size O(1)
System.out.println(map.size());

TreeMap<String, Integer> map1 = new TreeMap<>();
//tree map mai soted hota hai complexity O(logn) treemap ko red black use kara hai
//treemap mai null as a key nahi daal sakte null pointer exception dega
map1.put("Mohini", 78);
map1.put("Hunir", 98);
map1.put("Raja", 88);
map1.put("Nandini", 55);
map1.put("Amisha", 48);
map1.put("Kunal", 78);
map1.put("Ankit", 69);
map1.put("Ankita", 53);
map1.put("Ankit", 99);
//map1.put(null, 77);
System.out.println(map1);

LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
//add O(1)
map2.put("Mohini", 78);
map2.put("Hunir", 98);
map2.put("Raja", 88);
map2.put("Nandini", 55);
map2.put("Amisha", 48);
map2.put("Kunal", 78);
map2.put("Ankit", 69);
map2.put("Ankita", 53);
map2.put("Ankit", 99);
map2.put(null, 77);
System.out.println(map2);


	}

}
