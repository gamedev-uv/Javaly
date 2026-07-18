![](.README/header.png)

# Javaly
###### Your ally for Java
This repo contains Object-oriented programming assignments and Java lab work completed as part of my undergraduate coursework at Sister Nivedita University.

Need help running the files? Check out [setup](#setup).
Feel free to open up an issue if you are having any problems!

---

## Questions
| Sl. No. | Question    | Link | 
|   :-    | :-          | :-:  | 
|  1.     | Hello World | [Link](#hello-world) |
|  2.     | Add Numbers | [Link](#add-numbers) |

### Hello World
WAP in Java to display Hello World to the output console.

`Answer` [HelloWorld.java](src/basics/HelloWorld.java)

`Output Terminal`
```
Hello World
```

### Add Numbers
WAP in Java to input 2 numbers from the user and display their sum.

`Answer` [AddNumbers.java](src/basics/AddNumbers.java)

`Output Terminal`
```
--- INPUT ---
 - Enter the value of A: 6
 - Enter the value of B: 7

--- OUTPUT ---
6 + 7 = 13
```

> [!NOTE]
> The `+` operator can be used to concat (join) two strings in Java. There are other ways such as using the `concat()` method as well but for simplicity we are gonna use the `+` operator.
> ```java
> System.out.print(a + " + " + b + " = " + (a + b));
> ```
> Here we are concating the value of the variable `a` with the actual string `" + "` and then that is being concatenated with the value of `b` followed by the string `" = "` and then the value of `a + b`. 
> The bracket is important else it will print the value of `a` and then `b`. As it will think of it as concating of strings.
> If you want to do something even simpler you can simply print the sum with or without the prefix - 
> ```java
> System.out.print(a + b);              //Without prefix
> System.out.print("Sum: " + (a + b));  //With prefix
>```


### Setup
All Java programs in this repository were written and ran inside [Visual Studio Code](https://code.visualstudio.com/). 

I used the [OpenJDK](https://openjdk.org/). If you want to install OpenJDK you can do that from their [website](https://jdk.java.net/26/) or through any package manager.

#### Installing OpenJDK using Chocolatey
To install OpenJDK, I used [Chocolatey](https://chocolatey.org/), a Windows package manager. If you want to install choco, you can follow this [guide](https://chocolatey.org/install).

And once you have choco installed you can use this command to install OpenJDK.  
```
choco install openjdk -y
```
> [!TIP]
> You will be recommended to do this while running the shell as an Administrator.

#### Running the code
Make sure you `cd` to where the `.java` files are. 
If you have cloned this repo then 
```
cd src/<Path to subfolder if applicable>
```

Then you can use 
```
javac <fileName>.java
```
This create the different class files in the working directory.
Then you can run the file which contains the `main` function by using this command.

```
java <className>
```