# Python



I'm currently embedding these two functions in every script. It would be nice if they made it into `boto3.utils`, to confine the boilerplate to an import:

```
def t2d(tags):
    """Convert a tag list to a dictionary.

    Example:
        >>> t2d([{'Key': 'Name', 'Value': 'foobar'}])
        {'Name': 'foobar'}
    """
    if tags is None:
        return {}
    return dict((el['Key'], el['Value']) for el in tags)


def d2t(tag_dict=None, **kwargs):
    """Convert a dictionary to a tag list.

    Example:
        >>> d2t({'Name': 'foobar'}) == [{'Value': 'foobar', 'Key': 'Name'}]
        True

        >>> d2t(Name='foobar') == [{'Value': 'foobar', 'Key': 'Name'}]
        True
    """
    tag_dict = {} if tag_dict is None else dict(tag_dict)
    tag_dict.update(kwargs)
    return [{'Key': k, 'Value': v} for k, v in tag_dict.items()]
```





## &#x20;

```
        

  #for tags in instance_tags['TagList']:
            #print(tags['Key'])
           # if tags['Key'] == 'Project' and tags['Value'] == 'DCB':
             #   if tags['Key'] == 'Environment' and tags['Value'] == 'UAT':
              #      status = db_instance['DBInstanceStatus']
              #      InstanceID = db_instance['DBInstanceIdentifier']
              #      print(InstanceID)
                #print(db_instancestatus)

#client = boto3.client('rds')
#response = client.describe_db_instances()
# 
#for resp in response['DBInstances']:
#   db_instance_arn = resp['DBInstanceArn']
# 
# 
#   response = client.list_tags_for_resource(ResourceName=db_instance_arn)
#   for tags in response['TagList']:
#       if tags['Key'] == str(Key) and tags['Value'] == str(Tag):
#           status = resp['DBInstanceStatus']
#           InstanceID = resp['DBInstanceIdentifier']
#           print(InstanceID)
#           #print(status)
#           if status == 'available':
#               print("shutting down %s " % InstanceID)
#               client.stop_db_instance(DBInstanceIdentifier= InstanceID)
#               #print ("Do something with it : %s" % db_instance_arn)
#           elif status == 'stopped':
#                print("starting up %s " % InstanceID)
#                client.start_db_instance(DBInstanceIdentifier= InstanceID)
#           else:
#                print("The database is " + status + " status!")
#
#
#Project  
#Environment
#auto:start
#auto:stop
#AutoOff:true
#and tags.get('auto:off') == 'true'
#[{'Key': 'Project', 'Value': 'DCB'}, {'Key': 'Environment', 'Value': 'DEV'}, {'Key': 'workload-type', 'Value': 'other'}, {'Key': 'auto:start', 'Value': ''}, {'Key': 'auto:stop', 'Value': ''}]

```

##

















