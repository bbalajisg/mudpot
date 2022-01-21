# Shell Scripts on Codebuild

```bash

chmod 755 cbpl-common/scanner/*.sh
chmod 755 cbpl-common/scripts/*.sh
 
pipeline_name="$(echo $CODEBUILD_INITIATOR |awk -F '/' '{print $2}')"

echo "$CODEBUILD_INITIATOR"
if grep -q codepipeline <<<"$CODEBUILD_INITIATOR"; then
then
    export git_source="$(aws codepipeline get-pipeline --name $pipeline_name |jq -r '.pipeline.stages[].actions[] | select(.actionTypeId.category=="Source") | .configuration | {BranchName:.BranchName,  RepositoryName:.RepositoryName }')"
    export repo_name=$(echo $git_source | jq -r .RepositoryName)
    export branch_name=$(echo $git_source | jq -r .BranchName)
fi
 
if [ `find . -type f -name gradle.properties` ]
then 
	sed -ie "s:systemProp.sonar.branch.name=master:systemProp.sonar.branch.name=$branch_name:g" gradle.properties
fi
```

