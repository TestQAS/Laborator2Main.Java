package Laborator2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("-Rezultat Exercitiu 1: ");
        System.out.println("Sum: " + addition(7, 5));
        System.out.println("Product: " + multiply(4, 2));
        System.out.println("Quotient: " + divide(6, 3));
        System.out.println("Difference: " + substract(15, 5));
        System.out.println("-Rezultat Exercitiu 2: ");
        printMyName();
        System.out.println("-Rezultat Exercitiu 3: ");
        printMyLogo();
        System.out.println("-Rezultat Exercitiu 4: ");
        System.out.println("Average:" + average3(15, 5, 3));
        System.out.println("-Rezultat Exercitiu 5: ");
        printMyDog();
        System.out.println("-Rezultat Exercitiu 6: ");
        System.out.println("-Remainder: " + modulo(7, 3));
        System.out.println("-Rezultat Exercitiu 8: " + celsiusTemp(70));
        System.out.println("-Rezultate Exercitiu 9: " + inchToMeters(5));
       viteza(10, 1, 30, 15);

    }

    //Exercitiul 1
    public static int addition(int first, int second) {
        int result = first + second;
        return result;
    }

    public static int multiply(int first, int second) {
        int result = first * second;
        return result;
    }

    public static int divide(int first, int second) {
        int result = first / second;
        return result;
    }

    public static int substract(int first, int second) {
        int result = first - second;
        return result;
    }


    //Exercitiul 2
    public static void printMyName() {

        System.out.println("Hello\n     Alin!");

    }

    //Exercitul 3
    public static void printMyLogo() {

        System.out.println("FFFFFFFFFFFFA           SSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTTTRRRRRRRR          A              CCCCCCCCCCCCCCCCCCCCCCCCCCC");
        System.out.println("FFF        AAA        SSSSSSSSSS    TTTTTTTTTTTTTTTTTT   RR    RRR        AAA          CCCCCCCCCCCCCCCKK  IT TTTTTTTT");
        System.out.println("FFF       AAAAA       SSSS            TTT        TTT     RRRRRRR=========AAAAA=======CCC        KK  KK          TT");
        System.out.println("FFFFF    AAA AAA      SSSSSSSSS       TTT        TTT     RRRRRR         AAA AAA    CCC          KKK       IT    TT");
        System.out.println("FFF     AAAAAAAAA      SSSSSSSSS      TTT        TTT     RR RRR========AAAAAAAAA====CCC         KKK       IT    TT");
        System.out.println("FFF    AAAAAAAAAAA         SSSSS      TTT        TTT     RR   RRR     AAAAAAAAAAA     CCCC      KK  KK    IT    TT");
        System.out.println("FFF   AAAAA   AAAAASSSSSSSSSSSS       TTT        TTT     RR    RRR   AAAAA   AAAAA       CCCCC  KK    KK  IT    TT");
    }

    //Exercitiul 4
    public static float average3(float first, float second, float third) {
        float result = (first + second + third) / 3f;
        return result;
    }

    //Exercitiul 5
    public static void printMyDog() {

        System.out.println(" +" + "\"" + " \"" + " \"" + " \"" + " \"" + "+");
        System.out.println("[|  o   o  |]");
        System.out.println(" |    ^    | ");
        System.out.println(" |   '-'   | ");
        System.out.println(" +---------+ ");
    }

    //Exercitiul 7
    public static float modulo(int first, int second) {
        float result = first % second;
        return result;
    }


        //Exercitiul 8

    public static double celsiusTemp(double fahrenheit)
    {
        double result = (fahrenheit - 32) / 1.8;
        return result;
    }

    //Exercitiul 9

    public static double inchToMeters(double inch)
    {
        double result = inch * 0.0254;
        return result;
    }

    //Exercitiul 10

    public static void viteza(float meters, int hours, int minutes, int seconds) {
        float speedMs = meters / (seconds + minutes * 60f + hours * 3600f);
        float kMh = (meters/1000)/(hours+ 1/60*minutes+1/3600*seconds);
        float miles = (meters/1609)/(hours+ 1/60*minutes+1/3600*seconds);
        System.out.println( "speed Ms:"+ speedMs);
        System.out.println("kMh:"+ kMh);
        System.out.println("MilesH: "+ miles);

    }
}



