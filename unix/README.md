# Unix
- It is a set of program that plays a role as a connection between the computer and the user.
- It is an OS.
- Developed by AT&T employees at Bell Labs(1969-1971).
- Users communicates with the kernal thorugh a program known as the shell.
- The **shell** is a command line interpreter.
- Various Unix availabe are:- 
  - *solaris Unix*
  - *AIX*
  - *HP unix*
  - *BSD*
  - *Linux* (Readhat, centOS, Devian, unbuntu, Kali, Gentoo)

## Unix Architecture
- **Kernal** - The heart of OS. It interact with the hardware.
- **Shell** - It is the uitility that process your request. 
  
  - **Popular Unix Shell:-** 
      - sh: Thompson shell (1971)
      - sh: Bourne shell (1977)
      - csh: C shell (1979)
      - tcsh: Tabbed C shell (1979)
      - ksh: Kornsher (1982)
      - bash: Bourne again shell (1987)
      - zsh: z shell (1990)

- Commands and Utilities
- Files and Directories 

## Open-Source
- BSD (Bberkeley software Distribution)
- Linux

## Closed-source
- Solaris (sun/Oracle)
- AIX (IBM)
- HP/UX (Hewleet Pacard)

## Mixed-source
- MacOS/Darwin (Apple)

## Ways to Access
- MacOS
- LinuxOS
- Windows subsystem for Linux (WSL)
- Linux remote Server (online)


## Shortcuts
- up/down: review previous command
- left/right: move aroun the currnet input line
- ctrl+a : move cursor to start of the line
- ctrl+e: move cursor to start of the line
- tab: complete the command/filename.
- clear/ctrl+k: clear screen

## Text Editor
- cd: edit text
- vi: visual mode
- vim: vi imporved
- emacs: editor macros (advanced)
- pico: pine composer (beginner)
- nano: 1000 times larger than pico

# Files and Directories

## File System Basic
- The current directory in unix is called working directory.
1. **pwd**: find out the current working directory.(path)
2. **ls**: list the file in the current directory.
3. **ls -l/h**: same list with different format with additional information.
4. **ls -a**: all files including . files
5. **cd**: to change the directory.
6. **cd ..**: back to the parent directory.
7. **cd ../..**: To moved back to more than one directory.


|Directory| Description  |
|--|--|
| /bin | Commands/program  |
| /etc | Configurations |
| /home|  User home directories |
| /lib |  System libraries|
| /tmp | Temporary files|
| /usr | Unix system resources|
| /var | variable system data files|


## Unix File Names

- 255  character maximum
- use A-Z, a-z, 0-9, underscore, hypen, period.
- Avoid / \ * & % ? | ^ ~ < > and most other symbols
- Case sensitive: "MyFile" and "myfile" are different.
- prefer lowercase

### 1. Creating file using **nano**

1. type `nano` in text editor or bash shell.
2. Inside the text editor write whatever you wnat.
3. press CTRL+X it will ask to save the changes. Press Y to save.
4. Write the file name "first.txt".
5. Press enter to exit.

### 2. Reading content from file
1. `cat` filename to view. `cat first.txt`

*You use multiple file to read.
` cat first.txt second.txt`*

2. `more` : paginated output
    - `more 
3. `less` : backward scrolling, better memory use. `less > more`
    - `less first.txt`: use up/down to move  ups and downs or use space/f to goto the next page. b will take back page. h for help menu. q to exit.

### 3. creating directories

-  `mkdir` myfolder : create directory
- `mkdir` myfolder/subfolder : create directory inside directory
- `mkdir -p my_project/test1/test2`

### 4. Move and Renaming files and directories

1. `mv` (Move) : mv  oldFileLocation newFileLocation
- e.g : `mv old.txt my_project/new.txt`

2. mv oldFileName newFileName
- e.g  : `mv old.txt new.txt`

>*Renaming and moving are the same thing in Unix*.

### 5. Copying files and directories
1. `cp` (copy): `cp source_file destination_file`
- e.g: `cp a.txt b.txt`

- `cp -R test2 test3` : copying test2 directory and all the files that are inside test2 and all the directories that are inside test2 pluss the content of those directories which may content other directories and so on and it will recursively copy all of them down the line.


### 6. Deleting files and directories
>When you delete any files or directories in unix it will go forever.
1. `rm` 
    - `rm fileName`: to delete file
    - e.g `rm first.txt`
    
    - `rm -R test1` : to delete directory


### 7. Search 

- `find` PATH EXPRESSION

e.g:  `find /home -name first.txt`


| Wildcard 	| Description |
|--|--|
| * | zero or more characters (glob) |
|?|any one character|
|[]|any character in the brackets|

- e.g :  `find /home -name "*.txt"`
- e.g :  `find /home -name "[ftm]ile_*.txt`
- e.g :  `find /home -name "f???_*.txt`