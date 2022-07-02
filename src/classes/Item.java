package classes;

public class Item {
    private int codigo;
    private String nomeItem;
    private int qtdComprada;
    private double precoUnitario;

    public Item(int codigo, String nomeItem, int qtdComprada, double precoUnitario) {
        this.codigo = codigo;
        this.nomeItem = nomeItem;
        this.qtdComprada = qtdComprada;
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
