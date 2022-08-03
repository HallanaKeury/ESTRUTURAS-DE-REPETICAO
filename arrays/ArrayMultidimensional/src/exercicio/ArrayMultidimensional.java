package exercicio;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizMultidimensional = new int[4][4];

        for (int linha =0; linha < matrizMultidimensional.length; linha++){
            for (int coluna = 0; coluna < matrizMultidimensional[linha].length; coluna++){
                matrizMultidimensional[linha][coluna] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] ItemLinha : matrizMultidimensional) {
            for (int ItemColuna : ItemLinha) {
                System.out.print(ItemColuna + " ");
            }
            System.out.println();
        }
    }
}
