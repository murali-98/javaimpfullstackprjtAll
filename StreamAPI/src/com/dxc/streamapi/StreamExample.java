package com.dxc.streamapi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
public class StreamExample {
	
	public static void main(String[] args) {
		
		/*
		// TODO Auto-generated method stub
		 
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(-9);
		numbers.add(8);
		System.out.println("numbers="+numbers);
		System.out.println("numbers size"+numbers.size());
		
		ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for(Integer i:numbers) {
        	if(i>0) {
        		positiveNumbers.add(i);
        	}
        }
        System.out.println("positive numbers="+positiveNumbers);
        /*stream is default method in Collection interface.filter takes predicate Interface.
        predicate is functional interface.filter uses predicate to return true or false.
        collect takes Collectors interface *//*
       List<Integer> pNumbers= numbers.stream().filter(i->i>0).collect(Collectors.toList());
       System.out.println("ListPositive numbers="+pNumbers);
        
       //to count positive numbers using count()
        long pcount=numbers.stream().filter(i->i>0).count();
        System.out.println("pcount"+pcount);
        
        
        //to perform operation and return value so we use map() function.It takes function Functional interface
        //added 2 for each number
        List<Integer> addedNumbers=numbers.stream().map(i -> i+2).collect(Collectors.toList());
        System.out.println("Added numbers="+addedNumbers);
        
        //sorted numbers
        List<Integer> sortedNumbers=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted Numbers="+sortedNumbers);
        
        //Sorted numbers in reverse Order
        List<Integer> customSortedNumbers=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Custom Sorted Elements="+customSortedNumbers);
       
        
        //Find Max number
        //max() returns optional so we use .get() 
       // System.out.println(numbers.stream().max((i,j)->i.compareTo(j)));//Optional[8]
        System.out.println("The Max Value is="+numbers.stream().max((i,j)->i.compareTo(j)).get());
        //find Min number
        System.out.println("The Min value is="+numbers.stream().min((i,j)->i.compareTo(j)).get());
        
        //print numbers without assign to list and using foreach method reference(::)
        System.out.println("printing numbers in reverse order with using forEach:");
        numbers.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
        
      //converting arrays into stream
        Integer nums[]=new Integer[3];
        nums[0]=8;
        nums[1]=-9;
        nums[2]=6;
        System.out.println("Converting array elements into Streams using Stream.of(nums):");
        Stream.of(nums).forEach(System.out::println);  
        
        
        //Converting collections into array
        System.out.println("Converting collection arraylist into an array");
        Object[] numbers1=numbers.stream().toArray();
       //System.out.println(numbers1.toString());
       
        for(int i=0;i<=numbers1.length-1;i++)
       {
    	   System.out.println(numbers1[i]);
       }
        
       */   
		
		//List<Integer> list=new ArrayList<>();
		//for(int i=1;i<=10;i++) {
			//list.add(i);
		//}
		//Stream<Integer> stream2=list.stream();
		//stream2.forEach(p->System.out.println(p));
		
		//Stream.generate() or Stream.iterate()
		//Stream<Integer> randomNumber=Stream.generate(()->new Random().nextInt(20));
		//randomNumber.forEach(System.out::println);
		//randomNumber.limit(5).forEach(System.out::println);
		
		//Stream of String Characters or tokens
		//stream of char gives ASCII value
		//IntStream stream4 ="DXC".chars();
		//stream4.forEach(p->System.out.println(p));//64 88 67(print1by1)
		
	//	Stream<String> stream5=Stream.of("A%B%C%D".split("\\%"));
	//	stream5.forEach(p->System.out.println(p));//A B C D(1by1)
		
	//	List<Integer> list=new ArrayList<>();
	//	for(int i=1;i<=20;i++) {
	//		list.add(i);
	//	}
	//	Stream<Integer> stream2=list.stream();
	//	List<Integer> evenNumberList=stream2.filter(i->i%2==0)//filter is intermediate operation
	//			.collect(Collectors.toList());               //collect and Collector is terminal operation
	//	System.out.println(evenNumberList);
		
		ArrayList<String> names=new ArrayList<>();
		names.add("apple");
		names.add("ball");
		names.add("amount");
		names.add("orange");
		//names.stream().filter((p) -> p.startsWith("a"))  //upto intermediate we are printing
		//.forEach(System.out::println));
		
		/*ArrayList<String> names=new ArrayList<>();
		names.add("apple");
		names.add("ball");
		names.add("amount");
		names.add("orange");
		names.stream().filter((p) -> p.startsWith("a"))  
		.map(String::toUpperCase)                //chaining of intermediate operation
		.forEach(System.out::println));
		*/
		
		//stream().anyMatch()
		//boolean matchedResult=names.stream()
		//		.anyMatch((s)->s.startsWith("a"));
		//System.out.println(matchedResult);//true
		
		
		//stream().allmatch()
	//	boolean matchedResult=names.stream()
	//			.allMatch((s)->s.startsWith("a")); //all added elements are starts with"a" then true printed
	//	System.out.println(matchedResult);//false
		
		//stream().noneMatch()
	//	boolean matchedResult=names.stream()
	//		.noneMatch((s)->s.startsWith("X"));
	//	System.out.println(matchedResult);//true if x words not available
		Optional<String> reduced=names.stream()
				.reduce((s1,s2)->s1+s2);      //reduce is works for concatination(reduces spaces)
		reduced.ifPresent(System.out::println);
		
		
		
		
	}
	

}
