package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;

public class FoodEvent extends ListenerAdapter {
    // handles messages sent in the server
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        boolean stop = false;
        String[] messageSent = event.getMessage().getContentRaw().split(" "); // "i like dinner" -> ["i", "like", "dinner"]

//        to make all functions case insensitive
        this.lowerCase(messageSent);


        for (int i = 0; i < messageSent.length && !stop; i++) {
            switch (messageSent[i]) {
                case "dinner":
                    stop = true;
                    event.getChannel().sendMessage("I made some for you!").addFile(
                            new File("src/jpg/spaghetti.png")).queue();
                    break;

                case "snack":
                    stop = true;
                    event.getChannel().sendMessage("There's food at home").queue();
                    break;

                case "hungry":
                    stop = true;
                    event.getChannel().sendMessage("Just wait until we get home, I'm not wasting money here")
                            .queue();
                    break;

                case "breakfast":
                    stop = true;
                    event.getChannel().sendMessage("I made some just for you son!")
                            .addFile(new File("src/jpg/spaghetti.png")).queue();
                    break;

                case "lunch":
                    stop = true;
                    event.getChannel().sendMessage("Just for you my beautiful son")
                            .addFile(new File("src/jpg/sandwich.jpg")).queue();
                    break;

                case "dessert":
                    stop = true;
                    event.getChannel().sendMessage("Son, you're too fat for dessert, eat a salad instead")
                            .addFile(new File("src/jpg/salad.jpg")).queue();
                    break;

                case "cream":
                    stop = true;
                    event.getChannel().sendMessage("How about instead of eating ice cream, you go eat some " +
                            "ice. It's much healthier for you fat boy").addFile(new File("src/jpg/ice.jpg"))
                            .queue();
                    break;

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
