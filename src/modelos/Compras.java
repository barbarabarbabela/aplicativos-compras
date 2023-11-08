package modelos;

public class Compras implements Comparable<Compras> {
    private String nome;
    private double valor;

    @Override
    public String toString() {
        return "Compras: Descrição: " + nome + " - " +
                "Valor: " + valor;
    }

    public Compras(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
