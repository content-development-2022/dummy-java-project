# dummy-java-project

## Please follow the steps given below to push a java project from your computer to a remote github repository

### Pre-requisite: Create a remote repository in your Github Account 

### Step 1 - Gitbash in the working directory

 - Right click on the working directory(the directory where you have your project)
 - Click on Git bash here
 - This will open the git bash terminal
 - Then run the commands in the following sequence

### Step 2 - Create a local git repository in the working director

 - The git command to create a local git repository in the working directory is 
       git init

### Step 3 - Add a README.md file

 - Add a README.md file in the working directory because the remote repository has a README.md file

### Step 3 - Change master branch to main branch

 - The git command to change the master branch of local repo to main branch 
       git branch -M main

### Step 4 - Add all files to staging

 - The git command to add all the files of current folder(.) to staging is
       git add .

### Step 5 - Commit all the files from staging to local repo with a commit message

 - The git command is 
       git commit -m "<comit message>"

### Step 6 - Configure local git with user name and email so we will know who pushed the code to github

 - The git commands are
 
       git config --global user.name "<username>"

       git config --global user.email "<emailid>"

### Step 7 - Specify the remote github repository url to which we would want to push the files to
 
 - The git command is
  
       git remote add origin <github url>

### Step 8 - Push the files to the remote repo

 - The git command is
 
       git push --set-upstream origin main

 - If remote repo is 1 or more comit ahead of local repo we will get the error
 
      fatal: refusing to merge unrelated histories

 - To fix this run the command (this will pull the remote repo and merge it with the local repo)
 
      git pull origin main --allow-unrelated-histories

 - And then run the command once again

      git push --set-upstream origin main
