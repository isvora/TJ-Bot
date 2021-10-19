package org.togetherjava.tjbot.commands.free;

import net.dv8tion.jda.api.interactions.Interaction;

public class Util {
    // private constructor to prevent this class getting instantiated
    private Util() {}

    /**
     * Helper method to easily send ephemeral messages to users.
     * 
     * @param interaction The event or hook that this message is responding to
     * @param message The text to be display for the user to read.
     */
    public static void sendErrorMessage(Interaction interaction, String message) {
        interaction.reply(message).setEphemeral(true).queue();
    }
}