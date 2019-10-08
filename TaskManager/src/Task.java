import java.util.Date;

/**
 * This class is part of the "Task Manager" application.
 * "Task Manager" is a simple, consoled-based to-do list application.
 *
 * This class creates a task object to be used with the TaskList
 *
 * @author  Jessica Shortz
 * @version 2019.10.08
 */

public class Task {
    protected boolean inProgress;
    protected boolean complete;
    protected String partOfProject;
    protected Date dueDate;
    protected String title;
    protected boolean overdue;

    /**
     * Constructor
     * @param title, dueDate, partOfProject Sets initial fields when Task created
     */
    public Task(String title, Date dueDate, String partOfProject) {
        inProgress = false;
        complete = false;
        overdue = false;
        this.title = title;
        this.partOfProject = partOfProject;
        this.dueDate = dueDate;
    }

    /**
     * Sets the title of a task
     * @param newTitle The new title to be assigned to the task
     */
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    /**
     * Sets the due date of a task
     * @param year, month, day, hour, minute Sets the fields of a new Date object that is assigned as dueDate
     */
    public void setDueDate(int year, int month, int day, int hour, int minute) {
        dueDate = new Date((year - 1900), (month - 1), day, hour, minute);
    }

    /**
     * Sets the project of a task
     * @param newProject The name of the new project to be assigned as the task's project
     */
    public void setProject(String newProject) {
        partOfProject = newProject;
    }

    /**
     * Marks a task as complete
     */
    public void markComplete() {
        complete = true;
    }

    /**
     * Marks a task as in progress
     */
    public void markInProgress() {
        inProgress = true;
    }

    /**
     * Controls how the Task is printed as a String
     */
    public String toString() {
        if (inProgress && overdue) {
            return "Title: " + title + "\nDue Date: " + dueDate + "\nProject: " + partOfProject + "\nStatus: In Progress\nWarning! This task is overdue!\n";
        } else if (inProgress && !overdue) {
            return "Title: " + title + "\nDue Date: " + dueDate + "\nProject: " + partOfProject + "\nStatus: In Progress\n";
        } else if (complete) {
            return "Title: " + title + "\nDue Date: " + dueDate + "\nProject: " + partOfProject + "\nStatus: Completed\n";
        } else {
            return "Title: " + title + "\nDue Date: " + dueDate + "\nProject: " + partOfProject + "\nStatus: Added\n";
        }
    }

     /**                                              
      * Checks if status is In Progress
      * @return true if task is in progress
      */
     public boolean isInProgress() {
         if (inProgress) {
             return true;
         } else {
             return false;
         }
     }

     /**
     * Checks if status is complete
     * @return true if task is complete
     */
     public boolean isComplete() {
         if (complete) {
            return true;
        } else {
            return false;
        }
     }

    /**
     * Gets the project of a task
     * @return name of the project as a String
     */
    public String getPartOfProject() {
        return partOfProject;
    }

    /**
     * Gets the due date of a task
     * @return due date of the project as a Date
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Gets the title of a task
     * @return title of the task as a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets overdue to true if task is past due date
     */
    public void isOverdue() {
        if (dueDate.after(new Date())) {
            overdue = true;
        } else {
            overdue = false;
        }
    }
     

}
