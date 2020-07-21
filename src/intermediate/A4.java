package intermediate;

public class A4 {

	private static class g {
		private void method() throws AnyExeption{
			throw new AnyExeption("AnyExeption");
		}
	}

	private static class f {
		private void method() throws ADifferentException {
			try{
				g g = new g();
				g.method();
			}
			catch(AnyExeption a){
				System.out.println(a.getMessage() + " passed through to caller");
				throw new ADifferentException("A different Exeption");
			}


		}

	}

	public static void main(String[] args) {
		f f = new f();
		try{
			f.method();
		}
		catch(ADifferentException d){
			System.out.println(d.getMessage() + " cought in main");
		}

	}

}
