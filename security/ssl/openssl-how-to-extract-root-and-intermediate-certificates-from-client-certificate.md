# OPENSSL: HOW TO EXTRACT ROOT AND INTERMEDIATE CERTIFICATES FROM CLIENT CERTIFICATE

This is a sample procedure to extract and rebuild required certificates of a Renewed SSL Cert due to either cert expiration or other situations such as additional SAN hosts were added to the cluster cert. In most cases only client certificates were re-issued (private key, public cert) and the need to get the Root Cert and Full Chain Cert need to be manually extracted/rebuilt. This situation is mostly applicable to infrastructure that uses OpenSSL or similar SSL/TLS toolkit used internally in organizations or personal systems. But the methods below can also be used on client certs issued by a Certificate Authority.

## &#x20;EXTRACT CLIENT CERTIFICATE

The following extracts only the client certificate and omitting the inclusion of private key (-nokeys) which supposedly not to be shared to the client users.

Syntax:

```
openssl pkcs12 -in  myCertificates.pfx -out myClientCert.crt -clcerts -nokeys
```

Example:

```
[chad@lxnode15]$ openssl pkcs12 -in lxnode15.vlabs.net.pfx -out lxnode15_client.crt -clcerts -nokeys       

Enter Import Password:

MAC verified OK

[chad@lxnode15]$
```

READING THE CERTIFICATE

The goal is to determine the signing authority hosts and grab the Root certificate and Intermmediate Certificate.



Syntax:



```
openssl x509 -in myClientCert.crt -text -noout
```



NOTE: The above command will fail if the cert file is in DER format (binary)

TO READ CERTIFICATES IN DER FORMAT:

```
openssl x509 -in myClientCert.crt -inform DER -text
```
