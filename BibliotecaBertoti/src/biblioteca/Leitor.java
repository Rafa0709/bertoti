package biblioteca;


import java.util.List;
import java.util.ArrayList;
public class Leitor {
    private String nome;
    private int idade;
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public Leitor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void pegarEmprestado(Livro livro) {
        livro.emprestar();
    }

    public void devolver(Livro livro){
        livro.devolver();
        livrosEmprestados.remove(livro);
    }

}
