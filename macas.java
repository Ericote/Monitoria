//Crie um programa em que receba a quantidade de maçãs a serem compradas, onde estas custam R$
//1,30 caso sejam comprado menos de uma dúzia e R$ 1,00 caso for comprado mais de uma dúzia.
//Deverá ser impresso o total da compra.

import java.util.Scanner;

public class macas {
    public static void main(String[] args) {
        int maca = 0;
        double preco = 0.0;
        Scanner print = new Scanner(System.in);

        System.out.println("Quantas maçãs deseja comprar? ");
        try {
            maca = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

        if(maca<12){
            preco = (maca * 1.30);
            System.out.println("Você comprou " +maca+ " maçãs, o total da compra é R$ "+ preco );
        }
        if(maca>=12){
            preco = (maca * 1.00);
            System.out.println("Você comprou " +maca+ " maçãs, o total da compra é R$ "+ preco );
        }

    }
}
