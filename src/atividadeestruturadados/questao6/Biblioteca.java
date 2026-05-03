package atividadeestruturadados.questao6;

public class Biblioteca {

    public void emprestarLivro(Usuario usuario, Livro livro) {
        usuario.livrosEmprestados.add(livro);
        System.out.println("Livro emprestado: " + livro.titulo);
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        usuario.livrosEmprestados.remove(livro);
        System.out.println("Livro devolvido: " + livro.titulo);
    }
}