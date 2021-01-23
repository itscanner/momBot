import events.FoodEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) {
        // Build JDA Object
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODAyMzQwMTQzOTYzOTYzNDAy.YAtzfQ.oUvbV-ZFRYxiJ17qUI0ff5ZiCHU");
        JDA jda;
        try {
            jda = jdaBuilder.build();
            jda.addEventListener(new FoodEvent());
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
