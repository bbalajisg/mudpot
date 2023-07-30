# Table of contents

* [Flying Shuttle](README.md)
* [Advanced Deployment Strategies](advanced-deployment-strategies.md)
* [Networking](networking/README.md)
  * [Public and Private IP address Range](networking/public-and-private-ip-address-classes.md)

## Provision

* [Terraform](provision/terraform/README.md)
  * [Warnings](provision/terraform/warnings.md)
  * [variables](provision/terraform/variables.md)
  * [State Management](provision/terraform/untitled/README.md)
    * [Tips and Tricks](provision/terraform/untitled/tips-and-tricks.md)
* [Packer](provision/packer.md)

## Kubernetes <a href="#kubernetes-1" id="kubernetes-1"></a>

* [Overview](kubernetes-1/overview.md)
* [Nodes](kubernetes-1/nodes/README.md)
  * [Taint and Toleration](kubernetes-1/nodes/taint-and-toleration.md)
* [Objects](kubernetes-1/introduction/README.md)
  * [Service](kubernetes-1/introduction/service-account.md)
  * [Pods](kubernetes-1/introduction/pods.md)
* [Controllers](kubernetes-1/controllers/README.md)
  * [Replica sets](kubernetes-1/controllers/replica-sets.md)
  * [Replication Controller](kubernetes-1/controllers/replication-controller.md)
* [etcd](kubernetes-1/etcd.md)
* [Deployments](kubernetes-1/deployments.md)
* [Namespaces](kubernetes-1/namespaces.md)
* [Security](kubernetes-1/security.md)
* [Control Plane](kubernetes-1/control-plane.md)
* [Data Encryption Config](kubernetes-1/data-encryption-config.md)
* [RBAC](kubernetes-1/rbac.md)
* [Kube API Frontend Load Balancer](kubernetes-1/kube-api-frontend-load-balancer.md)
* [Worker Nodes](kubernetes-1/kubernetes-worker-nodes.md)
* [Networking Model](kubernetes-1/networking-model.md)
* [Services](kubernetes-1/services.md)
* [Troubleshooting](kubernetes-1/troubleshooting/README.md)
  * [Cluster](kubernetes-1/troubleshooting/cluster/README.md)
    * [Unable To List My Cluster](kubernetes-1/troubleshooting/cluster/troubleshoot-clusters.md)
* [Useful Links](kubernetes-1/useful-links.md)
* [Tips and Tricks](kubernetes-1/tips-and-tricks.md)

## Language

* [Java](language/language.md)
* [Golang](language/golang.md)
* [Rustlang](language/rustlang.md)
* [Python](language/python.md)

## Operating System

* [Linux](operating-system/linux/README.md)
  * [Shell Scripts on Codebuild](operating-system/linux/shell-scripts-on-codebuild.md)
  * [Bash](operating-system/linux/bash.md)
  * [cURL Command](operating-system/linux/curl-command.md)
  * [Install security patch](operating-system/linux/install-security-patch.md)
  * [find](operating-system/linux/find.md)
  * [Java](operating-system/linux/java.md)
  * [PGP/ GPG Encryption Decryption](operating-system/linux/pgp-gpg-encryption-decryption.md)
* [Tips](operating-system/tips.md)
* [Mac](operating-system/mac/README.md)
  * [PPK to PEM](operating-system/mac/ppk-to-pem.md)

## Security

* [SSL](security/ssl/README.md)
  * [OPENSSL: HOW TO EXTRACT ROOT AND INTERMEDIATE CERTIFICATES FROM CLIENT CERTIFICATE](security/ssl/openssl-how-to-extract-root-and-intermediate-certificates-from-client-certificate.md)
  * [SSL Connectivity test](security/ssl/ssl-connectivity-test.md)
  * [Certificate verification](security/ssl/certificate-verification.md)
  * [Unable to connect to SSL services](security/ssl/unable-to-connect-to-ssl-services.md)

## Container

* [Docker](container/docker/README.md)
  * [Security](container/docker/security.md)
* [Containerd](container/containerd.md)

## Openshift

* [Overview](openshift/overview.md)

***

* [Infrastructure](infrastructure/README.md)
  * [AWS](infrastructure/aws/README.md)
    * [Terrafrom](infrastructure/aws/terrafrom.md)
    * [AWS Migration](infrastructure/aws/aws-migration.md)
  * [Google](infrastructure/google.md)

## Interview Questions

* [DevOps](interview-questions/devops.md)
* [Git](interview-questions/git/README.md)
  * [delete\_branches\_older\_than.sh](interview-questions/git/delete\_branches\_older\_than.sh.md)
* [JWT](interview-questions/jwt.md)
* [Page 1](interview-questions/page-1.md)

## script <a href="#scripts" id="scripts"></a>

* [Shell](scripts/shell.md)
* [Python](scripts/python.md)
* [AWS](scripts/aws/README.md)
  * [Supplement-advanced-architecting-on-aws](scripts/aws/supplement-advanced-architecting-on-aws/README.md)
    * [Module 2: Single to Multiple Accounts](scripts/aws/supplement-advanced-architecting-on-aws/module-2-single-to-multiple-accounts/README.md)
      * [CROSS-ACCOUNT ACCESS](scripts/aws/supplement-advanced-architecting-on-aws/module-2-single-to-multiple-accounts/cross-account-access.md)
      * [ORGANIZATIONS](scripts/aws/supplement-advanced-architecting-on-aws/module-2-single-to-multiple-accounts/organizations.md)
      * [AWS  IDENTITY CENTER](scripts/aws/supplement-advanced-architecting-on-aws/module-2-single-to-multiple-accounts/aws-identity-center.md)
      * [AWS CONTROL TOWER](scripts/aws/supplement-advanced-architecting-on-aws/module-2-single-to-multiple-accounts/aws-control-tower.md)
    * [Module 3: Hybrid Connectivity](scripts/aws/supplement-advanced-architecting-on-aws/module-3-hybrid-connectivity/README.md)
      * [CLIENT VPN](scripts/aws/supplement-advanced-architecting-on-aws/module-3-hybrid-connectivity/client-vpn.md)
      * [SITE-TO-SITE VPN](scripts/aws/supplement-advanced-architecting-on-aws/module-3-hybrid-connectivity/site-to-site-vpn.md)
      * [DIRECT CONNECT](scripts/aws/supplement-advanced-architecting-on-aws/module-3-hybrid-connectivity/direct-connect.md)
      * [ROUTER 53 RESOLVER](scripts/aws/supplement-advanced-architecting-on-aws/module-3-hybrid-connectivity/router-53-resolver.md)
    * [Module 5: Connecting Networks](scripts/aws/supplement-advanced-architecting-on-aws/module-5-connecting-networks/README.md)
      * [TRANSIT GATEWAY](scripts/aws/supplement-advanced-architecting-on-aws/module-5-connecting-networks/transit-gateway.md)
      * [PRIVATELINK](scripts/aws/supplement-advanced-architecting-on-aws/module-5-connecting-networks/privatelink.md)
      * [AWS RAM](scripts/aws/supplement-advanced-architecting-on-aws/module-5-connecting-networks/aws-ram.md)
    * [Module 6: Containers](scripts/aws/supplement-advanced-architecting-on-aws/module-6-containers/README.md)
      * [AMAZON EKS](scripts/aws/supplement-advanced-architecting-on-aws/module-6-containers/amazon-eks.md)
      * [FARGATE](scripts/aws/supplement-advanced-architecting-on-aws/module-6-containers/fargate.md)
      * [AMAZON ECS](scripts/aws/supplement-advanced-architecting-on-aws/module-6-containers/amazon-ecs.md)
      * [DOCKER AND CONTAINERS](scripts/aws/supplement-advanced-architecting-on-aws/module-6-containers/docker-and-containers.md)
    * [Module 7: CI/CD](scripts/aws/supplement-advanced-architecting-on-aws/module-7-ci-cd/README.md)
      * [AWS CODE BUILD](scripts/aws/supplement-advanced-architecting-on-aws/module-7-ci-cd/aws-code-build.md)
      * [CI/CD](scripts/aws/supplement-advanced-architecting-on-aws/module-7-ci-cd/ci-cd.md)
      * [DEPLOYMENT MODELS](scripts/aws/supplement-advanced-architecting-on-aws/module-7-ci-cd/deployment-models.md)
      * [AWS CODE SERVICES](scripts/aws/supplement-advanced-architecting-on-aws/module-7-ci-cd/aws-code-services.md)
      * [CLOUDFORMATION STACKSETS](scripts/aws/supplement-advanced-architecting-on-aws/module-7-ci-cd/cloudformation-stacksets.md)
  * [VPN](scripts/aws/vpn.md)
  * [System Manager](scripts/aws/system-manager/README.md)
    * [Cross account EC2 invocation](scripts/aws/system-manager/cross-account-ec2-invocation.md)
  * [Untitled](scripts/aws/untitled-1.md)
  * [Untitled](scripts/aws/untitled.md)
  * [Terrform](scripts/aws/terrform.md)
  * [jq](scripts/aws/jq.md)
  * [Fabric](scripts/aws/fabric.md)
  * [Boto3](scripts/aws/boto3.md)
* [Groovy](scripts/groovy.md)

## Notes

* [Learning Area](notes/leaning-area.md)
* [Rough Sheet](notes/rough-paper.md)
* [Useful Pages/Links](notes/userful-pages-links.md)
* [Automating Version Tags and Changelogs for your Python Projects](notes/automating-version-tags-and-changelogs-for-your-python-projects.md)

## Web Server

* [Web Server](web-server/web-server.md)

***

* [Trading](trading.md)
* [Resume](resume.md)
