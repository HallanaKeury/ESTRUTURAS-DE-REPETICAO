package exercicio;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6]; //apontando o vetor e a quantidade de posições
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println(" Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                consoantes[count] = letra;
                quantidadeConsoantes++;

            }

            count++;

        }while (count < consoantes.length);


        //o foreach sempre lê o array completo
        System.out.print("Consoantes:  ");
        for (String exibeConsoante: consoantes) {
            //Se exibeConsoante for diferente de null exiba, porque a variável String exibe assim, e o foreach lê o array completo
            if (exibeConsoante != null)
                System.out.print(exibeConsoante + " ");


        }
        System.out.print("QuantidadeDeConsoantes " + quantidadeConsoantes);






    }
}
