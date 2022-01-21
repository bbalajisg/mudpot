---
description: >-
  Kubernetes Worker Nodes are responsible for the actual work of running
  container application managed by kubernetes.
---

# Worker Nodes

Has the services necessary to run application containers and be managed from the master systems.

Below are the 3 main components.

## Kubelet

Controls each worker node, providing the API's that are used by the control pane to manage nodes and pods, and interacts with the container runtime to manage containers.

## Kube-proxy

&#x20;Manage iptables rules on the node to provide virtual network access to pods.

## Container runtime

Download the images and runs container. Ex., Docker and containerd



