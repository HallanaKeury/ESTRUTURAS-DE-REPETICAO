package Exercicio;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada e qual a operação.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

import java.util.Scanner;

public class TabuadaCompleta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double resultado = 0;
        double EscolhaNumero = 0;
        int operacao = 0;
        int x = 0;
        //int y = 0;
        String sinal = "";


        System.out.println("Você quer a tabuada de qual número ?");
        EscolhaNumero = scan.nextInt();


        System.out.println("Quer tabuada de qual operação? 1 para Soma, 2 para Divisão, 3 para Subtração e 4 para Multiplicação");
        operacao = scan.nextInt();


        for (int i = 0; i <= 10; i++) {
            if ( operacao == 1){
                resultado = (EscolhaNumero + i);
                sinal = " + ";
            } else if (operacao == 2) {
                resultado = (EscolhaNumero / i);
                sinal = "/";
            } else if (operacao == 3) {
                resultado = (EscolhaNumero - i);
                sinal = "-";
            } else if (operacao == 4) {
                resultado = (EscolhaNumero * i);
                sinal = "*";
            }


            System.out.println("Resultado " + EscolhaNumero  +  sinal  + i + " = " +resultado );





        }
    }
}






