/**
 * This class is part of the "Task Manager" application.
 * "Task Manager" is a simple, console-based to-do list application.
 *
 * This class holds information about a command that was issued by the user.
 * A command currently consists of two parts: a CommandWord and a string
 * (for example, if the command was "sort list", then the two parts
 * are SORT and "list").
 *
 * The way this is used is: Commands are already checked for being valid
 * command words. If the user entered an invalid command (a word that is not
 * known) then the CommandWord is UNKNOWN.
 *
 * If the command had only one word, then the second word is <null>.
 *
<<<<<<< HEAD
 * @author  Jessica Shortz, based on work by Michael Kölling and David J. Barnes
=======
 * @author  Jessica Shortz, based on work by Michael Kolling and David J. Barnes
>>>>>>> parser_inclusion
 * @version 2019.10.06
 */

public class Command
{
    private CommandWord commandWord;
    private String secondWord;

    /**
     * Create a command object. First and second words must be supplied, but
     * the second may be null.
     * @param commandWord The CommandWord. UNKNOWN if the command word
     *                  was not recognised.
     * @param secondWord The second word of the command. May be null.
     */
<<<<<<< HEAD
    public Command(CommandWord commandWord, String secondWord)
    {
        this.commandWord = commandWord;
        this.secondWord = secondWord;
=======
    public Command(CommandWord commandWord)
    {
        this.commandWord = commandWord;
        // this.secondWord = secondWord;
>>>>>>> parser_inclusion
    }

    /**
     * Return the command word (the first word) of this command.
     * @return The command word.
     */
    public CommandWord getCommandWord()
    {
        return commandWord;
    }

    /**
     * @return The second word of this command. Returns null if there was no
     * second word.
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * @return true if this command was not understood.
     */
    public boolean isUnknown()
    {
        return (commandWord == CommandWord.UNKNOWN);
    }

    /**
     * @return true if the command has a second word.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}

