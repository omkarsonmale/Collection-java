//colletions with generic ArrayList
import java.util.List;
import java.util.ArrayList;
class person{
    public String Name;
    public int age;
    
    public person(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
}

public class Main
{
	public static void main(String[] args) {
	 List<person> p = new ArrayList<>();
	 
	 p.add(new person("Omkar",25));
	 p.add(new person("Ram",35));
	 p.add(new person("Ajay",45));
	 
	 p.forEach(person->{
	     System.out.println(person.Name+" "+ person.age);
	 });
	 
	 System.out.println(p.get(1).Name);
	 System.out.println(p.get(1).age);
	 
	 System.out.println();
	 System.out.println("after removing particular index value:");
	   p.remove(1);
  p.forEach(person->{
	     System.out.println(person.Name+" "+ person.age);
	 });
	 
System.out.println();
System.out.println(" adding /append all elements to from specific collection to the end");

List<person> copylist = new ArrayList<>();
copylist.add(new person("sham",18));

copylist.addAll(p);

copylist.forEach(person->{
   System.out.println( person.Name + "  " + person.age);
    
});

System.out.println(copylist.indexOf(new person("sham",18)));
	 
	 List<Integer>li = new ArrayList<>();
	 li.add(10);
	 li.add(20);
	 li.add(240);
	 System.out.println(li.indexOf(2000));
	}
   
	 
}
