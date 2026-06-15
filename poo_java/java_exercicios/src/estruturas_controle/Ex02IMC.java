
package estruturas_controle;

import java.util.Scanner;


public class Ex02IMC {
    static void main() {
        Scanner usuario = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = usuario.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = usuario.nextDouble();
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é:", imc);

        if (imc < 18.6) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc < 39.9) {
            System.out.println("Classificação: Obesidade Grau II");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }
    }
}
