package grouping;

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
