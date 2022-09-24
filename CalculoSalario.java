//. Crie um programa que receba o valor do salário em horas e a quantidade de horas trabalhadas em
//uma semana, imprimindo em tela o valor a ser recebido pelo funcionário. Caso a jornada seja maior
//que 40 horas o excedente deverá ser pago com acréscimo de 50%.


import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class CalculoSalario {
  public static void main(String[] args) {
    Double salarioHora = 0.0;
    Double horaTrabalhada = 0.0;
    Scanner print = new Scanner(System.in);

    System.out.println("\n Informe o salário por hora: ");
    try {
        salarioHora = print.nextDouble(); 
    } catch (Exception e) {
        System.out.println("Ops! Ocorreu um erro!");
    }
    

    System.out.println("\n Informe a quantidade de hora trabalhada: ");

    try {
        horaTrabalhada = print.nextDouble(); 
    } catch (Exception e) {
        System.out.println("Ops! Ocorreu um erro!");
    }

    Double salario = salarioHora * horaTrabalhada;

    System.out.print("\n Você recebeu R$" + salario);
    
    if (horaTrabalhada > 40.0) {
        System.out.print("\n Porém você trabalhou mais que esperado, portanto receberá um acrescimo de R$ " + (salario + (salario/2)));
    }
  }
}
