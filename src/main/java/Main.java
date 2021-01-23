import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODAyMzQwMTQzOTYzOTYzNDAy.YAtzfQ.oUvbV-ZFRYxiJ17qUI0ff5ZiCHU");
        JDA jda;
        try {
            jda = jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
