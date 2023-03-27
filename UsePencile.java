package stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.util.List;
public class UsePencile {
public static void main(String[]args) {
	//Pencil p1=new Pencil(true,20,"black",1.3f);
	
	ArrayList<Pencil> penciles=new ArrayList<>();
	penciles.add(new Pencil("a",true,20,"black",1.3f));
	penciles.add(new Pencil("b",false,21,"Green",1.2f));
	penciles.add(new Pencil("c",true,22,"orange",1.4f));
	penciles.add(new Pencil("d",true,25,"pink",1.3f));
	penciles.add(new Pencil("e",false,27,"red",1.2f));
	penciles.add(new Pencil("f",true,28,"black",1.3f));
	penciles.add(new Pencil("g",false,30,"black",1.4f));
	penciles.add(new Pencil("h",true,30,"red",1.5f));
	//long count=penciles.stream().filter(x->x.getIsLeadType()==true).count();
	//List<Pencil>leads=penciles.stream().filter(x->x.getIsLeadType()==true).collect(Collectors.toList());
	//List<String>colors=penciles.stream().map(y->y.getColor()).collect(Collectors.toList());
	//leads.forEach(x->System.out.println(x));
	//colors.forEach(x->System.out.println(x));
	Set<String>brand=penciles.stream().map(i->i.getBrand()).collect(Collectors.toSet());
	Map<String,Pencil> maps=penciles.stream().collect(Collectors.toMap(i->i.getBrand(),j->j));
	
	brand.forEach(x->System.out.println(x));
	//maps.keySet().forEach(x->System.out.println(x));
	
  }
}
