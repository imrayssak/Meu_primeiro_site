package fundamentos;

import java.util.Scanner;

public class Ex03AreaRetangulo {
    static void main() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira o tamanho da base do retângulo:");
        Double base = leia.nextDouble();
        System.out.println("Insira o tamanho da altura ");
        Double altura = leia.nextDouble();
        Double retangulo = base * altura;

        System.out.println("O tamanho da área seu retângulo é:"+retangulo);
    }
}
