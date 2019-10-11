import java.util.ArrayList;
import java.nio.file.*;
import java.io.IOException;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 * This class is part of the "Task Manager" application.
 * "Task Manager" is a simple, consoled-based to-do list application.
 *
 * This class creates a list to hold Task objects and provides methods to make
 * alterations to the list, as well as methods to run the program and interact with the list.
 *
 * @author  Jessica Shortz
 * @version 2019.10.08
 */

public class TaskList
{
    // an ArrayList to hold the list of Tasks
    protected static ArrayList<Task> taskList = new ArrayList<>();
    private static Parser parser;

    /**
     * Constructor - creates an empty list, taskList
     */
    public TaskList()
    {
        parser = new Parser();
        taskList = new ArrayList<Task>();
    }

    /**
     * Collect user input to create a Task to add to the list
     * @param taskToAdd Task to be added to the list
     */
    // This assumes that each task is given a variable name - if used as generics, change this
    public static void createTask()
    {
        System.out.println("What is the title of your new task?");
        String title = parser.reader.nextLine();
        Date dueDate = parser.getDate();
        System.out.println("What project is this task associated with?");
        String project = parser.reader.nextLine();

        taskList.add(new Task(title, dueDate, project));
    }

    /**
     * Add a task to the taskList
     * @param taskToAdd Task to be added to the list
     */
    // This assumes that each task is given a variable name - if used as generics, change this
    public void addTaskToList(Task taskToAdd)
    {
        taskList.add(taskToAdd);
    }

    /**
     * Remove a selected task from the taskList by title
     * @param taskTitleToRemove title of task to be removed
     */
    // Implementation of getting from user will need to include determining which task by variable name
    public void removeTaskByTitle(String taskTitleToRemove)
    {
        taskList.remove(taskTitleToRemove);
    }

    /* CURRENTLY A REACH IMPLEMENTATION, NOT REQUIRED BY DOCUMENTATION
    /**
     * Remove all tasks associated with a particular project
     * @param taskProjectToRemove project title to be removed

    public void removeTaskByProject(String taskProjectToRemove)
    {
        // Loop over list and collect all by project
        // TODO: Use stream.filter to do this
        taskList.remove(taskProjectToRemove);
    }
    */

    /**
     * Edit a selected task from the taskList
     * @param taskToEdit Task to be edited
     */
    public void editTask(Task taskToEdit, String newTitle, String project, Date newDueDate, boolean progress, boolean isComplete)
    {
        taskToEdit.title = newTitle;
        taskToEdit.partOfProject = project;
        taskToEdit.dueDate = newDueDate;
        taskToEdit.inProgress = progress;
        taskToEdit.complete = isComplete;
    }

    /**
     * Sort list by titles alphabetically
     */
    public void sortListByTitle()
    {
        // TODO: IMPLEMENT
    }

    /**
     * Sort list by soonest due date
     */
    public void sortListByDueDate()
    {
        // TODO: IMPLEMENT
    }

    /**
     * Sort list by projects alphabetically
     */
    public void sortListByProject()
    {
        // TODO: IMPLEMENT
    }

    /**
     * Check whether there are two tasks with the same title
     * @param titleToBeChecked title to be checked
     * @return Boolean (true if duplicate title, false otherwise)
     */
    public boolean isDuplicateTitle(String titleToBeChecked)
    {
        //TODO: COMPLETE IMPLEMENTATION
        return false;
    }

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

    public static void displayHelp()
    {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("UserManual.txt"));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException f) {
            System.out.println(f.getMessage());
        } finally {
            // in.close();
        }
    }

    /**
     * Display the  contents of the chosen TaskList
     * @param tasklist The TaskList to be displayed
     * @return A String containing the contents of the chosen TaskList
     */

    public static void displayTaskList()
    {   System.out.println();
        System.out.println(taskList.get(0).toString());
        System.out.println(taskList.get(1).toString());
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
     * Method that runs the program and processes user inputs
     */

    public static void run()
    {
        printWelcome();

        // program will continue accepting commands until <finished> is true
        // only saving and quitting will set <finished> to true
        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("We hope you enjoyed using Task Manager. Your task list has been saved and can be viewed the next time you run the program.");

    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true if the command ends the application, false otherwise.
     */
    private static boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();

        switch (commandWord) {
            case UNKNOWN:
                System.out.println("Please enter a valid command.");
                break;
            case HELP:
                displayHelp();
                break;
            case VIEW:
                displayTaskList();
                break;
            case ADD:
                createTask();
            // case QUIT:
                // wantToQuit = quit(command);
                // break;
        }
        return wantToQuit;
    }


    /**
     * Main method used to run core functionalities of system
     */

    public static void main(String[] args) {
        // Date current = new Date();
        // Task dishes = new Task("Wash the dishes", current, "Household");
        // addTaskToList(dishes);
        // Task laundry = new Task("Put in machine", current, "Household");
        // addTaskToList(laundry);
        printWelcome();
        // displayTaskList();
        run();
    }

}
