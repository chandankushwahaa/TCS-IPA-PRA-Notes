# Unix - MCQs Questions


### 1. The command used to find the count of only words in a file?

- a. wc -w <filename>
- b. wc –words <filename>
- c. wc <Filename>
- d. None of the options

**Correct Answer:** a. wc -w <filename>


2. Which command is used to change permission levels of a file or directory?

- a. passwd
- b. unset
- c. return
- d. chmod

**Correct Answer:** d. chmod

### 3. What will be the output of below

    awk 'BEGIN { s=0; while (s<55) { print s; ++s; } }'

- a. Prints the numbers from 0 to 55.
- b. Prints the numbers from 0 to 5d.
- c. Command will throw a syntax error
- d. It will go to infinite loop.

**Correct Answer:** c. Command will throw a syntax error

### 4. Given an input file as below.
red,20
blue,22
green,45
yellow,2
orange,70
### What will be the output of the below shell script and where will it be saved, when it is executed by passing above file as input.
```bash 
if [ $# -ne 1 ]; then
    echo "Pass the input file"
else
    if [ -f "$1" ] && [ -e "$1" ]; then
        awk 'BEGIN{FS=",";s=0}{s=s+$2}END{print s}' "$1" > outsum
        cut -d, -f1 "$1" >> outsum
    else
        echo "file doesn't exist"
    fi
fi
```

#### Final content of `outsum`:
159,
red,
blue,
green,
yellow,
orange

- a. Code won't run due to syntax error.
- b. Only first filter's output will be saved into outsum file
- c. Sum of second column of input file and first column of input file will be obtained using the two
  filter s in the shell. Both outputs will be saved in file named outsum.
- d. Only second filter's output will be saved into outsum file.

**Correct Answer:** c. Sum of second column of input file and first column of input file will be obtained using the two filter s in the shell. Both outputs will be saved in file named outsum.


### 5. Which of the command(s) will print the first line of the file?
- a. head -1 filea.txt
- b. awk 'NR==1' filea.txt
- c. sed -n '1p' filea.txt
- d. echo $1 filea.txt

**Correct Answer:** (a), (b),  ( c)
