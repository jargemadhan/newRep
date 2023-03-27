package stream;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
public class UseMobile {
	public static void main(String[]args) {

	Mobile m1=new Mobile("Samsung",70000,"120GP","snapdragon800",true);
	Mobile m2=new Mobile("Oneplus",60000,"120GP","snapdragon800",true);
	Mobile m3=new Mobile("Apple",130000,"120GP","IOS",false);
	Mobile m4=new Mobile("Vivo",45000,"120GP","snapdragon780",true);
	Mobile m5=new Mobile("Oppo",40000,"80GP","snapdragon780",true);
	Mobile m6=new Mobile("Nothing",40000,"120GP","snapdragon800",true);
	Mobile m7=new Mobile("realMe",38000,"80GP","snapdragon750",true);
	Mobile m8=new Mobile("Redmi",40000,"120GP","snapdragon800",true);
	HashMap<String,Mobile> mobiles=new HashMap<>();
	mobiles.put(m1.getBrand(), m1);
	mobiles.put(m2.getBrand(), m2);
 	mobiles.put(m3.getBrand(), m3);
 	mobiles.put(m4.getBrand(), m4);
 	mobiles.put(m5.getBrand(), m5);
 	mobiles.put(m6.getBrand(), m6);
 	mobiles.put(m7.getBrand(), m7);
 	mobiles.put(m8.getBrand(), m8);
 	//Map<String,Mobile> mob=m.values().stream().collect(Collectors.toMap(x->x.getBrand,y->y));
 	List<Mobile>m=mobiles.values().stream().filter(x->x.isAndriod()==true&&x.getRam().equalsIgnoreCase("120GP")).collect(Collectors.toList());
    Map<String,Mobile>mob=m.stream().collect(Collectors.toMap(x->x.getBrand(),y->y));
 	//List<String>brand=m.stream().map(x->x.getBrand()).collect(Collectors.toList());
 	//brand.forEach((k)->System.out.println(k));
	mob.values().forEach((k)->System.out.println(k));

}
}