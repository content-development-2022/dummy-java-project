# dummy-java-project

first git bash in the working directory
run the commands in the following sequence


step 1- create a local git repository in the working director
-----------------------------------------------------
git init

step2
-----
add a README.md file in the working directory because the remote repository has a README.md file

step3
------
 - change the master branch of local repo to main
git branch -M main

step 4
-------
 - add all the files of current folder(.) to staging
git add .

step 5 - commit all the files from staging to local repo with a commit message
------------------------------------------------------------------------------
git commit -m "lambda demo completed"

step 6 - configure local git with user name and email so we will know who pushed the 
code to github
------------------------------------------------------------------------------------
git config --global user.name "Poongs"

git config --global user.email "bpoongs1982@gmail.com"

step 7 - specify the remote github repo to which we would want to push the files to
------------------------------------------------------------------------------------
git remote add origin https://github.com/content-development-2022/dummy-java-project.git

step 8 - push the files to the remote repo
-------------------------------------------
git push --set-upstream origin main


if remote repo is 1 or more comit ahead of local repo we will get the error
fatal: refusing to merge unrelated histories

to fix run the command ( this will pull the remote repo and merge it with the local repo)
git pull origin main --allow-unrelated-histories
and then do step 8
