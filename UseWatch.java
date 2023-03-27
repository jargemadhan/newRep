package stream;
import java.util.ArrayList;
import java.util.Comparator;
public class UseWatch {
	public static void main(String[]args) {
		
	
	Watch w1=new Watch("Samsung","White",36000,true);
	Watch w2=new Watch("Apple","Gold",86000,true);
	Watch w3=new Watch("realme","Black",2500,false);
	Watch w4=new Watch("Bolt","White",5400,true);
	Watch w5=new Watch("Noise","Green",1800,false);
	Watch w6=new Watch("AmazonFit","Black",18000,true);
	Watch w7=new Watch("Redmi","White",2000,false);
	Watch w8=new Watch("Samsung","White",20000,true);
	ArrayList<Watch> watches=new ArrayList<>();
	watches.add(w1);
	watches.add(w2);
	watches.add(w3);
	watches.add(w4);
	watches.add(w5);
	watches.add(w6);
	watches.add(w7);
	watches.add(w8);
	//watches.stream().filter(x->x.getBrand().equalsIgnoreCase("samSung")).map(y->y.getColor()).forEach(z->System.out.println(z));;
	//watches.stream().map(x->x.getBrand()).forEach(y->System.out.println(y));
	//watches.stream().filter(x->x.isAnalog()==true).forEach(y->System.out.println(y));
	//watches.stream().map(x->x.getBrand()).forEach(y->System.out.println(y));
	//watches.stream().filter(x->x.getPrice()>20000).map(y->y.getColor()).forEach(z->System.out.println(z));
	//long count=watches.stream().filter(x->x.getColor().equalsIgnoreCase("Black")).count();
	//System.out.println(count);
	Integer max=watches.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(max);
	}
}
