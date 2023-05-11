package j2se.eclipse.exceptions;

public class ExceptionHandling {
	public static void main(String[] args) {
		int x=5;
		try {
			x/=0;
			System.out.println(x);
		}catch (Exception e) {
			System.out.println("Cant divide by 0.");
		}finally {
			System.out.println("Finally");
		}
		
	}
}
