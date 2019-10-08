

/**
 * This class is part of the "Task Manager" application.
 * "Task Manager" is a simple, consoled-based to-do list application.
 *
 * This class runs the main functionalities of the application, including
 * the main method.
 *
 * @author  Jessica Shortz
 * @version 2019.10.08
 */

public class TaskManager
{

    /**
     * Save the to-do list to an external file and quit the application
     * @param filename The filename for the list to be saved to
     */

    public void saveAndQuit(String filename)
    {
        String path = filename;
        String content = taskList.toString();
        try {
            Files.writeString(Paths.get(path), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Display the  contents of the user manual
     * @param filename The filename containing the user manual
     * @return A String containing the contents of the user manual file
     */

    public static void displayHelp(String filename)
    {

    }

    /**
     * Display the  contents of the chosen TaskList
     * @param tasklist The TaskList to be displayed
     * @return A String containing the contents of the chosen TaskList
     */

    public static void displayTaskList()
    {
        System.out.println(taskList.toString());
    }

    /**
     * Load the contents of the tasklist saved file to be the current tasklist
     * @param filename The file to be used to populate the list
     */

    public void loadTaskList(String filename)
    {

    }

    /**
     * Display a welcome message to the user
     */

    public static void printWelcome()
    {
        System.out.println("Welcome to Task Manager, a program to manage a to-do list!");
    }

    /**
     * Main method used to run core functionalities of system
     */

    public static void main(String[] args) {
        printWelcome();
        displayTaskList();
    }
}