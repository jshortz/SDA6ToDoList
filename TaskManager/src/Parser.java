import java.util.Scanner;
<<<<<<< HEAD
=======
import java.util.Date;
import java.util.HashMap;
import java.io.FileNotFoundException;
>>>>>>> parser_inclusion

/**
 * This class is part of the "Task Manager" application.
 * "Task Manager" is a simple, console-based to-do list application.
 *
 * This parser reads user input and tries to interpret it as a command.
 * Every time it is called, it reads a line from the terminal and
 * tries to interpret the line as a two-word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 *
<<<<<<< HEAD
 * @author  Jessica Shortz, based on work by Michael Kölling and David J. Barnes
=======
 * @author  Jessica Shortz, based on work by Michael Kolling and David J. Barnes
>>>>>>> parser_inclusion
 * @version 2019.10.06
 */

public class Parser
{
    private CommandWords commands;  // holds all valid command words
<<<<<<< HEAD
    private Scanner reader;         // source of command input
=======
    protected Scanner reader;         // source of command input
>>>>>>> parser_inclusion

    /**
     * Create a parser to read from the terminal window.
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
<<<<<<< HEAD
=======
     * Gets a date by prompting the user for inputs
     * @return Date from user
     */
    public Date getDate()
    {
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        System.out.println("What is the year this task is due in? Please enter as 4 digits, XXXX (2019-9999).");
        int inputLine = reader.nextInt();
        // Scanner tokenizer = new Scanner(System.in);
        if(reader.hasNextInt()) {
            year = reader.nextInt();
        }

        System.out.println("What month is the task due in? Please enter as two digits, XX (01-12).");
        if(reader.hasNextInt()) {
            while (reader.nextInt() < 1 || reader.nextInt() > 12) {
                System.out.println("Please enter a valid month, 1-12.");
                inputLine = reader.nextInt();
            }
            month = reader.nextInt();
        }

        System.out.println("What day is the task due on? Please enter as two digits, XX (01-31).");
        if(reader.hasNextInt()) {
            while (reader.nextInt() < 1 || reader.nextInt() > 31) {
                System.out.println("Please enter a valid day, 1-31.");
                inputLine = reader.nextInt();
            }
            day = reader.nextInt();
        }

        System.out.println("What hour is the task due on? Please enter as two digits, XX (00-23).");
        if(reader.hasNextInt()) {
            while (reader.nextInt() < 0 || reader.nextInt() > 23) {
                System.out.println("Please enter a valid hour, 0-23.");
                inputLine = reader.nextInt();
            }
            hour = reader.nextInt();
        }

        System.out.println("What minute is the task due? Please enter as two digits, XX (00-59).");
        if(reader.hasNextInt()) {
            while (reader.nextInt() < 1 || reader.nextInt() > 12) {
                System.out.println("Please enter a valid minute, 00-59.");
                inputLine = reader.nextInt();
            }
            minute = reader.nextInt();
        }

        return new Date(year, month, day, hour, minute);
    }

    /**
>>>>>>> parser_inclusion
     * @return The next command from the user.
     */
    public Command getCommand()
    {
<<<<<<< HEAD
=======
        System.out.println("What would you like to do?");
>>>>>>> parser_inclusion
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
<<<<<<< HEAD
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        return new Command(commands.getCommandWord(word1), word2);
=======
            // if(tokenizer.hasNext()) {
               //  word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            // }
        }

        return new Command(commands.getCommandWord(word1));
>>>>>>> parser_inclusion
    }

    /**
     * Print out a list of valid command words.
     */
<<<<<<< HEAD
    public void showCommands()
    {
        commands.showAll();
    }
=======
    //public void showCommands()
    // {
        // commands.showAll();
    // }
>>>>>>> parser_inclusion
}
