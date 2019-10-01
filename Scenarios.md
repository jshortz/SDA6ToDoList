## Purpose
: This scenario is meant to walk through the common actions that a user might make while using the Task Manager application.

## User
: User Alpha, a user of Task Manager. Alpha is just starting to use Task Manager and plans on experimenting with all of its functionality.

## Assumptions
: It is assumed that Task Manager is in a good working state that provides feedback sufficient for Alpha to correct themself when using the application incorrectly (for example, setting a task due on February 30, a non-existent date). It is assumed that Alpha has access to a keyboard and can interact with the Task Manager via a command line prompt. It is assumed that Alpha is the only user of the Task Manager (no separate logins are provided).

1. Alpha loads Task Manager and is shown a welcome screen with a list of possible commands to type in: View Tasks, Add Task, Edit Task, Sort Tasks, Search Tasks, Delete Task, Save and Quit, and Help. 
2. Not knowing how to use Task Manager, Alpha types "help".
3. Alpha is then shown the Task Manager User Manual (possibly a truncated version). The User Manual explains each of the commands and how each entry must be formatted. 
4. Curious what the tasks will show upon an initial state, Alpha types "View tasks".
5. Task Manager informs Alpha that there are currently no tasks stored in Task Manager. 
6. Alpha then attempts to "Add Task". A series of command line prompts appears, asking Alpha to enter the task's title, due date, and associated project (if any).
7. Alpha dutifully enters these fields ("Walk Dog", "2019.10.22", "Fido"), and is prompted to correct any mistakes in any given entry. 
8. Alpha then asks again to "View Tasks" and is shown "Task: Walk Dog; Due: 2019.10.22; Project: Fido".
9. Alpha again chooses "Add Task" ("Walk Cat", "2019.10.21", "Felix").
10. Alpha asks again to "View Tasks" and is shown "Task: Walk Cat; Due: 2019.10.21; Project: Felix. Task: Walk Dog; Due: 2019.10.22, Project: Fido", with the tasks separated into separate lines. 
11. Alpha chooses to "Add Task" ("Walk Cat", "2019.10.18", "Felix").
12. Alpha chooses "Sort Tasks" and is prompted to enter which field (title, due date, project) to sort by. Alpha enters "Project". 
13. Alpha chooses "View Tasks" and is shown the three tasks: the two Felix tasks shown first, followed by Fido. 
14. Realizing that walking a cat is an endeavor doomed to fail, Alpha types "Delete Task" and is asked whether they wish to delete the task by title or whether to delete all tasks related to a single project. Alpha types "Project" and then "Felix" when prompted for the project name. Had Alpha instead typed "Title", Task Manager would have told Alpha that there are two tasks with that title and prompted Alpha to enter the due date of the task that should be deleted.
15. Alpha next chooses "Edit Task" and is prompted to enter a Title. If multiple tasks had the same title, Alpha would be prompted to enter a due date to choose which task to edit. Alpha enters "Walk Dog". Alpha is asked if they want to edit the title of "Walk Dog". Alpha types "yes" and is asked to enter the new title ("Walk Fido"). Alpha is asked if they want to edit the due date of "Walk Dog". Alpha types "no". Alpha is finally asked if they wish to change the project associated with "Walk Dog". Alpha types "No". 
16. Alpha chooses "Save and Quit" and is told that the Task Manager has successfully saved the file. The application terminates. 
17. Days later, Alpha loads Task Manager. Alpha cannot remember whether the exact title of their task and chooses "Search Tasks". Alpha is asked whether they wish to search by title, project, or due date. Alpha types "title" and "Fido" when prompted to enter a search term. Task Manager then displays all the tasks that contain "Fido" in the title. 