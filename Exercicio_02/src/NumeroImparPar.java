import java.util.Scanner;

public class NumeroImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero desejado: ");

        int numero = sc.nextInt();

        if (numero %2 == 0){
            System.out.println("O número digitado é par.");
        } else{
            System.out.println("O número digitado é impar.");
        }
            sc.close();
    }
}
