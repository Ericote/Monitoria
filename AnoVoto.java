//Crie um programa que receba o ano e mês de nascimento da pessoa (ambos em numéricos) e indique
//se ela poderá votar esse ano.

import java.util.Scanner;
public class AnoVoto {
    public static void main(String[] args) {
        int ano = 0;
        int mes = 0;
        Scanner print = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento: ");
        try {
            ano = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

        System.out.println("Informe o mês de nascimento: ");
        try {
            mes = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

        int idade = (2022 - ano);

        if(idade < 16){
            System.out.print("Sua idade é: "+ idade +" anos, você é muito novo ainda, não pode votar!");
        }
        if(idade>=16){
            System.out.print("Sua idade é: "+ idade +" anos, você já pode votar!");
        }

    }
} 



