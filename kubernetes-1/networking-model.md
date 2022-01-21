# Networking Model

## Docker

* Container communication with each other
* Containers are on different host ( worker nodes )
* Container communication with service
* How will containers will be assigned with unique IP address

## Kubernetes

* One virtual network for the whole cluster
* Each pod has a unique IP address within the cluster
* Each service has unique IP address that is in a difference IP range than Pods IPs.

