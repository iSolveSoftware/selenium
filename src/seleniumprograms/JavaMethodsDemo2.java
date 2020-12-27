package seleniumprograms;

public class JavaMethodsDemo2 {

	public static void main(String args[]) {
		JavaMethodsDemo ref1 = new JavaMethodsDemo();
		ref1.method1();
		
		ref1.method2(1);
		
		ref1.method3("calling from JavaMethodsDemo2");
		
		ref1.method3(args[0]);
	}
	
}
