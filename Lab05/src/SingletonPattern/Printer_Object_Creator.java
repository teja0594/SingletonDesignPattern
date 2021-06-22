package SingletonPattern;
import java.util.*;
public class Printer_Object_Creator{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	if(printer.getInstance()==null)
	{
		System.out.println("printer not avaliable");
	}
	else
	{
		System.out.println("For Printer one object is created");
	
}
	sc.close();
}
}
