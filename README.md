# Flying Shuttle

## &#x20;AWS Loadbalancer Controller

Issue

{% hint style="info" %}
{"level":"error","ts":1625190884.315557,"logger":"controller","msg":"Reconciler error","controller":"ingress","name":"eks-alb-ingress","namespace":"ci-ml-ns","error":"couldn't auto-discover subnets: UnauthorizedOperation: You are not authorized to perform this operation.\n\tstatus code: 403, request id: 84f8237b-9395-4fa6-b14f-1558c5e3f85c"}
{% endhint %}

* [ ] Issue will be because of IAM policy not attached to worker node

{% hint style="info" %}
&#x20;for ns in $(kubectl get ns --field-selector status.phase=Terminating -o jsonpath='{.items\[\*].metadata.name}'); do kubectl get ns $ns -ojson | jq '.spec.finalizers = \[]' | kubectl replace --raw "/api/v1/namespaces/$ns/finalize" -f -; done
{% endhint %}

But deleting stuck namespaces is not a good solution. Right way is to find out why it's stuck. Very common reason is there's an unavailable API service(s) which prevents cluster from finalizing namespace
