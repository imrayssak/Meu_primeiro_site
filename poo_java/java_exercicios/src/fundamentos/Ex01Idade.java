package fundamentos;

import java.util.Scanner;

public class Ex01Idade {
    static void main() {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leia.nextLine();
        System.out.println("Digite seu ano de nascimento:");
        int anoDeNascimento = leia.nextInt();

        int anoAtual = 2026;
        int idade = anoAtual - anoDeNascimento;

        System.out.println("Olá " + nome + "! Você tem " + idade + " anos de idade!");
    }
}