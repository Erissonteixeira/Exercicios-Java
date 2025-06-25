import java.util.Scanner;

public class NumerosMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int segundoValor = sc.nextInt();

        if ( primeiroValor % segundoValor == 0 || segundoValor % primeiroValor == 0){
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são multiplos.");
        }
            sc.close();
    }
}
