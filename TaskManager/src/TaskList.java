import java.util.ArrayList;

/**
 * This class is part of the "Task Manager" application.
 * "Task Manager" is a simple, consoled-based to-do list application.
 *
 * This class creates a list to hold Task objects and provides methods to make
 * alterations to the list
 *
 * @author  Jessica Shortz
 * @version 2019.10.07
 */

public class TaskList
{
    // an ArrayList to hold the list of Tasks
    private ArrayList<Task> taskList;

    /**
     * Constructor - creates an empty list, taskList
     */
    public TaskList()
    {
        taskList = new ArrayList<Task>();
    }

    /**
     * Add a task to the taskList
     * @param Task to be added to the list
     */
    public void addTaskToList(Task taskToAdd)
    {
        taskList.add(taskToAdd);
    }

    /**
     * Remove a selected task from the taskList by title
     * @param title of task to be removed
     */
    public void removeTaskByTitle(String taskTitleToRemove)
    {
        taskList.remove(taskTitleToRemove);
    }

    /**
     * Remove all tasks associated with a particular project
     * @param project title to be removed
     */
    public void removeTaskByProject(String taskProjectToRemove)
    {
        // Loop over list and collect all by project
        taskList.remove(taskProjectToRemove);
    }

    /**
     * Edit a selected task from the taskList
     * @param Task to be edited
     */
    public void editTask(Task taskToEdit)
    {

    }

    /**
     * Sort list by titles alphabetically
     */
    public void sortListByTitle()
    {

    }

    /**
     * Sort list by soonest due date
     */
    public void sortListByDueDate()
    {

    }

    /**
     * Sort list by projects alphabetically
     */
    public void sortListByProject()
    {

    }

    /**
     * Check whether there are two tasks with the same title
     * @param title to be checked
     * @return Boolean (true if duplicate title, false otherwise)
     */
    public boolean isDuplicateTitle(String titleToBeChecked)
    {

    }


}
