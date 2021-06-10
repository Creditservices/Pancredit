package learning;

public class Sample {
	int d=5;
	static int x=5;
	static int y=10;
	static int c= x+y;
	void method(){
	System.out.println(d);
	}
	
	public static void main(String args[]){
		Sample s=new Sample();
		Sample1 s1=new Sample1();
		Sample2 s2=new Sample2();
		System.out.println(c);
		
		s1.print();
		s2.print();
		int n=s1.print_num();
		System.out.println(n);
		s2.print_string();
		String str=s2.print_string();
	    System.out.println(str);
	    s.method();
	
		
	}

}
