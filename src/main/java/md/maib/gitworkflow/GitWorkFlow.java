package md.maib.gitworkflow;

import java.util.HashMap;

public class GitWorkFlow {
    public static void main(String[] args) {

        // Steps to follow in a git workflow

        HashMap<Integer, String> steps = new HashMap<>();

        //Add new step
        steps.put(1, "Perform git stash - to store the uncommited cganges                    ");
        steps.put(2, "Perform git pull - to get the latest changes from the remote repository");
        steps.put(3, "Perform git stash pop - to apply the stored changes                    ");
        steps.put(4, "Perform git add . - to add all the changes to the staging area         ");
        steps.put(5, "Perform git commit -m \"Commit message\" - to commit the changes       ");
        steps.put(6, "Perform git push - to push the changes to the remote repository        ");
        steps.put(7, "Perform git merge - to merge the changes from the branch to the master ");
        steps.put(8, "Perform git branch -d branchName - to delete the branch                ");
        steps.put(9, "Perform git checkout -b branchName - to create a new branch            ");
        steps.put(10, "Perform git checkout branchName - to switch to the branch              ");
        steps.put(11, "Perform git log - to see the commit history                            ");
        steps.put(12, "Perform git status - to see the status of the repository               ");
        steps.put(13, "Perform git reset - to unstage the changes                             ");
        steps.put(14, "Perform git reset --hard - to discard the changes                      ");
        steps.put(15, "Perform git fetch - to get the changes from the remote repository      ");

        // Display the steps

        for (int i = 1; i <= steps.size(); i++){
            System.out.println(i + ". " + steps.get(i));
        }
    }
}
