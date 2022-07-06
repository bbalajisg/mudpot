# PGP/ GPG Encryption Decryption

## &#x20;**Generate a set of keys**

```
gpg --gen-keys
```

This command provides us with public, private keys and key rings

&#x20;This gives the public key information and also about id and we will be using a portion of it. Ans also says who uses or who am i

![](<../../.gitbook/assets/CleanShot 2022-07-06 at 11.21.20@2x.jpg>)

## Listing your keys in  .gnupg directory

```
gpg --list-keys
```

Lists your keys in the .gnupg directory

&#x20;

```
gpg --list-public-keys
```

&#x20; Lists the public keys in our keyring

```
gpg --list-secret-keys
```

Lists the secret/private keys in our keyring

```
gpg --list-public-keys balaji@example.com
```

## Managing the keys

## Transfering / Exportin public key

Executing the below command will hold the public key from the user balaji@example.com to file named middle-layer-sftp-public.gpg

```
gpg --output middle-layer-sftp-public.gpg --export balaji@example.com
```

&#x20;will have issue when sending this file as email etc., So we have to convert ASCII-armord format

```
gpg --armor --export balajipub_pgp.asc balaji@example.com
```



## Importing public key



```
gpg --import balajipub_pgp.asc
```

```
//gpg --list-keys
```

Once a key is imported it should be validated.

```
gpg --with-fingerprint balajipub_pgp.asc
```

```
```
