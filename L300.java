import java.util.Scanner;
public class L300 {
     public static void main (String[] args) {
    double notaUm, notaDois, media;
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite a primeira nota: ");
    notaUm = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    notaDois = scanner.nextDouble();
    
    media = (notaUm+notaDois)/2;
    System.out.println("Sua média é " + media);

    if (media >= 7) {
        System.out.println("Você foi aprovado!");
    }
    if (media >= 5){
        System.out.println("Você está de recuperação!");
    }
    if (media < 5){
        System.out.println("Você foi reprovado!");
    }
    }
}

    
