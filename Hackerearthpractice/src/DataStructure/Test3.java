package DataStructure;

//import java.util.Random;
class Item{
	//int n;
	Item(int n){
		
	}
	

}
class Course{
	String name;
	static int count=0;
	Course(String name){
		this.name=name;
		count++;
	}
}

class MyClass{
	private int var1=100;
	public int var2=200;
	public void doCalc() {
		var1=100*2;
		var2=200*2;
		
	}
	
}
class Student{
	int id=0;
	String name="unknown";
	Student(int id){
		this.id=id;
	}
	Student(String name){
		this.name=name;
	}
	Student(int id,String name){
		this(id);
		this.name=name;
		
		
	}
}

	class C{
		static int i;
		int j;
		void increment() {
			int m;
			++i;++j;
		}
		void display() {
			System.out.println(i+" "+j);
		}
		
	}
	class c{
		
	}
	class D{
		D(int i){
			
		}
	}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubR
	/*Random r1=new Random(10);
	Random r2=new Random(10);
	if(r1.nextInt()==r2.nextInt()) {
		System.out.println("jack");
		
	}else {
		System.out.println("queen");
		
	}
	System.out.println(r1);
	System.out.println(r2);
	
	*/
		/*
		int num=0;
		Random r=new Random();
		r.setSeed(10);
		num=r.nextInt();
		System.out.println(num);
		*/
		
		/*int id1=100;
		int id2=100;
		Item i1=new Item(100);
	    Item i2=new Item(100); 
				System.out.println(id1==id2);
				System.out.println(i1==i2);
			*/
		/*
		int num1=1;
		int num2=2;
		int num4=0;
		int num3=(num1>num2)?num1:num2;
		//(num1>num2)?num4=num1:num4=num2;
		boolean flag=true;
		int num5=(flag)?(num1):(num2);
		int num6=num1>num2?num1:num2;
		System.out.println(num3);
		System.out.println(num5);
		System.out.println(num6);
		*/
		/*
		Course c=new Course("java Pro");
		System.out.println(c.name+":"+Course.count);
		*/
	/*	MyClass t =new MyClass();\
		t.doCalc();
		System.out.println(t.var1+":"+t.var2);
		*/
		/*int a=100;
		switch(a) {
		case 100:
			System.out.println("hundred");
			default:
				System.out.println("unit");
				}
				*/
	//	String name="angel";
		//int score =70;
		//System.out.printf("Miss.%s's score is%d",score,name);
	/*	String s1="foo-bar";
		String s2= new String("foo-bar");
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		*/
		/*int a=10;
		int b=20,c=30;
		System.out.println(a++>10||++b<=21);
		System.out.println(a);
		System.out.println(a>10&&++b<=22);
		System.out.println(a<=11&&b==22);
		System.out.println(c++==31&&a++==11||b++==22);
		*/
	/*	int a=7;
		int b=3;
		int result=a/b+a*b-a%b;
		System.out.println(result);
	*/
		//String[] codes = {"CA"
	/*int count=0;
	while(count <=10) {
	
		System.out.println(count+" ");
		count+=2;
	}
		 
		*/
	/*	double avgScore =75.25;
		if(avgScore>50 && avgScore <70) {
			System.out.println("c");
			}
		else if(avgScore>=70 && avgScore<90) {
			System.out.println("b");
			
		}
		else if(avgScore>=90) {
			System.out.println("a");
			}
		else
		{
			System.out.println("no grades");
		}
		*/
/*	int n1=10,n2=15;
	int sum=0,avg=0;
	sum=n1+n2;
	avg=sum/2;
System.out.println(sum+":"+avg);
*/
		/*int number=1;

		String s1=null;
		//System.out.println(s1.length());
		try {
			number=s1.length();
			System.out.println("hello");
			number+=2;
		}
		catch(RuntimeException e) {
			number+=4;
			// TODO: handle exception
		}
		System.out.println(number);
		System.out.println("number");
	*/
		/*double cfee=1000.0;
		float per=5.0f;
		float newfee;
		newfee=cfee*per;
		System.out.println(newfee);
		*/
		//Student s=new Student(123,"peter");
		//System.out.println(s.id+":"+s.name);
		int n;
		//n=10;
		//System.out.println(n);
		C c1=new C();
		// c1=new C();
		
		C c3=new C();
		c1.increment();
		////c2.increment();
		c3.increment();
		c1.display();
		//c2.display();
		c3.display();
		
		//new c();
		//new D();
		
		String s1=new String("java");
		String s2=new String("java");
		String s3=s1;
		//String s1="java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s4);
		double num=-25.67;
		System.out.println(Math.abs(num));
	
		
		
	} 

}
