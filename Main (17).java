import java.util.Vector;
import java.lang.IndexOutOfBoundsException;
public class Main
{
	public static void main(String[] args) {
	Vector<Integer> vec= new Vector<>();
	vec.add(11);
	vec.add(12);
	vec.add(13);
	vec.add(14);
	vec.add(15);
	System.out.println(vec); //vec.add(12);
	System.out.println(vec.firstElement()); //11
    System.out.println(vec.lastElement());  //12
    System.out.println(vec.contains(12)); // true 
    System.out.println(vec.contains(19)); //false
    vec.add(3,88);  // need to add IndexOutOfBoundsException You must ensure that vec.size() >= 3. If the size is less than 3, index 3 is invalid for insertion.
    System.out.println(vec);
   System.out.println(vec.get(2));// return element at index
   System.out.println(vec.size());
	}
}
