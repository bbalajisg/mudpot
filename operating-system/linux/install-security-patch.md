# Install security patch

## Fedora

yum -y install yum-plugin-security yum --security check-update yum --security update needs-restarting -r yum -y install yum-utils



## Ubuntu

apt-get -s dist-upgrade \| grep "^Inst" \| grep -i securi apt-get -s dist-upgrade \| grep "^Inst" \| grep -i securi \| awk -F " " {'print $2'} \| xargs apt-get install apt install -y debian-goodies checkrestart -v

