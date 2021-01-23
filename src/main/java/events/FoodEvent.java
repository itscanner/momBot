package events;

import net.dv8tion.jda.api.MessageBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;

public class FoodEvent extends ListenerAdapter {
    // handles messages sent in the server
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
//        boolean stop = false;
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        MessageBuilder msgBuilder = new MessageBuilder();

//        to make all functions case insensitive
        this.lowerCase(messageSent);
        for (int i = 0; i < messageSent.length; i++) {
            switch (messageSent[i]) {
                case "dinner":
                    event.getChannel().sendMessage("I made some for you!").addFile(
                            new File("src/jpg/spaghetti.png")).queue();
                default:
                    break;
            }
        }
    }

    private void lowerCase(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
    }

}
