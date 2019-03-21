public class Livro {
    private String nome;
    private String autor;
    private String prefacio;
    private long id;

    Livro(){

    }

    Livro(long id, String nome, String autor, String prefacio){
        setId(id);
        setNome(nome);
        setAutor(autor);
        setPrefacio(prefacio);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrefacio() {
        return prefacio;
    }

    public void setPrefacio(String prefacio) {
        this.prefacio = prefacio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void info(){
        System.out.printf("Nome: %s, ID: %d, Autor: %s\n\n", this.getNome(), this.getId(), this.getAutor());
    }
}
