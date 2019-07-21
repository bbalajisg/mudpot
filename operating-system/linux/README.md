# Linux

## Disk Usage

```bash
du -sh    
```

To display the largest folders/files including the sub-directories, run:

```bash
du -Sh | sort -rh | head -5
```

[![Find Largest Folder and Sub directories](https://www.tecmint.com/wp-content/uploads/2016/01/Find-Largest-Folder-and-Sub-directories.gif)](https://www.tecmint.com/wp-content/uploads/2016/01/Find-Largest-Folder-and-Sub-directories.gif)

![Every Linux networking tool ](../../.gitbook/assets/img-20190225-wa0001.jpg)

## **Compress**

How do I compress every file in a directory into its own tar whilst preserving the name for each file?

if you have a HUGE number of files or want to do it on a recursive directory structure you can also use

```bash
find . -type f -exec gzip {} \;
```

and if you need to put the output into a different directory \(in this example, `../target`\) and don't want to remove the originals, you can do something like:

```bash
find . -type f -print | while read fname ; do
    mkdir -p "../target/`dirname \"$fname\"`"
    gzip -c "$fname" > "../target/$fname.gz"
done                                
```

### Remove files older than 30 days

```bash
find /path/To/File -type f -name '*.bb' -mtime +    

30 -exec rm {} \;
```



netstat -nap \| grep ESTA

