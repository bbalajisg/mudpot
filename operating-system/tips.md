# Tips

Split a large text file in Windows&#x20;

Use the **`split`** command in Git Bash to split a file:

* into files of size 500MB each: **`split myLargeFile.txt -b 500m`**
* into files with 10000 lines each: **`split myLargeFile.txt -l 10000`**
