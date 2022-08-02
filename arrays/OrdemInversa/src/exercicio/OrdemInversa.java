package exercicio;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        //setando o vetor
        int [] vetor = {3, 5, 6, 7, 5, 3};

        System.out.print("Vetor:  ");

        int count = 0;


        while (count < vetor.length){ //enquanto o count for menor que o comprimento do vetor, faça
            System.out.print(vetor[count] +  "");
            count++;

        }

        System.out.print("\nVetor:  ");

        for (int i = (vetor.length -1); i >= 0 ; i-- ){
            System.out.print(vetor[i] +  "");
        }




    }
}
