![](.README/header.png)

# Javaly
###### Your ally for Java
This repo contains Object-oriented programming assignments and Java lab work completed as part of my undergraduate coursework at Sister Nivedita University.

Need help running the files? Check out [setup](#setup).
Feel free to open up an issue if you are having any problems!

---

## Questions
| Sl. No. | Question               | Link | 
|   :-    | :-                     | :-:  | 
|  1.     | Hello World            | [Link](#hello-world) |
|  2.     | Add Numbers            | [Link](#add-numbers) |
|  3.     | Calculate              | [Link](#calculate) |
|  4.     | Travel Package         | [Link](#travel-package) |
|  5.     | Odd Even               | [Link](#odd-even) |
|  6.     | Grade Calculator       | [Link](#grade-calculator) |
|  7.     | Input Output           | [Link](#input-output) |
|  8.     | Triangle Checker       | [Link](#triangle-checker) |
|  9.     | Multiplication Table   | [Link](#multiplication-table) |

### Hello World
WAP in Java to display Hello World to the output console.

`Answer` [HelloWorld.java](src/HelloWorld.java)

`Output Terminal`
```
Hello World
```

### Add Numbers
WAP in Java to input 2 numbers from the user and display their sum.

`Answer` [AddNumbers.java](src/AddNumbers.java)

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

### Calculate
WAP in Java to create a class called Calculate. Which has separate methods with separate inputs for -
- Calculating the sum of 2 given numbers
- Calculate the minimum between 2 given numbers
- Check if 3 2-Dimensional points are colliner or not

`Answer` [Calculate.java](src/Calculate.java)

`Output Terminal`
```
--- INPUT ---
 - Enter A: 1
 - Enter B: 2
Sum: 3

--- INPUT ---
 - Enter A: 3
 - Enter B: 4
Minimum: 3

--- INPUT ---
 - Point A
      x: 1
      y: 2
 - Point B
      x: 3
      y: 4
 - Point C
      x: 5
      y: 6
Collinear: true
```

### Travel Package
WAP in Java to create a class TravelPackage with the following data members
- `Travel Code` : `string`
- `NoOfAdults`  : `int`
- `NoOfKids`    : `int` 
- `Kilometers`  : `int` 
- `TotalFare`   : `float` 

And the following member functions
- `TravelPackage()`: A constructor to assign default values as follows 
    `TravelCode = "NULL"`
    Other members have their default value of `0` or `0.0f`
- `AssignFare()`: A method which calculates and assigns the fare based on the table below - 
    > For one adult the pricing is as follows -
    > | Price | Kilometers           |
    > | :-:   | :-:                  |
    > |  500  | >= 1000              |
    > |  300  | >= 500 and < 1000    |
    > |  200  | < 500                |
    > 
    > For kids the fare is 50% of that of an adult
- `EnterTour()`: A method which will be used to input and assign values to the members
- `ShowTour()`:  A method which will be used display the contents of all the members

`Answer` [TravelPackage.java](src/TravelPackage.java)

`Output Terminal`
```
--- INPUT ---
 - Travel Code: Goa
 - Adult Count: 3
 - Kid Count: 2
 - Kilometers: 1500

--- OUTPUT ---
Travel Code: Goa
Adult Count: 3
Kid Count  : 2
Distance   : 1500kms
Total Fare : Rs.2000.0
```

### Odd Even
WAP in Java to check whether a given number is odd even or zero

`Answer` [OddEven.java](src/OddEven.java)

`Output Terminal`
```
--- INPUT ---
 - Enter the number: 3

--- OUTPUT ---
3 is odd
```

```
--- INPUT ---
 - Enter the number: 4

--- OUTPUT ---
4 is even
```

```
--- INPUT ---
 - Enter the number: 0

--- OUTPUT ---
0 is zero
```

### Grade Calculator
WAP in Java to give grade based on the marks. 

Grades should be given based on the table below - 
| Marks | Grade          | 
| :-:   | :-:            |
| > 90  | Outstanding    |
| > 80  | Excellent      |
| 60-80 | Average        |
| 40-60 | Below Average  |
| < 40  | Fail           |

`Answer` [Grade.java](src/Grade.java)

`Output Terminal`
```
--- INPUT ---
 - Enter Marks: 95

--- OUTPUT ---
Outstanding
```

```
--- INPUT ---
 - Enter Marks: 50

--- OUTPUT ---
Below Average
```

```
--- INPUT ---
 - Enter Marks: 25

--- OUTPUT ---
Fail
```

### Input Output
WAP in Java to input differnt types of data types and display them.

`Answer` [InputOutput.java](src/InputOutput.java)

`Output Terminal`
```
--- INPUT ---
 - Enter integer: 3
 - Enter float: 3.412
 - Enter boolean: true
 - Enter word: Hello
 - Enter sentence: Javaly by @gamedev_uv

--- OUTPUT ---
int           : 3
float         : 3.412
boolean       : true
String (Word) : Hello
String (Line) : Javaly by @gamedev_uv
```

> [!NOTE]
> In the code 
> ```java
> System.out.print(" - Enter sentence: ");
> sc.nextLine();
> String line = sc.nextLine();
> ``` 
> We use an extra `sc.nextLine()` so that the empty string is removed from the buffer. Without this the line input will be filled with an empty string.

### Triangle Checker
WAP in Java to check whether a given triangle is equilateral, isoceles or scalene.

`Answer` [TriangleChecker.java](src/TriangleChecker.java)

`Output Terminal`
```
--- INPUT ---
 - Enter 1st Side's Length: 3 
 - Enter 2nd Side's Length: 3
 - Enter 3rd Side's Length: 3

--- OUTPUT ---
Equilateral Traingle
```

### Multiplication Table
WAP in Java to display the multiplication table of given number `n`.

`Answer` [MultiplicationTable.java](src/MultiplicationTable.java)

`Output Terminal`
```
--- INPUT ---
 - Enter the number: 3

--- OUTPUT ---
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
```

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