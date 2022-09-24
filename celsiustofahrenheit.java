//Crie um programa que faça a conversão de oC para oF.

import java.util.Scanner;
class celsiustofahrenheit {
    public static void main(String[] args)
    {
        double celsius = 0.0, fahrenheit = 0.0;
        Scanner print = new Scanner(System.in);
        
        System.out.println("Insira a temperatura em graus Celsius: ");
        try {
            celsius = print.nextInt(); 
        } catch(Exception e) {
            System.out.println("Ops! Ocorreu um erro!");
        }

        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(
            " Valor da temperatura em fahrenheit:"
            + fahrenheit);
    }
}
