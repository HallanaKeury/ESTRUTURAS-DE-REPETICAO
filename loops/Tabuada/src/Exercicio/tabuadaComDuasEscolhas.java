package Exercicio;

import java.util.Scanner;

public class tabuadaComDuasEscolhas {

    static double resultado = 0;
    static double EscolhaNumero = 0;
    static int operacao = 0;
    static String sinal = "";

    public static void main(String[] args) {

        tabuada();

        soma();
        //subtracao();
        //divisao();
        //multiplicacao();



    }

    public static void tabuada(){
        Scanner scan = new Scanner(System.in);
        //int x = 0;
        //int y = 0;



        System.out.println("Você quer a tabuada de qual número ?");
        EscolhaNumero = scan.nextInt();


        System.out.println("Quer tabuada de qual operação? 1 para Soma, 2 para Divisão, 3 para Subtração e 4 para Multiplicação");
        operacao = scan.nextInt();


        for (int i = 0; i <= 10; i++) {
            if ( operacao == 1){
                soma();
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
    public static void soma() {
        resultado = (EscolhaNumero + i);
        sinal = " + ";
    }
}
