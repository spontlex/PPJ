public class PPJ04 {
    public static void main(String[] args){
        //3
        System.out.println("Hello world");


        //4
        System.out.println("Logiczna: ");
        boolean a;  //Deklaracja
        a=true;     //Inicjalizacja
        System.out.print(a + "\n");

        System.out.println("Liczba calkowita: ");
        int b;  //Deklaracja
        b=10;   //Inicjalizacja
        System.out.print(b + " + ");
        byte ba;
        ba=127;
        System.out.print(ba + " + ");
        short bc;
        bc=32726;
        System.out.print(bc + " + ");
        long bd;
        bd=9223372036854775807L;
        System.out.print(bd + "\n");

        System.out.println("Liczba rzeczywista: ");
        float c;     //Deklaracja
        c=5.22421f; //Inicjalizacja
        System.out.print(c + " + ");
        double d;
        d=5.21;
        System.out.print(d + "\n");

        System.out.println("Znaki: ");
        char e='E';
        System.out.print(e);

        //5
        //boolean true,false
        int a1=-2147483648;
        int a2=2147483647;

        byte b1=-128;
        byte b2=127;

        short s1=-32768;
        short s2=32767;

        long l1=-9223372036854775808L;
        long l2=9223372036854775807L;

        float f1=-3.4028234663852886E38F;
        float f2=-1.401298464324817E-45F;
        float f3=1.401298464324817E-45F;
        float f4=3.4028234663852886E38F;

        double d1=-1.7976931348623157E308;
        double d2= -4.9E-324;
        double d3=4.9E-324;
        double d4=1.7976931348623157E308;

        char c1='a';
        char c2='Z';

        //6
        System.out.println(c1+a1);
        System.out.println(a1+c1);
        System.out.println(f1+d1);
        System.out.println(b1+a1);

        //7
        int x=2*5+3*4-8;
        System.out.println("x wynosi: " + x);
        int x1=((5+3)*(4+8))/2;
        System.out.println("x1 powinien wynosic: " + x1);

        //8
        java.util.Scanner pobierzZKlawiatury=new java.util.Scanner(System.in);
        int studentId=pobierzZKlawiatury.nextInt();
        System.out.println("Hello s" +studentId);

        //9

        java.util.Scanner pobierzCharZKlawiatury=new java.util.Scanner(System.in);
        int wprowadzonaLiczba=pobierzCharZKlawiatury.nextInt();
        char test=(char) wprowadzonaLiczba;
        System.out.println(">" + test + "<" + " - " + wprowadzonaLiczba);



    }
}
