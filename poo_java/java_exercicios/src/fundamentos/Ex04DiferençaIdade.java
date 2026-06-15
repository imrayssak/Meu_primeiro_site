package fundamentos;

import java.util.Scanner;

public class Ex04DiferençaIdade {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome da 1ª pessoa:");
        String nome1 = leia.nextLine();
        System.out.println("Digite a idade de " + nome1 + ": ");
        int idade1 = leia.nextInt();

        leia.nextLine();
        System.out.println("Digite o nome da 2ª pessoa:");
        String nome2 = leia.nextLine();
        System.out.println("Digite a idade de " + nome2 + ": ");
        int idade2 = leia.nextInt();
        leia.nextLine();
        int diferenca = idade1 - idade2;
        System.out.println(diferenca);
        System.out.println("A diferença de idade entre as pessoas são de:" + diferenca);


    }
}
