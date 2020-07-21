package basic;

public class A2 {
	public static void main(String[] args) {
		try{
			System.out.println(5/0);
		}

		catch(ArithmeticException e){
			System.out.println("Caught runtime exception: "+ e.getClass() + e.getMessage());
		}
	}
}
