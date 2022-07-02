package classes;

import java.util.List;

public class Fatura {
    private Long idFatura;
    private Cliente cliente;
    private List<Item> listaItens;
    private double totalCompra;

    public Fatura(Long idFatura, Cliente cliente, List<Item> listaItens) {
        this.idFatura = idFatura;
        this.cliente = cliente;
        this.listaItens = listaItens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public double getTotalCompra() {
        this.totalCompra = 0;
        for(Item i : listaItens) {
            totalCompra += i.getPrecoUnitario() * i.getQtdComprada();
        }
        return totalCompra;
    }

    @Override
    public String toString() {
        return "Fatura {" +
            "ID Fatura" + idFatura +
            ", cliente=" + cliente +
            ", totalCompra=" + totalCompra +
            '}';
    }
}
