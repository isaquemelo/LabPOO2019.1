import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros = new ArrayList<Livro>();
    private int quantidade_livros;

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void removerLivro(long id){
        for (int i = 0; i < this.livros.size(); i++) {
            Livro livro = this.livros.get(i);
            if (livro.getId() == id){
                livros.remove(livro);
                break;
            }
        }
    }

    public Livro getLivro(long id){
        for (int i = 0; i < this.livros.size(); i++) {
            Livro livro = this.livros.get(i);
            if (livro.getId() == id){
                return livro;
            }
        }

        throw new NullPointerException("Nao existe livro com esse id!");


    }

    public ArrayList<Livro> getLivros(){
        return (ArrayList<Livro>) this.livros;
    }

    public void imprimeLivros(){
        for (Livro livro : this.livros) {
            System.out.printf("Nome: %s, ID: %d, Autor: %s\n\n", livro.getNome(), livro.getId(), livro.getAutor());
        }
    }

}
