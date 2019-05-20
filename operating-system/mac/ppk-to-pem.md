---
description: Convert a putty .ppk key to an Amazon .pem file on OSX
---

# PPK to PEM

This article will show you how to generate a `.pem` file from an existing `.ppk` key.

#### Step 1 : Install putty on your mac <a id="1-Install-putty-on-your-mac"></a>

Done easily with [homebrew](http://brew.sh/).

#### Step 2 : Generate the key <a id="2-Generate-the-key"></a>

We will use [puttygen](http://linux.die.net/man/1/puttygen) to generate the key.

```text
$ puttygen key.ppk -O private-openssh -o key.pem
```

* `key.ppk`: the original file name/path.
* `-O private-openssh`: the output type. `private-openssh` is used to save an SSH-2 private key in OpenSSH’s format.
* `-o key.pem`: the output file name/path.

#### Step 3 : Install the key <a id="3-Install-the-key"></a>

Installing the key is equivalent to copying it in your `~/.ssh` directory.

