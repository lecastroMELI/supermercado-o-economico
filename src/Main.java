import bancoDeDados.BdCliente;
import classes.Cliente;

public class Main {
    public static void main(String[] args) {
        BdCliente bdCliente = new BdCliente();

        // CRIANDO 3 CLIENTES
        Cliente cliente1 = new Cliente(001L, "Wonder", "Woman");
        Cliente cliente2 = new Cliente(002L, "Steve", "Trevor");
        Cliente cliente3 = new Cliente(003L, "Iron", "Man");

        // SALVANDO OS OBJETOS NA LISTA DE CLIENTES
        bdCliente.salvar(cliente1);
        bdCliente.salvar(cliente2);
        bdCliente.salvar(cliente3);

        bdCliente.exibirTodosNaTela();
    }
}
