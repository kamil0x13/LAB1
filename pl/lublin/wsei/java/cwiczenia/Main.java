package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java world\n");

        int a = 3;
        double b = 4.21;
        String s = "jakiś tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

        System.out.println("alfa\tsin(alfa)");
        for (int i =0; i < 370; i+=10){
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360f*2*Math.PI));
        }

        //tabela logarytmów
        System.out.println("arg\tlog2(arg)\tsum(arg)");
        int sum = 0;
        for (int i = 0; i <= 4; i+=2){
            sum += Math.pow(2,i);
            System.out.println(i + "\t" + (Math.log(i)/Math.log(2)) + "\t" + sum);
        }

        //Punkt 8-9
        Scanner input = new Scanner(System.in);
        int num1, num2;
        for(;;){
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if(num1 == 0) break;
            System.out.print("\nPodaj drugą liczbę: ");
            num2 = input.nextInt();
            if(num2==0)break;
            System.out.println("\nWynik dodawania " + num1 + " + " + num2 + " = " + (num1+num2));
        }

        //Punkt 10
        for(;;){
            System.out.print("Podaj liczbę: ");
            num1 = input.nextInt();
            if(num1 == 0) break;
            System.out.println("DEC = " + num1 + ", BIN = " + Integer.toBinaryString(num1) + ", HEX = " + Integer.toHexString(num1));
        }

        //Punkt 11
        int[] liczby = new int[30];
        Random random = new Random();

        for(int i = 0; i < 30; i++){
            liczby[i] = random.nextInt();

            int mx = Integer.MIN_VALUE, mn = Integer.MIN_VALUE;
            long avg = 0;
            for (int l : liczby) {
                System.out.println(l);
                if (l < mn) mn = l;
                if (l > mx) mx = l;
                avg += l;
            }
            System.out.println("MIN = " + mn + ", MAX = " + mx + ", AVG = " + (float)avg/liczby.length);
        }
    }
}
