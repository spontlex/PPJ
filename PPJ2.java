import java.util.*;

public class PPJ2{
	public static void main(String []args){
	System.out.println("Hello PPJ");
	
	//1 zadanie
	Scanner in = new Scanner(System.in);
	System.out.print("Podaj swoj numer studenta: ");
	String name = in.nextLine();
	
	System.out.println("Witaj s" + name + " !");
	
	/*2 zadanie
	1001101(2) = 77(10)
	115(8)=77(10)
	4D(16)=77(10)
	*/
	
	//3 zadanie
	System.out.println("77 w oct =" + 77);
	System.out.println("77 w bin =" + 0b1001101);
	System.out.println("77 w oct =" + 0115);
	System.out.println("77 w oct =" + 0x4D);
	
	//4 zadanie
	System.out.println("7&2 = " + (7&2));
	System.out.println("30|10 = " + (30|10));
	System.out.println("7^2 = " + (7^2));
	System.out.println("11&8 = " + (11&8));
	System.out.println("26>>2 = " + (26>>2));
	System.out.println("36<<3 = " + (36<<3));
	System.out.println("39&13 = " + (39&13));
	System.out.println("12|18 = " + (12|18));
	System.out.println("40>>4 = " + (40>>4));
	System.out.println("27^16 = " + (27^16));
	
	//5 zadanie
	System.out.println("4|5= " + (4|5));
	System.out.println("4|6= " + (4|6));
	System.out.println("4>>2|1=" + (4>>2|1));
	System.out.println("4|12= " + (4|12));
	System.out.println("4|4= " + (4|4));
	System.out.println("4|13= " + (4|13));
	
	//6 zadanie
	System.out.println("5&1= " + (5&1));
	System.out.println("5&4= " + (5&4));
	System.out.println("5&5= " + (5&5));
	System.out.println("5&0= " + (5&0));
	
	//7 zadanie
	System.out.println("7|15= " + (7|15));
	System.out.println("7&4= " + (7&4));
	System.out.println("7>>1|11= " + ((7>>1)|11));
	System.out.println("7>>2&9= " + ((7>>2)|9));
	}
}