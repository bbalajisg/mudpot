# DevOps

## DevOps

### Instructions

* Please create a yaml file called answers.yml in the directory in which you found these questions.
* For each question, add a corresponding entry in answers.yml if the question requires it (structure the yaml file however you like).
* Answer as many questions as you can in the available time.
* Make sure that all work done to answer a question is added as a separate git commit.
* Ensure that answers.yaml validates once completed.
* Finally zip up this directory and return it via email to your contact at DB.

### Questions

1. Fix the bash file `q3.sh` that can be found alongside this document: the echoed `active_container_id` isn't present, but it should be (note: don't make changes to `q3.json`).
2. What are the key differences between TeamCity and Jenkins when it comes to configuring build pipelines? **Max 100 words**
3. If you're familiar with Open Shift / Kubernetes:
   * If 2 pods are running for an application, how could you scale this down to just 1 pod? **Max 50 words**
   * Using the command line, how would you find out the status of a deployed configuration for an application? **One terminal command**
   * What is the difference between a liveness and readiness probe? **Max 50 words**
4. What are the pros and cons of having shared pipelines between teams and projects? What alternatives or comparable solutions can you suggest? **Max 100 words**
5. Write a bash or python script that:
   * uses general scripting best practices
   * takes two arguments: a time interval and a url
   * continuously polls the url every interval
   * if the specified url returns a non 200 response code, exits with a non-zero status code, else continues polling
6. When you `ssh` into a linux machine which is exhibiting some unusual behaviour, what are the first few commands you'd run to try and find out what's going on? **Max 3 commands**
7. What use is a bash script such as that in q6 and when might you expect to use something like this? **Max 100 words**
8. What do you think are the biggest challenges for a company such at DB when adopting DevOps processes? **Max 100 words**
9. If you were building a CI/CD system from scratch, what would your choice of tools be? (Unlimited budget, team 5-10 engineers, delivering a high-availability web-based product for a large enterprise). **Max 10 things**
10. Tabs or spaces?

q3.json

{ "environment": "UAT", "active\_version": "3ACC9FBA4ED7788FD4C9F62A87E6DEB726018112", "versions": \[ { "id": "a07594547b82ade5f49385054ccc4e75df6dc0fb", "container\_id": "dws/1.1.1" }, { "id": "3acc9fba4ed7788fd4c9f62a87e6deb726018112", "container\_id": "dws/1.1.0" }, { "id": "ef49e4eab6dfe38cc686a925affb1dc093203806", "container\_id": "dws/1.0.11" } ] }

q3.sh

## !/bin/bash

echo "question 3..."

active\_version=$(cat "./q3.json" | jq '.active\_version')

echo "active\_version: $active\_version"

active\_container\_id=$(cat "./q3.json" | jq ".versions\[] | select(.id == $active\_version) | .container\_id")

echo "active\_container\_id: $active\_container\_id"

questions.tar.gz

This just contains the above files zipped up, ready to go.



\
\<!--\
&#x20;/\* Font Definitions \*/\
&#x20;@font-face\
&#x9;{font-family:新細明體;\
&#x9;panose-1:2 2 5 0 0 0 0 0 0 0;}\
@font-face\
&#x9;{font-family:"Cambria Math";\
&#x9;panose-1:2 4 5 3 5 4 6 3 2 4;}\
@font-face\
&#x9;{font-family:"\\@新細明體";\
&#x9;panose-1:2 2 5 0 0 0 0 0 0 0;}\
@font-face\
&#x9;{font-family:"Segoe UI";\
&#x9;panose-1:2 11 5 2 4 2 4 2 2 3;}\
&#x20;/\* Style Definitions \*/\
&#x20;p.MsoNormal, li.MsoNormal, div.MsoNormal\
&#x9;{margin:0cm;\
&#x9;margin-bottom:.0001pt;\
&#x9;font-size:12.0pt;\
&#x9;font-family:"Calibri",sans-serif;}\
.MsoChpDefault\
&#x9;{font-family:"Calibri",sans-serif;}\
&#x20;/\* Page Definitions \*/\
&#x20;@page WordSection1\
&#x9;{size:612.0pt 792.0pt;\
&#x9;margin:72.0pt 90.0pt 72.0pt 90.0pt;}\
div.WordSection1\
&#x9;{page:WordSection1;}\
\-->\


&#x20;

openssl s\_client -showcerts -connect dbatlas.db.com:443 < /dev/null | openssl x509 -outform DER > jira.der &#x20;



\
\- Developers complain that on linux / solaris boxing everything slows down. What can be done to find and fix the problem?&#x20;

\- Developers complain that the time of message delivery sometimes on one of the boxes becomes negative. What can be done to find and fix the problem?&#x20;

]- Developers complain that the message delivery time has increased compared to what it was before. What can be done to find and fix the problem? &#x20;

&#x20;\- what are Solaris zones - what is UDP, TCP, HTTP?   - what expects from the new work, how to relate to the fact that there is no root rights and ticketing
