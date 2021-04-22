package for_while;

import java.sql.SQLOutput;

public class LogicalOp {

    public void countToHundred(int numar) {
        for (int i = numar; i <= 100; i++) {
            System.out.println("The number is:" + i);
        }
    }

    public void countToNegativeHundred(int numar) {
        for (int i = numar; i >= -100; i--) {
            System.out.println("The number is:" + i);
        }

    }

    public void addNumbersToHundred(int numar) {
        int adition = 0;
        if (numar > 0) {
            for (int i = numar; i <= 100; i++) {
                adition = adition + i;
            }
            System.out.println("Rezultatul adunarii numerelor consecutive pana la 100 :" + adition);
        } else {
            System.out.println("Numarul este mai mic decat 0");
        }
    }

    public float averageFromSumToHundred(float numar) {
        float adition = 0;
        float count = 0;
        for (float i = numar; i <= 100; i++) {
            adition = adition + i;
            count++;
        }
        return (adition / count);
    }

    public void printTriangle() {
        for (int i = -7; i < 0; i++) {
            for (int j = 0; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void whileCounter(int numar) {
        do {
            System.out.println(numar);
            numar++;
        } while (numar <= 100);

    }

    public void whileCounterNegative(int numar) {
        do {
            System.out.println(numar);
            numar--;
        } while (numar >= -100);
    }

    public void intervalCounter(int start, int finish) {
        do {
            System.out.println(start);
            start++;
        } while (start <= finish);
    }
    // Creati o metoda in clasa LogicalOp, care sa primeste doi parametri de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).


    public void incrDecrCounter(int first, int second) {

        Lab3.LogicalOp incrDecrMeth = new Lab3.LogicalOp();

        int resultIncr = incrDecrMeth.checkBiggerNumber(first, second);
        int resultDecr = incrDecrMeth.checkLowerNumber(first, second);
        do {
            System.out.println(resultDecr);
            resultDecr++;
        } while (resultDecr <= resultIncr);

    }

    public void countEven() {
        int i = 2;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

    public void countOdd() {

        int i = 1;
        while (i <= 100) {

            System.out.println(i);
            i = i + 2;
        }

    }

    //Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void countAndAverage() {
        int i= 111;
        float adition = 0;
        float count = 0;
        while (i<=8899){
            adition = adition + i;
            count++;
            i++;
        }
        System.out.println("adition/count"+ adition/count);
    }

    public void countDivideBy7 (int first , int second){

        float adition = 0;
        float count = 0;
        while (first <= second){
            if ( first % 7 == 0) {
                adition = adition + first;
                count++;
            }
            first++;
        }
        System.out.println("Sum/count by 7: "+ adition/count);
    }

    public void FiboncSeqence() {
        int count =3;// de unde in sir va incepe sa numere pana la valoarea de 20 data
        int i=0;
        int j=1;
        int x;//unde x este suma celor doua numere din sir anterioare , respectiv i si j
        System.out.print(i + " "+ j+ " ");
        while(count<=20)
        {
            x= i+j;
            System.out.print(x+" ");
            i = j;
            j=x;
            count++;
        }
    }
}