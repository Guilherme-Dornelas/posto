package br.senai.sp.posto;

import java.util.Scanner;

public class posto {
    public static void main(String[] args) {

        /** variaveis */
        float precoGsolina, precoAlcool;
        double vantagem;
        String nome;

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("qual seu nome");
            nome = teclado.next();
            System.out.println("preço da gasolina");
            precoGsolina = teclado.nextFloat();
            System.out.println("preço do alcool");
            precoAlcool = teclado.nextFloat();

            vantagem = precoGsolina * 0.7;

            if (vantagem > precoAlcool) {
                System.out.println("e melhor abastecer com  Gasolina");
            } else {
                System.out.println("e melhor abastecer com Alcool");
            }


        }

    }
}
