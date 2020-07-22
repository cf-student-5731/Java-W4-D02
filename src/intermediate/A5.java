package intermediate;

public class A5 {

	public static void methodWithThreeExceptions(int exNo) throws Type_01_Exception, Type_02_Exception, Type_03_Exception{
		switch (exNo) {
			case 1 -> throw new Type_01_Exception("Type one Exception");
			case 2 -> throw new Type_02_Exception("Type two Exception");
			case 3 -> throw new Type_03_Exception("Type three Exception");
			default -> System.out.println("nothing");
		}
	}

	public static void main(String[] args) {
		try{
			methodWithThreeExceptions(1);
			methodWithThreeExceptions(2);
			methodWithThreeExceptions(3);
		}
		catch(Type_01_Exception | Type_02_Exception | Type_03_Exception e){
			System.out.println(e.getClass() +" " + e.getMessage());
		}

		try{
			methodWithThreeExceptions(1);
			methodWithThreeExceptions(2);
			methodWithThreeExceptions(3);
		}

		catch(Type_01_Exception e){
			System.out.println("catch 01 " + e.getClass() +" " + e.getMessage());
		}
		catch(Type_02_Exception e){
			System.out.println("catch 02 " + e.getClass() +" " + e.getMessage());
		}
		catch(Type_03_Exception e){
			System.out.println("catch 03 " + e.getClass() +" " + e.getMessage());
		}
	}
}
