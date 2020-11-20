package Demo;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int i;
for (int x=0;x<=10;x++)
{
	System.out.println(a);
	i=a+b;
	a=b;
	b=i;
}
	}

}
