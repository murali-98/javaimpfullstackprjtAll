package p1;

public class Acc {
	public int p;
	private int q;
	protected int r;
	public int s;

}
class Test extends Acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private int q;
		Acc obj =new Acc();
		System.out.println(obj.p);
		//System.out.println(obj.q);
		System.out.println(obj.r);
		System.out.println(obj.s);
		System.out.println(q);
	}
}
