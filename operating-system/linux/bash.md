# Bash

## Dynamic array

```
   
paths2exclude=()
paths2exclude+=( "-exclude server/tests" )
paths2exclude+=( "-exclude TestServer" )
echo "${paths2exclude[*]}"
```





```

if [ -z "$4" ]
then
    exclude_dir="src/test/**/*"
else
    exclude_dir=$4; shift
    array=( "$@" )
    last_idx=$(( ${#array[@]} - 1 ))
    exclude_dir=${array[$last_idx]}
    unset array[$last_idx]
fi

echo $exclude_dir
```
