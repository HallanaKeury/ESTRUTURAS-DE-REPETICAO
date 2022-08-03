package exercicio;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random radom = new Random();//a classe ramdon serve para gerar numeros aleatórios

        int[] arrayDeNumerosAleatorios = new int[20];

        for (int i = 0 ; i < arrayDeNumerosAleatorios.length; i++){
            int guardaNumerosAleatorios = radom.nextInt(100);
            arrayDeNumerosAleatorios[i] = guardaNumerosAleatorios;
        }

        System.out.print("Números aleatórios: ");
        for (int guardaNumerosAleatorios : arrayDeNumerosAleatorios) { //para cada numero dentro do array de números
            System.out.print(guardaNumerosAleatorios + " ");
        }

        System.out.print("\nAntecessores dos Números aleatórios: ");
        for (int guardaNumerosAleatorios : arrayDeNumerosAleatorios) {
            System.out.print((guardaNumerosAleatorios-1) + " ");
        }

        System.out.print("\nSucessores dos Números aleatórios: ");
        for (int guardaNumerosAleatorios : arrayDeNumerosAleatorios) {
            System.out.print((guardaNumerosAleatorios+1) + " ");
        }

    }
}
