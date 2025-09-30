import java.util.Scanner;
import java.util.Random;

public class L306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, menor, maior, sorteado;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        sorteado = random.nextInt(maior - menor + 1) + menor;

        if (sorteado % 2 == 0) {
            System.out.println("Número sorteado: " + sorteado + " (PAR)");
        } else {
            System.out.println("Número sorteado: " + sorteado + " (ÍMPAR)");
        }

        scanner.close();
    }
}
