public class calculator{
public  int add(int a,int b)
{
	int c=a+b;
	return c;
}
public static void main(String args[])
{
	calculator cal=new calculator();
	System.out.print("the sum of two numbers is"+(cal.add(2,3)));
}


}	
