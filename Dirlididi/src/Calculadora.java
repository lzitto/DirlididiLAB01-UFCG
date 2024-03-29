import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 *
 * Questão 04 - R7qL9alKS - Calculadora
 */

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();

        if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double resultado = 0;

            if (operacao.equals("+")) {
                resultado = valor1 + valor2;
            } else if (operacao.equals("-")) {
                resultado = valor1 - valor2;
            } else if (operacao.equals("*")) {
                resultado = valor1 * valor2;
            } else if (operacao.equals("/")) {
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("ERRO");
                    scanner.close();
                    return;
                }
            }

            System.out.println("RESULTADO: " + resultado);
        } else {
            System.out.println("ENTRADA INVALIDA");
        }

        scanner.close();
    }
}
