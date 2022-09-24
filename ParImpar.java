// EX 02: Crie um programa que imprima em tela os números ímpares entre 0 e 30 e, após, os números pares entre 0 e 30.

public class ParImpar {
    public static void main(String[] args) {
        int num = 30;
        for(int i = 0; i <= 30; i++) {
            System.out.println(i);
        }

        System.out.println("\n Todos números pares: ");
        for(int i = 0; i <= 30; i++) {
            if(i % 2 == 0) {
                System.out.println(" " + i); 
            }
        }

        System.out.println("\n Todos números impares: ");
        for(int i = 0; i <= 30; i++) {
            if(i % 2 == 1) {
                System.out.println(" " + i);  
            }
        }
    }
}
