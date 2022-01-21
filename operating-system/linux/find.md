# find

## A big collection of Unix/Linux \`find\` command examples



{% embed url="https://alvinalexander.com/unix/edu/examples/find.shtml" %}



### Find user creation date on linux

```
$  { USER_DIREC=$(ls -l /home | grep ^d | awk '{print $9}'); for value in $USER_DIREC; do sudo passwd -S $value | awk '{print $1"   "$3}'; done; }
```

#### Output

```
balaji   01/02/2020
chaitanya   04/21/2020
jimmy   01/02/2020
```
