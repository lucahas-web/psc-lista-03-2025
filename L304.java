import java.util.Scanner;

public class L304 {
        public static void main (String [] args){
        double numero, r;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o número correspondente ao cálculo desejado: ");
        numero = scanner.nextDouble();
        System.out.println("Digite o valor de R: ");
        r = scanner.nextDouble();
        if (numero == 1){
                double perimetro = (2*Math.PI*r);
                System.out.println("O perímetro é " + perimetro);
        } else if (numero == 2){
                double area = Math.PI * Math.pow(r,2);
                System.out.println("A área é " + area);
        } else if (numero == 3){
                double volume = (4/3*Math.PI*r);
                System.out.println("O volume é " + volume);
        }
}

}

