import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @DAVID LEONAM SILVA HOLANDA - 121110520
 *
 * Questão 03 - O74TDGIEa - Função Monótona
 */
public class FuncaoMonotona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[4];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        if (num[0] < num[1] && num[1] < num[2] && num[2] < num[3]) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else {
            if (num[0] > num[1] && num[1] > num[2] && num[2] > num[3]) {
                System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
            } else {
                System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
            }
        }
    }
}
