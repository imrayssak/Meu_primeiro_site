package fundamentos;

import java.util.Scanner;

public class Ex02AreaQuadrado {
    static void main() {
        Scanner leia = new Scanner(System.in);
         System.out.println("Insira o tamanho do lado do quadrado:");
         Double lado = leia.nextDouble();
         Double quadrado = lado * lado;
        System.out.println(quadrado);

        System.out.println("O tamanho da área seu quadrado é:"+quadrado);




    }
}
