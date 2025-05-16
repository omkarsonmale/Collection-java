import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	List<Integer> arr= new ArrayList<>();   // 
	arr.add(10);
	arr.add(11);
	arr.add(12);
	arr.add(13);
	arr.add(14);
	System.out.println(arr); 
	
	/*
	Great question! Both declarations are correct and commonly used, but they serve slightly different purposes:

1. ArrayList<String> fruits = new ArrayList<>();
You are specifically declaring fruits as an ArrayList.

You can only use methods that are declared in the ArrayList class (and its superclasses).

Allows you to use ArrayList-specific methods (like ensureCapacity() or trimToSize()).

2. List<String> fruits = new ArrayList<>();
You declare fruits as a List interface reference but instantiate it with an ArrayList.

This is more flexible and preferred in good programming practice.

You program to the interface (List), not the implementation (ArrayList).

You can easily switch implementations later (e.g., change to LinkedList) without changing the rest of your code.

Only methods declared in the List interface (and its superinterfaces) are accessible.
*/
	}
}
