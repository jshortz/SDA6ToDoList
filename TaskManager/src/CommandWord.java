/**
 * Representations for all the valid command words for the application
 * "Task Manager" along with a string in English.
 *
<<<<<<< HEAD
 * @author  Jessica Shortz, based on work by Michael Kölling and David J. Barnes
=======
 * @author  Jessica Shortz, based on work by Michael Kolling and David J. Barnes
>>>>>>> parser_inclusion
 * @version 2019.10.06
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
<<<<<<< HEAD
    ADD("add task"), EDIT("edit task"), HELP("help"), UNKNOWN("?"),
    SORT( "sort list"), REMOVE( "remove task"), VIEW( "view list"), QUIT( "save and quit");
=======
    ADD("add"), EDIT("edit"), HELP("help"), UNKNOWN("?"),
    SORT( "sort"), REMOVE( "remove"), VIEW( "view"), QUIT( "quit");
>>>>>>> parser_inclusion

    // The command string.
    private String commandString;

    /**
     * Initialise with the corresponding command string.
     * @param commandString The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }

    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        return commandString;
    }
}
