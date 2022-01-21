---
description: Role based Access control for Kubelet Authorization.
---

# RBAC

We need to make sure that  kubernetes API has permission to access Kublet API on eache node to  perform certain common tasks. Without this some functionalities may not work.

Create ClusterRole with nessacary permission and assign that role to kubernetes user with clusterRoleBinding.

## Permissions

Below are the permissions needed

```bash
 nodes/proxy
      - nodes/stats
      - nodes/log
      - nodes/spec
      - nodes/metrics
```

Create a role with the necessary permissions:

```bash
cat << EOF | kubectl apply --kubeconfig admin.kubeconfig -f -
apiVersion: rbac.authorization.k8s.io/v1beta1
kind: ClusterRole
metadata:
  annotations:
    rbac.authorization.kubernetes.io/autoupdate: "true"
  labels:
    kubernetes.io/bootstrapping: rbac-defaults
  name: system:kube-apiserver-to-kubelet
rules:
  - apiGroups:
      - ""
    resources:
      - nodes/proxy
      - nodes/stats
      - nodes/log
      - nodes/spec
      - nodes/metrics
    verbs:
      - "*"
EOF
```

Bind the role to the kubernetes user:'

```
name: kubernetes
```

```bash
cat << EOF | kubectl apply --kubeconfig admin.kubeconfig -f -
apiVersion: rbac.authorization.k8s.io/v1beta1
kind: ClusterRoleBinding
metadata:
  name: system:kube-apiserver
  namespace: ""
roleRef:
  apiGroup: rbac.authorization.k8s.io
  kind: ClusterRole
  name: system:kube-apiserver-to-kubelet
subjects:
  - apiGroup: rbac.authorization.k8s.io
    kind: User
    name: kubernetes
EOF
```
