package DataStructure;
import java.util.*;
 abstract class Animal{}
 interface Hunter{}
class Cat extends Animal implements Hunter
{}
class Tiger extends Cat
{}
public class Test2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> myList=new ArrayList<>();
		myList.add(new Tiger());
		
		ArrayList<Hunter> myList2=new ArrayList<>();
		myList2.add(new Cat());
		
		ArrayList<Hunter> myList3=new ArrayList<>();
		myList3.add(new Tiger());
		
		Cat c=new Tiger(); //Assigning sub instance to super is ok
		Tiger t=(Tiger)new Cat();//Assigning super instance to subclass with out explicitly  is not ok
		
		ArrayList<Tiger> myList4=new ArrayList<>();
		myList4.add(new Cat());//Assigning super instance to subclass with out explicitly  is not ok
		
		ArrayList<Animal> myList5=new ArrayList<>();
		myList5.add(new Cat());

	}

}
