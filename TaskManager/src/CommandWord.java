/**
 * Representations for all the valid command words for the application
 * "Task Manager" along with a string in English.
 *
 * @author  Jessica Shortz, based on work by Michael Kolling and David J. Barnes
 * @version 2019.10.06
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    ADD("add"), EDIT("edit"), HELP("help"), UNKNOWN("?"),
    SORT( "sort"), REMOVE( "remove"), VIEW( "view"), QUIT( "quit");

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
