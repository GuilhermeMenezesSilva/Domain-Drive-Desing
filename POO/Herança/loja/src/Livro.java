public class Livro extends Produto {

    private String autor;

    public Livro(String descricao, double preco, String autor) {
        super(descricao, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return this.getDescricao() + " R$" + this.getPreco() + "(" + this.getAutor() + ")";
    }

}