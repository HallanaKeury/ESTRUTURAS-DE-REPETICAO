package Exercicio;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int quantNumeros = 0;
        int par = 0;
        int impar = 0;


        System.out.println("Escolha quantos inteiros");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if ((numero % 2) == 0 ){
                par++;
            }else
                impar++;

            count++;                 //count= count + 1;

        }while (count < quantNumeros);

        System.out.println("Par:  " + par  );
        System.out.println("Ímpar: " + impar );
    }
}
