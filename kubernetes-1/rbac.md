# RBAC

Role based Access control for Kubelet Authorization. 

We need to make sure that  kubernetes API has permission to access Kublet API on eache node to  perform certain common tasks. Without this some functionalities may not work.

Create ClusterRole with nessacary permission and assign that role to kubernetes user with clusterRoleBinding.





