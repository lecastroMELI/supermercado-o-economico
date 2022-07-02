package bancoDeDados;

import classes.Cliente;
import interfaces.Repository;

import java.util.ArrayList;
import java.util.List;

// IMPLEMENTAÇÃO COM BASE NO REPO: https://github.dev/MauriKlein/com.dh.meli.supermercadoOEconomico
public class BdCliente implements Repository<Cliente> {
    // DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
    List<Cliente> listaClientes;

    // CRIAÇÃO  DO CONSTRUTOR DA CLASSE
    public BdCliente() {
        this.listaClientes = new ArrayList<>();
    }

    // IMPLEMENTAÇÃO DOS MÉTODOS DA CLASSE
    @Override
    public void salvar(Cliente objeto) {
        listaClientes.add(objeto);
    }

    @Override
    public void exibirTodosNaTela() {
        // listaClientes.forEach(System.out::println); TEM QUE IMPLEMENTAR O toString NA CLASSE CLIENTE
        // OUTRA FORMA DE MOSTRAR
        for(Cliente cli : listaClientes) {
            System.out.println(
                "ID: " + cli.getId() + " - " +
                "Nome: " + cli.getNome().toUpperCase() + " " +
                "Sobrenome: " + cli.getSobrenome().toUpperCase()
            );
        }
    }
}
