package intermediate;

public class A4 {

	private static class g {
		private void method() throws AnyException{
			throw new AnyException("AnyException");
		}
	}

	private static class f {
		private void method() throws ADifferentException {
			try{
				g g = new g();
				g.method();
			}
			catch(AnyException a){
				System.out.println(a.getMessage() + " passed through to caller");
				throw new ADifferentException("A different Exception");
			}


		}

	}

	public static void main(String[] args) {
		f f = new f();
		try{
			f.method();
		}
		catch(ADifferentException d){
			System.out.println(d.getMessage() + " caught in main");
		}

	}

}
