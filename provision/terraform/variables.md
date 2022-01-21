---
description: Multiple ways to assign variables
---

# variables

\
1\. Command-line flags: Variables can be set directly on the command-line with the -var flag.

```
./terraform apply -var instance_type=“t2.micro”
```

2\. From a file: Create a file named **terraform.tfvars** and assign variables within this file.

```
instance_type=“t2.micro”
```

3\. From environment variables: Variables can be read environment params in the form of TF\_VAR\_name to find the value.

```
TF_VAR_instance_type=t2.micro
```
