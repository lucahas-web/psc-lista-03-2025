import java.util.Scanner;
public class L305 {
    public static void main (String [] args){
        double numUm, numDois;
        char sinal;
        boolean valido = true;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        numUm = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        numDois = scanner.nextDouble();
        System.out.println("Digite o sinal da operação: ");
        sinal = scanner.next().charAt(0);

        double resultado = 0;

        switch(sinal){
            case '+':
            resultado = numUm+numDois;
            break;
            case '-':
            resultado = numUm-numDois;
            break;
            case '*':
            resultado = numUm*numDois;
            break;
            case '/':
            if (numDois != 0) {
                resultado = numUm/numDois;
            } else {
                System.out.println("Impossível dividir por 0.");
            } 
            break;
            case '^':
            resultado = Math.pow(numUm,numDois);
            break;
            default:
            System.out.println("Erro: Operação inválida.");
            valido = false;
            resultado = 0;
        }
        if (valido) {
            System.out.println("O resultado é " + resultado);
        }
}
}

