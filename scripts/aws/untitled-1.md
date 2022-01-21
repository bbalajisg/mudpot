# Untitled

\
You contacted us as you wanted to regain root access to the EC2 Instance i-5343357b as you did not have the key pair “mscprodkey” as well.\
\
While on chat, I mentioned that it is not possible to recover the old private key which was used, once lost. This is because the private key (keypair) file can be only downloaded at the time of EC2 instance launch and cannot be recovered after that.\
\
Since, you don't have the old private key (keypair) which was associated to your EC2 instance, you need to create a new keypair and have to associate this newly created keypair to your EC2 instance in order to access.\
\
Here, You can follow any one of the Methods mentioned in our document to regain access: [https://aws.amazon.com/premiumsupport/knowledge-center/user-data-replace-key-pair-ec2/](https://aws.amazon.com/premiumsupport/knowledge-center/user-data-replace-key-pair-ec2/)\
\
Since you were okay to process with either using user-data or creating a new instance from the AMI (created from instance i-5343357b) and creating a new key pair to access the new instance. Please find both the steps below:\
\
\
Method 1: Please refer this document for Method 1 for creating a new key pair and using user -data: [https://aws.amazon.com/premiumsupport/knowledge-center/user-data-replace-key-pair-ec2/](https://aws.amazon.com/premiumsupport/knowledge-center/user-data-replace-key-pair-ec2/)\
\
\-----------------------------------------------------------------------\
Method 2: Recovery of Instance from your instance latest AMI:\
\----------------------------------------------------------------------\
\
Step 1: Please create a new backup AMI of the instance. In the navigation pane, choose Instances:\
\- [https://docs.aws.amazon.com/toolkit-for-visual-studio/latest/user-guide/tkv-create-ami-from-instance.html](https://docs.aws.amazon.com/toolkit-for-visual-studio/latest/user-guide/tkv-create-ami-from-instance.html)\
Step 2: To launch a new EC2 instance from new AMI created. Please refer the below document for same:\
\- [https://aws.amazon.com/premiumsupport/knowledge-center/launch-instance-custom-ami/](https://aws.amazon.com/premiumsupport/knowledge-center/launch-instance-custom-ami/)\
&#x20;        2.1 Open the EC2 console.\
&#x20;            Note: Be sure to select the AWS region you want to launch the instance in.\
&#x20;        2.2 From the navigation bar, choose AMIs.\
&#x20;        2.3 Find the AMI you want to use to launch a new instance. The AMI you’re using is one that you created, select Owned by me..\
&#x20;            Note: The search bar automatically provides filtering options, as well as automatically matching AMI IDs.\
&#x20;        2.4 Select the AMI, and then choose Launch.\
&#x20;        2.5 Choose an instance type, and then choose Next: Configure Instance Details.\
&#x20;        2.6 Review the Instance Details, and then choose Review and Launch.\
&#x20;        2.7 Choose your preferred boot volume, choose Next, and then choose Launch.\
&#x20;        2.8 Select an existing key pair or create a new key pair, select the acknowledge agreement box, and then choose Launch Instances.\
&#x20;        2.9 Choose View Instances to check the status of your instance.\
\
Here please note that on step "2.8" you have to create a new pair and download to your local machine. This new key pair will help you to SSH the new instance which you are creating from backup AMI.\
\
I hope this helps and resolves the issue you’re facing. Please feel free to respond to this email if you still have any questions or require any clarifications and I’ll be glad to address them further. Thanks again and have a great rest of your day!\
\
We value your feedback. Please share your experience by rating this correspondence using the AWS Support Center link at the end of this correspondence. Each correspondence can also be rated by selecting the stars in top right corner of each correspondence within the AWS Support Center.
