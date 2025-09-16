import java.util.Scanner;

public class L302 {
    public static void main (String [] args){
        int preco, pagamento, troco;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o valor pago em espécie: ");
        pagamento = scanner.nextInt();
        System.out.println("Informe o valor da compra: ");
        preco = scanner.nextInt();

        troco =  pagamento - preco;

        if (troco == 0) {
            System.out.println("Não há troco para sua compra.");
        }  else {
            System.out.println("Seu troco é de R$ " + troco);
            int[] notas = {100, 50, 20, 10, 5, 2, 1};

            for (int nota : notas ){
                int quantidade = troco / nota;
                troco = troco % nota;
                if (quantidade > 0){
                    System.out.println(quantidade + " nota(s) de R$" + nota);
                }
            }
        }

    }
    
}
