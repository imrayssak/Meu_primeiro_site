public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int n2 = scanner.nextInt();
    if (n2 > numero1) {
        int temp = numero1;
        numero1 = n2;
        n2 = temp;
    }
    for (int i = numero1; i >= n2; i--) {
        if (i % 2 == 0) {
            System.out.println(i + " é PAR");
        } else {
            System.out.println(i + " é ÍMPAR");
        }
    }
}