package principal;

import modelos.CartaoCredito;
import modelos.Compras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limite = input.nextInt();
        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;

        while (sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricaoCompra = input.next();
            System.out.println("Digite o valor da compra: ");
            double valorCompra = input.nextInt();
            Compras compra = new Compras(descricaoCompra, valorCompra);

            boolean compraRealizada = cartao.lancaCompra(compra);


            if (compraRealizada) {
                System.out.println("Compra realizada!");
                listaCompras.add(compra);
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = input.nextInt();
            } else {
                System.out.println("Saldo insuficiente.");
                break;

            }
        }

        Collections.sort(cartao.getCompras());

        System.out.println("****************** Total de compras ******************");

        for (Compras listaCompra : cartao.getCompras()) {

            System.out.println("Descrição: " + listaCompra.getNome() + " - Valor: " + listaCompra.getValor());
        }
        System.out.println("****************** Saldo do cartão ******************");
        System.out.println(cartao.getSaldo());

    }
}