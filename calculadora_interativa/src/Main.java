import java.util.Scanner;

static void main() {
    //Repetir enquanto o usuário não sair
    //Ler opção e direcionar para a operação
    //Soma, Subtração, Multiplicação
    //Divisão (float), Potência
    //Opção para encerrar o programa
    //Encerra o loop principal
    Scanner sc = new Scanner(System.in);
    double num1, num2, resultado,resto, novoNum;
    short subOpcao;
    byte opcao = -1;
    while (opcao != 0) {
        System.out.println("Menu Principal");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracão");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão/Resto");
        System.out.println("5 - Potenciação");
        System.out.println("0 - Sair");
        System.out.println("Escolha qual dessas operacões deseja executar?");
        opcao = sc.nextByte();

        switch (opcao) {
            case 1: {
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();

                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();

                resultado = num1 + num2;
                System.out.println("O resultado é de: " + resultado);
                subOpcao = -1;

                while (true) {
                    System.out.println("\n=== SUBMENU ===");
                    System.out.println("1 - Informar mais um número e continuar");
                    System.out.println("2 - Voltar ao menu principal");
                    subOpcao = sc.nextShort();

                    if (subOpcao == 1) {
                        System.out.print("Digite o próximo número: ");
                        novoNum = sc.nextDouble();

                        resultado += novoNum;
                        System.out.println("Resultado acumulado: " + resultado);

                    } else if (subOpcao == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
                break;
            }
            case 2:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();

                    resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
                while (true) {
                    System.out.println("\n=== SUBMENU ===");
                    System.out.println("1 - Informar mais um número e continuar");
                    System.out.println("2 - Voltar ao menu principal");
                   subOpcao = sc.nextShort();

                    if (subOpcao == 1) {
                        System.out.print("Digite o próximo número: ");
                        novoNum = sc.nextDouble();

                        resultado -= novoNum;
                        System.out.println("Resultado acumulado: " + resultado);

                    } else if (subOpcao== 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

                break;
            case 3:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();
                resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
                subOpcao = -1;
                break;
            case 4:
                System.out.print("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o segundo numero: ");
                num2 = sc.nextDouble();
                resultado = num1 / num2;
                System.out.println("O resultado é: " + resultado);

                resto =(int) (num1 % num2);
                System.out.println("O resto da divisão é " +resto);
                break;
            case 5:
                System.out.print("Digite o número base: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o expoente: ");
                num2 = sc.nextDouble();
                resultado = Math.pow(num1, num2);
                System.out.println("O resultado é: " + resultado);
                break;
            case 0:
                System.out.println("Obrigada por usar a calculadora!");
                break;
            default:
                System.out.println("Digite uma opção válida");
                break;
        }
    }
}
