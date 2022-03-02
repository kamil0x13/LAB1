package pl.lublin.wsei.java.cwiczenia;

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
    }
}