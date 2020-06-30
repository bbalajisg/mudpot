---
description: Parsing
---

# jq

bash-3.2$ git\_source=$\(aws codepipeline get-pipeline --name ci-automation-test \|jq -r '.pipeline.stages\[\].actions\[\] \| select\(.name=="Source"\) \| .configuration \| {BranchName: .BranchName, RepositoryName: .RepositoryName }'\) 

bash-3.2$ echo $git\_source { "BranchName": "feature/SmokeTest", "RepositoryName": "automation-test" } 

bash-3.2$ echo $git\_source \| jq .BranchName "feature/SmokeTest" 

bash-3.2$ echo $git\_source \| jq .RepositoryName "automation-test" 

bash-3.2$ git\_source=$\(aws codepipeline get-pipeline --name ci-automation-test \|jq -r '.pipeline.stages\[\].actions\[\] \| select\(.name=="Source"\) \| .configuration \| {BranchName: .BranchName, RepositoryName:.RepositoryName }'\) 

bash-3.2$ echo $git\_source { "BranchName": "feature/SmokeTest", "RepositoryName": "automation-test" } bash-3.2$ echo $git\_source \| jq .RepositoryName "automation-test" bash-3.2$

![](../../.gitbook/assets/image%20%282%29.png)



