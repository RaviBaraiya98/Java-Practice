import java.util.Scanner;
public class practical8
{

public static void main(String[] args)
{
System.out.print("enter the string line: ");
Scanner s = new Scanner(System.in);
String str = s.nextLine();
System.out.print("enter the string that you want changed : ");
String a = s.nextLine();
System.out.print("enter the string from which that you want to changed : ");
String b = s.nextLine();
String replaced = str.replace(a,b);
String repl = replaced;
System.out.println("replaced string is: "+repl);
}
}
