package atividadeestruturadados.questao6;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Java Básico", "João Silva", 2020);
        Livro livro2 = new Livro("POO Avançado", "Maria Souza", 2022);

        Usuario usuario = new Usuario("Carlos", 1);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.emprestarLivro(usuario, livro1);
        biblioteca.emprestarLivro(usuario, livro2);

        biblioteca.devolverLivro(usuario, livro1);
    }
}