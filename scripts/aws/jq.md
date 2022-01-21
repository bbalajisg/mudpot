---
description: Parsing
---

# jq

bash-3.2$ git\_source=$(aws codepipeline get-pipeline --name ci-automation-test |jq -r '.pipeline.stages\[].actions\[] | select(.name=="Source") | .configuration | {BranchName: .BranchName, RepositoryName: .RepositoryName }')&#x20;

bash-3.2$ echo $git\_source { "BranchName": "feature/SmokeTest", "RepositoryName": "automation-test" }&#x20;

bash-3.2$ echo $git\_source | jq .BranchName "feature/SmokeTest"&#x20;

bash-3.2$ echo $git\_source | jq .RepositoryName "automation-test"&#x20;

bash-3.2$ git\_source=$(aws codepipeline get-pipeline --name ci-automation-test |jq -r '.pipeline.stages\[].actions\[] | select(.name=="Source") | .configuration | {BranchName: .BranchName, RepositoryName:.RepositoryName }')&#x20;

bash-3.2$ echo $git\_source { "BranchName": "feature/SmokeTest", "RepositoryName": "automation-test" } bash-3.2$ echo $git\_source | jq .RepositoryName "automation-test" bash-3.2$

![](<../../.gitbook/assets/image (2).png>)

