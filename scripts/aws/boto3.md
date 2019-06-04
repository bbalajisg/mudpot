# Boto3



```text
session = boto3.Session(region_name="us-east-1")

ec2 = session.resource('ec2', region)

instances = ec2.instances.filter(
        Filters=[{'Name': 'instance-state-name', 'Values': ['stopped', 'terminated']}])

for instance in instances:
    print(instance.id, instance.instance_type)
```

