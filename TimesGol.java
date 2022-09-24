
import java.util.Scanner;
public class TimesGol {
    public static void main(String[] args) {
        int time1 = 0;
        int time2 = 0;
        int gols = 0;
        Scanner print = new Scanner(System.in);

        System.out.println("Quantos Gols o Time 1 fez? ");
        try {
            time1 = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

        System.out.println("Quantos Gols o Time 2 fez? ");
        try {
            time2 = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

      if(time1>time2){
        System.out.println("O vencedor da partida foi o Time 1, com "+time1+" gols!");
      }
      if(time2>time1){
        System.out.println("O vencedor da partida foi o Time 2, com "+time2+" gols!");
      }
      if(time1==time2){
        System.out.println("EMPTATE!!!");
      }


    }
}
