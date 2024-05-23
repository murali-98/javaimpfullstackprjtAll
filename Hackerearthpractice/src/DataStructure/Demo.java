package DataStructure;

import java.util.*;
 public class Demo{
	 int x,y;
 	public void doStuff(int x,int y) {
 		this.x=x;
 		y=this.y;
 		System.out.println(y);
 	}
 	
 	public void display() {
 		
 		System.out.print(x+" "+y+":");
 	}
 	
    public  static void  main(String args[]) {
    	//private int x=100; error
    	Demo d1=new Demo();
    	d1.x=100;
    	d1.y=200;
    	Demo d2=new Demo();
    	d2.doStuff(d1.x,d1.y);
    	d1.display();
    	d2.display();
    	
    	String s1=new String("hello");
    	String s2=new String("hello");
    	System.out.println(s1==s2);
    	System.out.println(s1.equals(s2));
    	
    	
    	int num1[]=new int[6];
    	int num2[]= {1,2,3,4,5};
    	num1=num2;
    	for(int x:num1)
    	{
    		System.out.print(x);
    	}
    	
    	
    //	push() and pop()=>queue not supported	
    // get() methos is not working in queue	
    	
     /*   Queue<String> q=new LinkedList<>();//preserve insertion order
       // Queue<String> q=new PriorityQueue<>(); doesnt preserve insertion order add smallest ele at first and remaining are randomly added
         //for descending order
        // Queue<String> q=new PriorityQueue<>(Comparator.reverseOrder());
         q.add("carrot");
         q.add("apple");
         q.add("banana");
         q.add("mango");
        
         //doesn't preserve insertion order
          //in queue elemnts are added highest priority.smallest values are the highest priority
           //peek() return first element nd no removed
         //poll() return 1st element and removed
         System.out.println(q);
         System.out.println(q.peek()+" "+q.poll());
         System.out.println(q.remove());
       //System.out.println(q.peek()+" "+q.poll()+" "+q.poll());
        // while(!q.isEmpty()) {
        	// System.out.println(q.poll());
         //}
         */
    	//poll()==>for stack not supported
  /*  	Stack<Integer> s=new Stack<>();
    	s.add(40);
    	s.add(10);
    	s.add(60);
    	s.add(20);
    	s.push(5);
    	//poll() method is not available for stack
    	System.out.println(s);//preserve insertion order
    	//System.out.println(s.pop());//pop() removes last element
    	//System.out.println(s.peek());
    	System.out.println(s.remove(4));
    	System.out.println(s);
    	
    	*/
    /*	package grouping;

    	public class java8Example1 {
    		public static void doSum(int a,int b) {
    			
    			System.out.println(a+b);
    			System.out.println("1");
    			
    		}
    		public static void doSum(long a,long b) {
    			
    			System.out.println(a+b);
    			System.out.println("2");
    			
    		}
    		public static void doSum(Integer a,Integer b) {
    			int c=a+b;
    			System.out.println(c);
    			System.out.println("3");
    			
    		}
    	public static void doSum(float a,float b) {
    			
    			System.out.println(a+b);
    			System.out.println("4");
    			
    		}
    	public static void doSum(double a,double b) {
    		
    		System.out.println(a+b);
    		System.out.println("5");
    		
    	}


    		

    		public static void main(String[] args) {
    			// TODO Auto-generated method stub
    	               doSum(10,30);//1 method executed
    	               doSum(10f,30f);//4 executed
    	               doSum(10.0,30.0);//5 executed

    		}

    	}
    	*/

    	
   	int ans=0;
    	try {
    		int num=10;
    		int div=0;
    		 ans=num/div;
    	}
    	catch(ArithmeticException ae) {
    	//	ans=0;                       //line1
    	} catch (Exception e) {
    		System.out.println("invalid exception");
    	}
    	System.out.println("Answer="+ans);   //line2
    	
    	
    	
    	
    	
    }
    
}
