import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);
        System.out.println("Ingrese el numero");
        Scanner Num1 = new Scanner(System.in);
        int i = Num1.nextInt();
        int contador = 0;
        System.out.println("Los divisores de: "+i+" son:");
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                System.out.print(j+ " , ");
                contador++;
            }
        }
            if (contador <= 2) {
                System.out.println("\nEl numero "+ i + " es primo  ");
            }else if (contador > 2){
                System.out.println("\nEl numero es compuesto");
            }

        }
   }
