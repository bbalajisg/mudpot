# Namespaces

## Kubernetes namespaces

* kube-system
* kube-public
* kube-default



```bash
kubectl create -f <definition-filename> --namespace=dev
```

## Stuck destroying namepsace in terraform 

```bash
for ns in $(kubectl get ns --field-selector status.phase=Terminating -o jsonpath='{.items[*].metadata.name}'); do  kubectl get ns $ns -ojson | jq '.spec.finalizers = []' | kubectl replace --raw "/api/v1/namespaces/$ns/finalize" -f -; done
```



