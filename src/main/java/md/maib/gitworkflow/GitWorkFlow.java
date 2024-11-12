package md.maib.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {

        // Steps to follow in a git workflow

        String step1 = "Perform git stash - to store the uncommited cganges";
        String step2 = "Perform git pull - to get the latest changes from the remote repository";
        String step3 = "Perform git stash pop - to apply the stored changes";
        String step4 = "Perform git add . - to add all the changes to the staging area";
        String step5 = "Perform git commit -m \"Commit message\" - to commit the changes";
        String step6 = "Perform git push - to push the changes to the remote repository";
        String step7 = "Perform git merge - to merge the changes from the branch to the master";
        String step8 = "Perform git branch -d branchName - to delete the branch";
        String step9 = "Perform git checkout -b branchName - to create a new branch";
        String step10 = "Perform git checkout branchName - to switch to the branch";
        String step11 = "Perform git log - to see the commit history";
        String step12 = "Perform git status - to see the status of the repository";
        String step13 = "Perform git reset - to unstage the changes";
        String step14 = "Perform git reset --hard - to discard the changes";
        String step15 = "Perform git fetch - to get the changes from the remote repository";

        // Display the steps

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);

    }
}
