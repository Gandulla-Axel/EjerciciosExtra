import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);
        System.out.println("Ingrese el numero");
        Scanner Num1 = new Scanner(System.in);
        int numero = Num1.nextInt();
        int contador = 0;
        System.out.println("Los numeros primos comprendidos entre: 1 y"+numero+"  son: ");

        for (int i = 1; i <= numero; i++) {

        for (int j = 1; j <=i; j++) {
            if (i % j == 0) {
              //  System.out.print(j+ " , ");
                contador++;
            }
        }

        if (contador <= 2 && contador!=1) {
              System.out.println(i+" ,");
        }
        contador=0;
    }
    }
}
