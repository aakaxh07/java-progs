import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sr.nextInt();
		Check ob=new Check();
		ob.checkprime(n);
		

	}

}
