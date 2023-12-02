package biblioteca;


public class Main {
    public static void main(String[] args) {
        Leitor leitor1 = new Leitor("Giuliano", 37);
        Autor autor1 = new Autor("Cortela", "Brasileiro");
        Livro livro1 = new Livro("Viva Feliz", "Cortela",2010,true);

        leitor1.pegarEmprestado(livro1);
        
        
        
    }
}
