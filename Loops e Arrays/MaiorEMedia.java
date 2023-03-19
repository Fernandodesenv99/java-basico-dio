import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior)
                maior = numero;

            media = media + numero;
            cont++;

        } while (cont < 5);
        System.out.println(" O maior número é " + maior);
        System.out.println( " A média é "+ (media/5));


    }
}