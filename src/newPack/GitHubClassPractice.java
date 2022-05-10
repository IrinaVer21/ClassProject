package newPack;

public class GitHubClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Git is a tool to control and manage source code changes.
		GitHub/GitLab/BitBucket/AzureRepo are Repositories.



		Remote Repository: we create this in GitHub
		Local Reposity: this is created in our local drive
		we change directory to the path where our project is stored
		to initialize an empty repository we use git init <> git creates a folder in that
		directory and name it .git



		to check status of git we use command called git status
		to add files into local repository we use command called git add <fileName>
		to add all files we use git add .(add -all) or (add *)
		to commit files into local repo we use command called git commit -m "message"



		to connect with remote repo we use git remote add origin <github repo link>
		to push codes from local repo to remote repo we use command called git push -u origin <branchname>
		 */
		
		int x=10;
		int y=15;
		System.out.println(x+y);
			
	}

}
