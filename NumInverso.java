//Crie um programa que receba dois números (a e b) e imprima a variáves e seus valores na ordem
//inversa, ou seja, se a receber 1 e b receber 2 deve ser impresso a=2 e b=1.

public class NumInverso {
    public static void main(String[] args) {
        int x = 100, y = 200;
 
        System.out.println("Antes da troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("Depois da troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
