# Certificate verification

openssl crl2pkcs7 -nocrl -certfile /etc/ssl/certs/ca-certificates.crt \| openssl pkcs7 -print\_certs -text \| grep -E '\(Subject:\|Not After\)'

