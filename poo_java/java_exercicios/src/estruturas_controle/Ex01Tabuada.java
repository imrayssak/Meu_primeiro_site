package estruturas_controle;

import java.util.Scanner;

public class Ex01Tabuada {
    static void main() {
        Scanner leia= new Scanner(System.in);
         System.out.println("Digite um numero de 1 a 10:");
        int numeros = leia.nextInt();
        System.out.println("Essa é a tabuada do número"+ numeros + ": " );

        for (int i = 1; i <= 10; i++) {
            int resultado = numeros * i;
            System.out.println(numeros + " x " + i + " = " + resultado);
        }
    }
}
