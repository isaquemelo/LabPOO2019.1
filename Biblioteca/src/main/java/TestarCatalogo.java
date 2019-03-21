import java.util.ArrayList;
import java.util.Optional;

public class TestarCatalogo {

    public static void main(String[] args){
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro(new Livro(230, "Black wholes", "Stephen Hawking", "Prefacio aqui"));
        catalogo.adicionarLivro(new Livro(122, "World war I", "Math Steve", "Prefacio aqui"));
        catalogo.adicionarLivro(new Livro(100, "Principia", "Isaac Newton", "Prefacio aqui"));
        catalogo.adicionarLivro(new Livro(180, "My Fight", "Adolf Hitler", "Prefacio aqui"));

        catalogo.imprimeLivros();
        catalogo.getLivro(100).info();
        catalogo.removerLivro(180);

        ArrayList<Livro> livros = catalogo.getLivros();



    }

}
