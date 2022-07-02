package interfaces;

// INTERFACE IMPLEMENTADA COM BASE NO REPO: https://github.dev/MauriKlein/com.dh.meli.supermercadoOEconomico
public interface Repository<T> {
    public void salvar(T objeto);
    public void exibirTodosNaTela();
}
