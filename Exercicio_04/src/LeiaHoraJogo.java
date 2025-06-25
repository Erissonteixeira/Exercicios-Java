import java.util.Scanner;

public class LeiaHoraJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora de inicio do jogo: ");
        int inicio = sc.nextInt();
        System.out.println("Informe a hora de termino do jogo: ");
        int termino = sc.nextInt();

       int duracao;
       if (inicio < termino){
           duracao = termino - inicio;
       } else{
           duracao = 24 - inicio + termino;
       }
        System.out.println("O jogo Durou: " + duracao + " Hora's ");
        sc.close();
    }

}
