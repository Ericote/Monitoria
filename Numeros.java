//EX 01: Crie um programa onde o usuário informe um número e imprima em ordem decrescente o seu valor até 0.
import java.util.Scanner;

public class Numeros {
    public static void main(String args[]) {
        int escolha = 0;
        Scanner print = new Scanner(System.in);

        System.out.println("Informe um número: ");
        try {
            escolha = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

        while(escolha != 0){
            escolha--;
            System.out.println("/n Número: " + escolha);
        }

    }
}