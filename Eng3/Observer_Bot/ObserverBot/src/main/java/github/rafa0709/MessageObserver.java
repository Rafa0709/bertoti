package github.rafa0709;


import com.pengrad.telegrambot.TelegramBot;

public interface MessageObserver {
    String getName();
    void onMessageReceived(String chatId, String message , TelegramBot bot);

}
