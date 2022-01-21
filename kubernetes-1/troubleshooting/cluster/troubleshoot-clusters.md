---
description: >-
  The first thing to debug in your cluster is if your nodes are all registered
  correctly.
---

# Unable To List My Cluster

### Execute

```bash
kubectl get nodes
```

And verify that all of the nodes you expect to see are present and that they are all in the `Ready` state. If not then ...

### &#x20;Verify the logs

```bash
devuser@kuberworker1:~$ view /var/log/syslog
```

![Need to turn of the swap](<../../../.gitbook/assets/Screenshot 2019-02-04 at 7.42.28 PM.png>)

### Solution

1. remove any **swap** entry from `/etc/fstab`
2. `reboot` the system

### Reason

The idea of kubernetes is to tightly pack instances to as close to 100% utilisation as possible. All deployments should be pinned with CPU/memory limits. So if the scheduler sends a pod to a machine it should never use swap at all. You don't want to swap since it'll slow things down. It's mainly for performance.\
