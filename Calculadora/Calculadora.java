package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int op;
        float numero1=0;
        float numero2=0;
        do{
            System.out.println("\t xxxxx CALCULADORA xxxxx");
            System.out.println("\t xxxxx Menu xxxxx");
            System.out.println("1- Calculadora.Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão \n 5-Sair ");
            op = sc.nextInt();
            if(op < 5) {
                System.out.println("Digite o primeiro número: ");
                numero1 = sc.nextFloat();
                System.out.println("Digite o segundo número: ");
                numero2 = sc.nextFloat();
            }

            switch (op){
                case 1:
                    Soma soma = new Soma( numero1, numero2);
                    System.out.println(soma.pegarValor()); //caso a pessoa queira utilizar em outro calculo então retorna um float
                    System.out.println(soma.resultadoCalculo());
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao( numero1, numero2);
                    System.out.println(subtracao.pegarValor());
                    System.out.println(subtracao.resultadoCalculo());
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao( numero1, numero2);
                    System.out.println(multiplicacao.pegarValor());
                    System.out.println(multiplicacao.resultadoCalculo());
                    break;
                case 4:
                    Divisao divisao = new Divisao(numero1, numero2);
                    System.out.println(divisao.pegarValor());
                    System.out.println(divisao.resultadoCalculo());
                    break;
                case 5:
                    System.out.println("\t xxxxx Fim da calculadora xxxxx");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;

            }

        }
        while (op !=5);



    }
}
