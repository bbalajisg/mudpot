# Kali Linux

Nessus Installation



```sh
┌──(kali㉿kali)-[~]
└─$ history
    1  sudo su
    2  vi .ssh/authorized_keys
    3  exit
    4  sudo su
    5  hostname
    6  ls
    7  ls -a
    8  ls
    9  mkdir test
   10  cd test
   11  python3 -m http.server
   12  sudo su
   13  ls
   14  rm Nessus_plugins_27-06-2024.tar.gz
   15  sudo systemctl stop nessusd && systemctl --no-pager status nessusd
   16  sudo systemctl stop nessusd && systemctl --no-pager status nessusd
   17  ls
   18  sudo /opt/nessus/sbin/nessuscli update Nessus_plugins_27-06-2024.tar.gz
   19  sudo systemctl start nessusd && systemctl --no-pager status nessusd
   20  sudo systemctl stop nessusd && systemctl --no-pager status nessusd
   21  sudo /opt/nessus/sbin/nessuscli fix --reset
   22  sudo systemctl start nessusd && systemctl --no-pager status nessusd
   23  cat .ssh/authorized_keys
   24  exit

┌──(kali㉿kali)-[~]
└─$ sudo su
┌──(root㉿kali)-[/home/kali]
└─# history
    1  exit
    2  ifconfig
    3  ls
    4  sudo dpkg -i Nessus-10.7.4-debian10_amd64.deb\n
    5  V
    6  sudo systemctl start nessusd
    7  sudo apt install -y novnc x11vnc
    8  sudo apt-get install -y novnc x11vnc
    9  ping 8.8.8.8
   10  apt update
   11  sudo apt-get install -y novnc x11vnc
   12  x11vnc -display :0 -autoport -localhost -nopw -bg -xkb -ncache -ncache_cr -quiet -forever
   13  x11vnc -display :1
   14  sudo x11vnc -display :0
   15  nano /etc/ssh/sshd_config
   16  systemctl restart sshd
   17  nano /etc/ssh/sshd_config
   18  firefox
   19  sudo apt-get remove  -y novnc x11vnc
   20  ls
   21  ls test
   22  rmdir test

┌──(root㉿kali)-[/home/kali]
└─#
```
