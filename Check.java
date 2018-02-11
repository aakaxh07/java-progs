
public class Check {

	public static void checkprime(int n) {
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				  c++;
			}
		}
		if(c==2)
		{
			System.out.println("number are prime number");
		
		}
		else
		{
			System.out.println("number are not a  prime number");
		}
		
		

	}

}
