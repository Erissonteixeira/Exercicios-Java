import java.util.Scanner;


public class LerNumeroInteiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero inteiro: ");

        int numeroDigitado = sc.nextInt();


        if (numeroDigitado < 0) {
            System.out.println("Resultado negativo");

        } else {
            System.out.println("Resultado positivo");

        }
        sc.close();
    }
}