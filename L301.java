import java.util.Scanner;

public class L301 {
    public static void main (String [] args){
        int n1, n2, n3, media, maior, menor;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = scanner.nextInt();

        media = (n1+n2+n3)/3;
        System.out.println("A média é " + media);

        maior = n1;
        menor = n1;

        if (n2>maior){
            maior = n2;
        }
        if (n3>maior){
            maior = n3;
        }
        if (n2<menor){
            menor = n2;
        }
        if (n3<menor){
            menor = n3;
        }
        System.out.println("O maior numéro é " + maior);
        System.out.println("O menor numéro é " + menor);
    }
    
}
