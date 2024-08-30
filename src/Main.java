import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Utilitarios.exibirSaudacao();
                    break;
                case 2:
                    calcularESomar(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Exibir saudação");
        System.out.println("2. Calcular soma de dois números");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void calcularESomar(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int soma = Utilitarios.calcularSoma(num1, num2);
        System.out.println("A soma é: " + soma);
    }
}
