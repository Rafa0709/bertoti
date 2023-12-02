package biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicado;
    private boolean emprestado;

    public Livro(String nome, String autor, int anoPublicado, boolean emprestado) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.emprestado = false;
    }

    public boolean estaEmprestado(){
        return emprestado;
    }

    public void emprestar(){
        emprestado = true;
        System.out.println("emprestou");
    }

    public void devolver(){
        emprestado = false;
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

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
    
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
