import java.util.Scanner;

public class While {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero qualquer, menos o numero 0");

            int numeroDigitado = sc.nextInt();
            int soma = 0;

            while (numeroDigitado != 0) {
                soma = soma + numeroDigitado;
                numeroDigitado = sc.nextInt();
            }
            System.out.println(soma);
            sc.close();
        }
    }

