import java.util.Scanner;
public class practical7
{
static void front_times(String str,int a)
{
	for(int i=0;i<a;i++)
	{
	System.out.print(str.substring(0,3));
	}
	System.out.println();
}

static void array_count9(Scanner sc)
{
int count = 0;
	System.out.print("enter size of array: ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("enter array values");
	for(int r =0;r<size;r++)
	{
	arr[r] = sc.nextInt();
	}

	System.out.print("enter the number that you want to know how many time that is revised: ");
	int target = sc.nextInt();
	for(int j=0;j<size;j++)
	{
	if(arr[j] == target)
	count++;
	}
System.out.println("count of 9: "+count);
}

public static void main(String[] args)
{
	System.out.print("enter string : ");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	System.out.print("enter number that you want repeat: ");
	int a = sc.nextInt();
	front_times(str,a);

	array_count9(sc);
}
}
