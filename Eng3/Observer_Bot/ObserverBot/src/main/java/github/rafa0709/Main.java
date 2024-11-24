package github.rafa0709;

public class Main {
    public static void main(String[] args) {
        String token = "";
        ChatBot bot = new ChatBot(token);

        ProductObserver product = new ProductObserver("GPU RTX3060 12GB VRAM");
        bot.addObserver(product);
        bot.addObserver(new ServiceObserver("Limpeza de Máquina"));
        bot.pollUpdates();

    }
}