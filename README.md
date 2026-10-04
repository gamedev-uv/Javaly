![](.README/header.png)

# Javaly
###### Your ally for Java
This repo contains Object-oriented programming assignments and Java lab work completed as part of my undergraduate coursework at Sister Nivedita University.

Need help running the files? Check out [setup](#setup).
Feel free to open up an issue if you are having any problems!

---

## Questions
| Sl. No.  | Question                      | Link | 
|   :-     | :-                            | :-:  | 
|  1.      | Hello World                   | [Link](#hello-world) |
|  2.      | Add Numbers                   | [Link](#add-numbers) |
|  3.      | Calculate                     | [Link](#calculate) |
|  4.      | Travel Package                | [Link](#travel-package) |
|  5.      | Odd Even                      | [Link](#odd-even) |
|  6.      | Grade Calculator              | [Link](#grade-calculator) |
|  7.      | Input Output                  | [Link](#input-output) |
|  8.      | Triangle Checker              | [Link](#triangle-checker) |
|  9.      | Multiplication Table          | [Link](#multiplication-table) |
|  10.     | Temperature Conversion        | [Link](#temperature-conversion) |
|  11.     | Maximimum between 3           | [Link](#maximum-between-3) |
|  12.     | Factorial                     | [Link](#factorial) |
|  13.     | Fibonacci Sequence            | [Link](#fibonacci-sequence) |
|  14.     | Swap Numbers                  | [Link](#swap-numbers) |
|  15.     | Cat                           | [Link](#cat) |
|  16.     | Dog                           | [Link](#dog) |
|  17.     | Account                       | [Link](#account) |
|  18.     | Classroom                     | [Link](#classroom) |
|  19.     | Array Delete Insert           | [Link](#array-delete-insert) |
|  20.     | Array Mininum Maximum         | [Link](#array-minimum-maximum) |
|  21.     | Armstrong Palindrome Checker  | [Link](#armstrong-palindrome-checker) |
|  22.     | Array Menu                    | [Link](#array-menu) |
|  23.     | Matrix Menu                   | [Link](#matrix-menu) |
|  24.     | String Operations             | [Link](#string-operations) |
|  25.     | Anagram Checker               | [Link](#anagram-checker) |
|  26.     | String Equals                 | [Link](#string-equals) |
|  27.     | String Collection             | [Link](#string-collection) |
|  28.     | Student Details               | [Link](#student-details) |
|  29.     | Simple Calculator             | [Link](#simple-calculator) |
|  30.     | Sign Checker                  | [Link](#sign-check) |
|  31.     | Sum Till N                    | [Link](#sum-till-n) |
|  32.     | Digit Counter                 | [Link](#digit-counter) |
|  33.     | Reverse Number                | [Link](#reverse-number) |
|  34.     | Sum Of Digits                 | [Link](#sum-of-digits) |
|  35.     | Rectangle                     | [Link](#rectangle) |
|  36.     | Circle                        | [Link](#circle) |
|  37.     | Book                          | [Link](#book) |
|  38.     | Students Marks Average        | [Link](#student-marks-average) |
|  39.     | Employee                      | [Link](#employee) |
|  40.     | Second Largest                | [Link](#second-largest) |
|  41.     | Element Frequency             | [Link](#element-frequency) |
|  42.     | Odd Even Splitter             | [Link](#odd-even-splitter) |
|  43.     | Rotate Array                  | [Link](#rotate-array) |
|  44.     | Matrix Addition               | [Link](#matrix-addition) |
|  45.     | Matrix Diagonal Sum           | [Link](#matrix-diagonal-sum) |
|  46.     | Word Frequency                | [Link](#word-frequency) |
|  47.     | Remove Duplicate Characters   | [Link](#remove-duplicates) |
|  48.     | String Rotation Check         | [Link](#string-rotation) |
|  49.     | Employee Manager              | [Link](#employee-manager) |
|  50.     | Multilevel Inheritance        | [Link](#multilevel-inheritance) |
|  51.     | Shape Inheritance             | [Link](#shape-inheritance) |
|  52.     | Salary Inheritance            | [Link](#salary-inheritance) |
|  53.     | Student Inheritance           | [Link](#student-inheritance) |
|  54.     | Safe Division                 | [Link](#safe-division) |
|  55.     | Age Validity                  | [Link](#age-validity) |
|  56.     | Array Access Validity         | [Link](#array-access-validity) |
|  57.     | Generic Exceptions            | [Link](#generic-exceptions) |
|  58.     | Custom Exception              | [Link](#custom-exception) |
|  59.     | Bubble Sort                   | [Link](#bubble-sort) |
|  60.     | Binary Search                 | [Link](#binary-search) |

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

### Temperature Conversion
WAP in Java to convert temperature from Celcius to Fahrenheit.

> [!TIP]
> You can use the relation: 
> ```math
> F = C \times \frac{9}{5} + 32
> ```

`Answer` [TempConvert.java](src/TempConvert.java)

`Output Terminal`
```
--- INPUT ---
 - Temperature in °C: 10

--- OUTPUT ---
10.0°C = 50.0°F
```

### Maximum between 3
WAP in Java to find the maximum between 3 given numbers.

`Answer` [Max3.java](src/Max3.java)

`Output Terminal`
```
--- INPUT ---
 - A: 3
 - B: 4
 - C: 12

--- OUTPUT ---
Maximum: 12
```

### Factorial
WAP in Java to calculate the factorial of a given number n.

`Answer` [Factorial.java](src/Factorial.java)

`Output Terminal`
```
--- INPUT ---
 - Enter n: 5

--- OUTPUT ---
5! = 120
```

> [!NOTE]
> The solution above uses recursion, but the factorial can also be calculated using iteration.
> ```java
> static int factorial(int n)
> {
>     if(n == 0) return 1;
> 
>     int f = 1;
>     for(int i = 1; i <= n; i++)
>          f *= i;
>  
>     return f;
> }
> ```

### Fibonacci Sequence
WAP in Java to display the fibonacci sequence upto t terms.

> [!NOTE]
> In Mathematics, the Fibonacci sequence is a sequence in which each element is the sum of the two elements that precede it. Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers. Read [more](https://en.wikipedia.org/wiki/Fibonacci_sequence#:~:text=ensemble%29%2E-,In,Fibonacci%20numbers).

`Answer` [Fibonacci.java](src/Fibonacci.java)

`Output`
```
--- INPUT ---
 - No of terms(t): 7

--- OUTPUT ---
Fibonacci Sequence: 0 1 1 2 3 5 8 
```

### Swap numbers
WAP in Java to swap 2 given numbers. 

`Answer` [SwapNumbers.java](src/SwapNumbers.java)

`Output Terminal`
```
--- INPUT ---
 - A: 7
 - B: 6

--- OUTPUT ---
A: 6
B: 7
```

> [!TIP]
> If the swap is to be performed without using a 3rd variable then one can utilize the code below
> ```java
>int a = 5, b = 6;
>a = a + b;
>b = a - b;
>a = a - b;
> ```

### Cat 
WAP in Java to create a class called `Cat` with instance variables `name` and `age`. 
Implement a default constructor that initializes the `name` to `"Unknown"` and the `age` to `0`. Print the values of the variables.

`Answer` [Cat.java](src/Cat.java)

`Output Terminal`
```
--- OUTPUT ---
 - Name: Unknown
 - Age: 0
```

### Dog 
WAP in Java to create a class called `Dog` with instance variables `name` and `color`.
Implement a parameterized constructor that takes `name` and `color` as parameters and initializes the instance variables. Print the values of the variables.

`Answer` [Dog.java](src/Dog.java)

`Output Terminal`
```
--- INPUT ---
 - Name: Bhow
 - Color: Brown

--- OUTPUT ---
 - Name : Bhow
 - Color: Brown
```

### Account
WAP in Java to create a class called `Account` with instance variables `accountNumber` and `balance`. 
Implement a parameterized constructor that initializes these variables with validation:
- `accountNumber` should be non-null and non-empty.
- `balance` should be non-negative.
- Print an error message if the validation fails.

`Answer` [Account.java](src/Account.java)

`Output Terminal`
```
--- INPUT ---
 - Account no: 0304122007
 - Balance: 67.67

--- OUTPUT ---
 - Account no : 0304122007
 - Balance    : 67.67
```

### Classroom 
WAP in Java to create a class called `Classroom` with instance variables `className` and `students` (an array of strings).
Implement a parameterized constructor that initializes these variables.  Print the values of the variables.

`Answer` [Classroom.java](src/Classroom.java)

`Output Terminal`
```
--- INPUT ---
 - Class name: BTech CSE
 - Student Count: 2
  - Student 1: Momo Wala #1
  - Student 2: Momo Wala #2

--- OUTPUT ---
 - Class name : BTech CSE
 - Students
    - Momo Wala #1
    - Momo Wala #2
```

### Array Delete Insert
WAP in Java to create an array of 10 elements and perform the following tasks :
- Delete the 6th elements
- Insert a new element in the 8th position

Ensure to display the array after each operation. Values should be input from user.

`Answer` [ArrayDeleteInsert.java](src/ArrayDeleteInsert.java)

`Output Terminal`
```
--- ENTER 10 ELEMENTS ---
 - Element at (0): 1
 - Element at (1): 2
 - Element at (2): 3
 - Element at (3): 4
 - Element at (4): 5
 - Element at (5): 6
 - Element at (6): 7
 - Element at (7): 8
 - Element at (8): 9
 - Element at (9): 10

Elements: 1 2 3 4 5 6 7 8 9 10 

Deleted 6th element
Elements: 1 2 3 4 5 7 8 9 10 

Enter the new element: 67
Inserted 67 into 8th positon
Elements: 1 2 3 4 5 7 8 67 9 10
```

### Array Minimum Maximum
WAP in Java to initialize an array of n elements and find the smallest and largest element and display them.

`Answer` [ArrayMinMax.java](src/ArrayMinMax.java)

`Output Terminal`
```
--- INPUT ---
 - Element Count: 3
--- ENTER 3 ELEMENTS ---
 - Element at (0): 3
 - Element at (1): 4
 - Element at (2): 12

--- OUTPUT ---
Elements: 3 4 12 
Min: 3 Max: 12
```

### Armstrong Palindrome Checker
WAP in Java to check whether a number n is Armstrong or Palindrome or both.

`Answer` [ArmstrongOrPalindrome.java](src/ArmstrongOrPalindrome.java)

`Output Terminal`
```
--- INPUT ---
 - n: 153

--- OUTPUT ---
153 is an Armstrong number? true
153 is a Palindrome number? false
```

```
--- INPUT ---
 - n: 11

--- OUTPUT ---
11 is an Armstrong number? false
11 is a Palindrome number? true
```

### Array Menu
WAP in menu driven program in Java to perform the following operations on an integer array: 
- Create and display an array.  
- Insert an element at a specified position. 
- Delete an element from a specified position.   
- Search for a given element.  
- Sort the array in ascending order.  
- Exit the program.  

`Answer` [ArrayMenu.java](src/ArrayMenu.java)

`Output Terminal`
```
--- INPUT ---
 - Length(n): 3

--- Enter elements ---
 - Element at 0: 67 
 - Element at 1: 45
 - Element at 2: 32
Array: [67, 45, 32]

--- OPERATIONS ---
1 -> Insert Element
2 -> Delete Element
3 -> Search Element
4 -> Sort Array
5 -> Exit
 - Choice: 1
 - Value: 2
 - Position: 3
Array: [67, 45, 2, 32]

--- OPERATIONS ---
1 -> Insert Element
2 -> Delete Element
3 -> Search Element
4 -> Sort Array
5 -> Exit
 - Choice: 2
 - Position: 1
Array: [45, 2, 32]

--- OPERATIONS ---
1 -> Insert Element
2 -> Delete Element
3 -> Search Element
4 -> Sort Array
5 -> Exit
 - Choice: 3
 - Value: 2
Value 2 was found at index: 1

--- OPERATIONS ---
1 -> Insert Element
2 -> Delete Element
3 -> Search Element
4 -> Sort Array
5 -> Exit
 - Choice: 4
Array: [2, 32, 45]

--- OPERATIONS ---
1 -> Insert Element
2 -> Delete Element
3 -> Search Element
4 -> Sort Array
5 -> Exit
 - Choice: 5

Final Array: [2, 32, 45]
```

### Matrix Menu
WAP in menu driven program to create a two-dimensional integer array (matrix) and perform the following operations using a menu-driven approach.
- Matrix Creation and Display
- Matrix Addition
- Matrix Subtraction
- Matrix Multiplication

`Answer` [MatrixMenu.java](src/MatrixMenu.java)

`Output Terminal`
```
--- INPUT [MATRIX A] ---
 Enter dimension
  - M1: 1
  - N1: 2
 Enter elements
  - Element at 0, 0: 3
  - Element at 0, 1: 4
3 4 

--- OPERATIONS ---
1 -> Matrix Addition
2 -> Matrix Subtraction
3 -> Matrix Multiplication
4 -> Exit
 - Choice: 1
--- INPUT [MATRIX B] ---
 Enter dimension
  - M2: 1
  - N2: 2
 Enter elements
  - Element at 0, 0: 3  
  - Element at 0, 1: 8
3 8 

--- SUM ---
6 12 

--- OPERATIONS ---
1 -> Matrix Addition
2 -> Matrix Subtraction
3 -> Matrix Multiplication
4 -> Exit
 - Choice: 3
--- INPUT [MATRIX B] ---
 Enter dimension
  - M2: 2  
  - N2: 1
 Enter elements
  - Element at 0, 0: 1 
  - Element at 1, 0: 0
1 
0 

--- PRODUCT ---
3 

--- OPERATIONS ---
1 -> Matrix Addition
2 -> Matrix Subtraction
3 -> Matrix Multiplication
4 -> Exit
 - Choice: 4
```

### String Operations
WAP in Java to create a string and perform the following operations:
- Find the length of the string.
- Convert the string to uppercase and lowercase.
- Display the character at a user-specified position.
- Extract a substring from the given string.

`Answer` [StringOperations.java](src/StringOperations.java)

`Ouput Terminal`
```
Enter the string: @gamedev_uv
--- OPERATIONS ---
 1 -> Length 
 2 -> To Uppercase
 3 -> To Lowercase
 4 -> Character at
 5 -> Substring
 6 -> Exit
  - Choice: 1
Length: 11

Enter the string: Hello World
--- OPERATIONS ---
 1 -> Length 
 2 -> To Uppercase
 3 -> To Lowercase
 4 -> Character at
 5 -> Substring
 6 -> Exit
  - Choice: 2
Uppercase: HELLO WORLD

Enter the string: Java   
--- OPERATIONS ---
 1 -> Length 
 2 -> To Uppercase
 3 -> To Lowercase
 4 -> Character at
 5 -> Substring
 6 -> Exit
  - Choice: 3
Lowercase: java

Enter the string: Hello
--- OPERATIONS ---
 1 -> Length 
 2 -> To Uppercase
 3 -> To Lowercase
 4 -> Character at
 5 -> Substring
 6 -> Exit
  - Choice: 4
 - Index: 2
Char at 2: l

Enter the string: Substring
--- OPERATIONS ---
 1 -> Length 
 2 -> To Uppercase
 3 -> To Lowercase
 4 -> Character at
 5 -> Substring
 6 -> Exit
  - Choice: 5
 - Starting Index: 3
 - End Index: 9
Substring: string

Enter the string: .
--- OPERATIONS ---
 1 -> Length 
 2 -> To Uppercase
 3 -> To Lowercase
 4 -> Character at
 5 -> Substring
 6 -> Exit
  - Choice: 6
```

### Token Counter
WAP in Java to accept a sentence from the user and count the number of
vowels, consonants, digits, spaces, and special characters present in the string.

`Answer` [TokenCounter.java](src/TokenCounter.java)

`Outputer Terminal`
```
--- INPUT ---
 Enter string: Javaly by @gamedev_uv. 2nd Year

--- OUTPUT ---
 Vowel Count: 8
 Consonant Count: 15
 Digit Count: 1
 Space Count: 4
 Special Character Count: 3
```

### Anagram Checker
WAP in Java to accept two strings and determine whether they are anagrams of each other.

`Answer` [AnagramChecker.java](src/AnagramChecker.java)

`Output Terminal`
```
--- INPUT ---
 Enter 1st: Silent
 Enter 2nd: Listen

--- OUTPUT ---
Anagrams? : true
```

```
--- INPUT ---
 Enter 1st: Javaly
 Enter 2nd: Listen

--- OUTPUT ---
Anagrams? : false
```

### String Equals
WAP in Java to demonstrate the difference between String literals and String objects created using `new`. Compare them using `==` and `equals()` and display the results with suitable output.

`Answer` [StringEquals.java](src/StringEquals.java)

`Output Terminal`
```
Hello World == Hello World : false
Hello World.equals(Hello World): true
```

> [!TIP]
> This happens as `==` compares to check if they are the same object i.e. they exist in the same place in memory which is obviously not the case as they are 2 different variables which are at separate locations. Thus it returns `false`.
> 
> The `equals()` method compares the value of the string which is the same in this case thus yielding `true`.

### String Collection
WAP in Java to store n strings in a String array and perform the following operations: 
- Display all strings. 
- Find the longest string. 
- Find the shortest string.
- Display the strings in reverse order

`Answer` [StringCollection.java](src/StringCollection.java)

`Output Terminal`
```
--- INPUT ---
 - String Count (N): 3
 -- Enter Elements --
  - Enter String#1: Javaly
  - Enter String#2: by
  - Enter String#3: @gamedev_uv

--- OUTPUT ---
 -- STRINGS --
  Javaly
  by
  @gamedev_uv

 -- LONGEST STRING --
  @gamedev_uv

 -- SHORTEST STRING --
  by

 -- REV STRINGS --
  ylavaJ
  yb
  vu_vedemag@
```

### Student Details
WAP in Java to accept a student's name, roll number, age, and department. Display the information in a properly formatted form.

`Answer` [StudentDetails.java](src/StudentDetails.java)

`Output Terminal`
```
--- INPUT ---
 - Name: Yuvraj Bhowmik
 - Roll number: 3
 - Age: 19
 - Department: Computer Science & Engineering 

--- OUTPUT ---
Name        : Yuvraj Bhowmik
Age         : 19
Roll number : 3
Department  : Computer Science & Engineering
```

### Simple Calculator
WAP in Java to accept two numbers and an operator (`+`, `-`, `*`, `/`) and display the result. Use may use a switch statement.

`Answer` [SimpleCalculator.java](src/SimpleCalculator.java)

`Output Terminal`
```
--- INPUT ---
 - 1st Operand: 3
 - 2nd Operand: 4
 - Operator: *

--- OUTPUT ---
3.0 * 4.0 = 12.0
```

### Sign Check 
WAP in Java to classify an input number as positive, negative, or zero.

`Answer` [SignCheck.java](src/SignCheck.java)

`Output Terminal`
```
--- INPUT ---
 - N: 3

--- OUTPUT ---
3 is positive
```

### Sum Till N
WAP in Java to accept n and calculate `1` + `2` + `...` + `n` using a loop.

`Answer` [SumTillN.java](src/SumTillN.java)

`Output Terminal`
```
--- INPUT ---
 - N: 3

--- OUTPUT ---
 Sum: 6
```

> [!TIP]
> This is a $O(n)$ solution, and was done in this way as it was asked by the question explicitly. If not mentioned use the summation formula which is - 
> ```math
> \text{Sum till n} = \frac{n \times (n+1)}{2}
> ```
> This formula is of course $O(1)$.

### Digit Counter
WAP in Java to input a number and count the number of digits in it.

`Answer` [DigitCounter.java](src/DigitCounter.java)

`Output Terminal`
```
--- INPUT ---
 - N: 12

--- OUTPUT ---
 Digit Count(12): 2
```

> [!NOTE]
> Here we are using a for loop followed by a `;` which creates a loop with an empty body, So writting this 
> ```java
>for(int t = Math.abs(n); t > 0; t /= 10, dC++);
> ```
> Is equivalent to 
> ```java
>for(int t = Math.abs(n); t > 0; t /= 10, dC++)
> {
>     //Empty body
> }
> ```
> 
> We are using the `abs()` method from the `Math` class here as else this for loop wouldn't work for negative numbers in this form.
> Each iteration we are dividing the value of `t` by `10` which decreases a digit from the right till it is zero (as it is an `int`). And we are simultenously increasing the digit count.
>
> If you don't wanna use the `abs()` method you can do something like this - 
> ```java
> for(int t = n; t != 0; t /= 10, dC++);
> ```

### Reverse Number
WAP in Java to reverse an integer without converting it into a String.

`Answer` [ReverseNumber.java](src/ReverseNumber.java)

`Output Terminal`
```
--- INPUT ---
 - N: 2143

--- OUTPUT ---
 Reverse(2143): 3412
```

### Sum Of Digits
WAP in Java to accept an integer and calculate the sum of its digits.

`Answer` [SumOfDigits.java](src/SumOfDigits.java)

`Output Terminal`
```
--- INPUT ---
 - N: 12

--- OUTPUT ---
 Sum Digits(12): 3
```

### Rectangle
WAP in Java to create a Rectangle class with length and breadth and methods for area and perimeter.

`Answer` [Rectangle.java](src/Rectangle.java)

`Output Terminal`
```
--- INPUT ---
 - Length: 3
 - Breadth: 4

--- OUTPUT ---
 - Perimeter: 14.0
 - Area     : 12.0
```

### Circle 
WAP in Java to create a Circle class with radius, a constructor, and methods for area and circumference

`Answer` [Circle.java](src/Circle.java)

`Output Terminal`
```
--- INPUT ---
 - Radius: 3

--- OUTPUT ---
 - Circumference: 18.849556
 - Area         : 28.274334
```

### Book
WAP in Java to create a Book class with title, author, and price. Use a parameterized constructor and displayBook(). Create three objects.

`Answer` [Book.java](src/Book.java)

`Output Terminal`
```
Project Hail Mary
by Andy Weir
Rs. 349.0

Dune
by Frank Herbert
Rs. 550.0

The Three-Body Problem
by Cixin Liu
Rs. 540.0
```

### Student Marks Average
WAP in Java to create a Student class with marks of three subjects. Calculate total, average, and display the output.

`Answer` [StudentMarksAvg.java](src/StudentMarksAvg.java)

`Output Terminal`
```
--- INPUT ---
 - Marks in A: 50
 - Marks in B: 90
 - Marks in C: 95

--- OUTPUT ---
 - Total  : 235.0
 - Average: 78.333336
```

### Employee 
WAP in Java to create an Employee class with ID, name, and basic salary. Calculate HRA (20%), DA (10%), and gross salary

`Answer` [Employee.java](src/Employee.java)

`Output Terminal`
```
--- INPUT ---
 - ID: 3412
 - Name: Yuvraj Bhowmik
 - Basic Salary: 100

--- OUTPUT ---
 - ID: 3412
 - Name: Yuvraj Bhowmik
 - Base Salary: 100.0
 - HRA: 20.0
 - DA: 10.0
 - Total Salary: 130.0
```

### Second Largest
WAP in Java to accept `n` integers and find the second-largest element without sorting the array. 

`Answer` [SecondLargest.java](src/SecondLargest.java)

`Output Terminal`
```
--- INPUT ---
 - N: 5
--- ENTER 5 ELEMENTS ---
 - Element at (0): 67
 - Element at (1): 40
 - Element at (2): 20
 - Element at (3): 45
 - Element at (4): 89

--- OUTPUT ---
Elements: 67 40 20 45 89 
 - Second Largest Element: 67
```

### Element Frequency
WAP in Java to accept an integer array and determine how many times each distinct element occurs. 

`Answer` [ElementFrequency.java](src/ElementFrequency.java)

`Output Terminal`
```
--- INPUT ---
 - N: 10
--- ENTER 10 ELEMENTS ---
 - Element at (0): 1
 - Element at (1): 2
 - Element at (2): 2
 - Element at (3): 3
 - Element at (4): 3
 - Element at (5): 3
 - Element at (6): 4
 - Element at (7): 4
 - Element at (8): 4
 - Element at (9): 4

--- OUTPUT ---
Elements: 1 2 2 3 3 3 4 4 4 4 

-- Frequency --
1 occurs 1 times
2 occurs 2 times
3 occurs 3 times
4 occurs 4 times
```

### Odd Even Splitter
WAP in Java to accept an array and create separate arrays for even and odd numbers. 

`Answer` [OddEvenSplitter.java](src/OddEvenSplitter.java)

`Output Terminal`
```
--- INPUT ---
 - N: 10
--- ENTER 10 ELEMENTS ---
 - Element at (0): 1
 - Element at (1): 2
 - Element at (2): 3
 - Element at (3): 4
 - Element at (4): 5
 - Element at (5): 6
 - Element at (6): 7
 - Element at (7): 8
 - Element at (8): 9
 - Element at (9): 10

--- OUTPUT ---
 - Original Elements: 1 2 3 4 5 6 7 8 9 10 
 - Even Elements: 2 4 6 8 10 
 - Odd Elements: 1 3 5 7 9 
```

### Rotate Array 
WAP in Java to an array to the right by k positions.

`Answer` [RotateArray.java](src/RotateArray.java)

`Output Terminal`
```
--- INPUT ---
 - N: 5 
--- ENTER 5 array ---
 - Element at (0): 1
 - Element at (1): 2
 - Element at (2): 3
 - Element at (3): 4
 - Element at (4): 5
 - k: 3

--- OUTPUT ---
 - Original Elements: 1 2 3 4 5 
 - Rotated Elements: 3 4 5 1 2
```

### Matrix Addition
WAP in Java Matrix Addition Accept two matrices of the same dimensions and calculate their sum.

`Answer` [MatrixAdd.java](src/MatrixAdd.java)

`Output Terminal`
```
--- INPUT ---
 - Enter dimensions - 
  - M: 2
  - N: 2
 -- INPUT [MATRIX A] --
  - Element at 0, 0: 1
  - Element at 0, 1: 2
  - Element at 1, 0: 3
  - Element at 1, 1: 4
1 2 
3 4 

 -- INPUT [MATRIX B] --
  - Element at 0, 0: 1
  - Element at 0, 1: 1
  - Element at 1, 0: 1
  - Element at 1, 1: 1
1 1 
1 1 

--- SUM ---
2 3 
4 5 
```

### Matrix Diagonal Sum
WAP in Java to accept a square matrix and calculate the sums of the main and secondary diagonals.

`Answer` [DiagonalSum.java](src/DiagonalSum.java)

`Output Terminal`
```
--- INPUT ---
 - Enter dimension - 
  - N: 3
 -- INPUT -- 
  - Element at 0, 0: 1
  - Element at 0, 1: 2
  - Element at 0, 2: 3
  - Element at 1, 0: 4
  - Element at 1, 1: 5
  - Element at 1, 2: 6
  - Element at 2, 0: 7
  - Element at 2, 1: 8
  - Element at 2, 2: 9
1 2 3 
4 5 6 
7 8 9 

--- PRIMARY DIAGONAL ---
1 - - 
- 5 - 
- - 9 
Sum: 15

--- SECONDARY DIAGONAL ---
- - 3 
- 5 - 
7 - - 
Sum: 15
```

### Word Frequency
WAP in Java to accept a sentence and find the frequency of each word.

`Answer` [WordFrequency.java](src/WordFrequency.java)

`Output Terminal`
```
--- INPUT ---
 - Enter the sentence: She sells sea shells at the sea shore

--- OUTPUT ---
 -> She x1
 -> sells x1
 -> sea x2
 -> shells x1
 -> at x1
 -> the x1
 -> shore x1
```

### Remove Duplicates
WAP in Java to create another String after removing duplicate characters from the input.

`Answer` [RemoveDuplicates.java](src/RemoveDuplicates.java)

`Output Terminal`
```
--- INPUT ---
 - String: Hello

--- OUTPUT ---
 Old String: Hello
 New String: Helo
```

### String Rotation
WAP in Java to determine whether one string is a rotation of another.

`Answer` [StringRotation.java](src/StringRotation.java)

`Output Terminal`
```
--- INPUT ---
 - Original String: DOG
 - Test String: GDO

--- OUTPUT ---
 It is a rotation
```

### Employee Manager 
WAP in Java to Create a class `Employee` with attributes `name` and `salary` and a method to display them. Create a class `Manager` that inherits from `Employee` and adds an attribute `department`. Display all the details.

`Answer` [EmployeeManager.java](src/EmployeeManager.java)

`Output Terminal`
```
--- INPUT ---
 -- Enter Employee Details --
  - Name: Yuvraj Bhowmik
  - Salary: 100

 -- Enter Manager Details --
  - Name: Mr. Ludford
  - Salary: 2000
  - Department: R&D 

--- OUTPUT ---
Name  : Yuvraj Bhowmik
Salary: 100.0

Name  : Mr. Ludford
Salary: 2000.0
Department: R&D
```

### Multilevel Inheritance
WAP in Java to create three classes: `Person`, `Employee`, and `Manager`.
Demonstrate multilevel inheritance and display the details of a manager.

`Answer` [MultiInheritance.java](src/MultiInheritance.java)

`Output Terminal`
```
--- INPUT ---
 - Name: Yuvraj Bhowmik
 - Age: 19
 - Salary: 100
 - Department: R&D

--- OUTPUT ---
Name      : Yuvraj Bhowmik
Age       : 19
Salary    : 100.0
Department: R&D
```

### Shape Inheritance
WAP in Java to create a superclass `Shape` with a method `display()`.
Create two subclasses `Circle` and `Rectangle` that calculate and display their respective areas.

`Answer` [Shapes.java](src/Shapes.java)

`Output Terminal`
```
--- INPUT ---
 - Circle - 
   Radius: 3

 - Rectangle - 
   Length: 4
   Breadth: 12

--- OUTPUT ---
Circle Area   : 28.274334
Rectangle Area: 48.0
```

### Salary Inheritance
WAP in Java to create a super class `Employee` containing
`employeeId`, `name`, and `basicSalary`.

Create subclasses `Developer` and `Manager`. Override a method `calculateSalary()` in both subclasses by adding different allowances. Display the final salary of each employee.

`Answer` [SalaryInheritance.java](src/SalaryInheritance.java)

`Output Terminal`
```
--- OUTPUT ---
Developer Salary: 1100.0
Manager Salary  : 2500.0
```

### Student Inheritance
WAP in Java to create a superclass `Person` containing a variable name and a method `display()`.
Create a subclass `Student` with its own name variable. Use the `super` keyword to access the superclass variable and method.

`Answer` [StudentInheritance.java](src/StudentInheritance.java)

`Output Terminal`
```
Person Name:  @gamedev_uv [STUDENT]
Student Name: @gamedev_uv
```

### Safe Division
WAP in Java to accept two integers and perform division. Handle division by zero and invalid input.

`Answer` [SafeDivision.java](src/SafeDivision.java)

`Output Terminal`
```
--- INPUT ---
 - Enter A: 3
 - Enter B: 0

--- OUTPUT ---
java.lang.ArithmeticException: / by zero
```

```
--- INPUT ---
 - Enter A: 12
 - Enter B: 3

--- OUTPUT ---
12 / 3 = 4
```

### Age Validity
WAP in Java to create `validateAge(int age)`. If age is less than 18, generate an exception with an appropriate message.

`Answer` [AgeValidity.java](src/AgeValidity.java)

`Output Terminal`
```
--- INPUT ---
 - Enter Age: 12

--- OUTPUT ---
Exception in thread "main" java.lang.Exception: Must be above 18!
        at AgeValidity.validateAge(AgeValidity.java:10)
        at AgeValidity.main(AgeValidity.java:25)
```

```
--- INPUT ---
 - Enter Age: 19

--- OUTPUT ---
Age is valid
```

### Array Access Validity
WAP in Java accept an array and index. Display the element and handle invalid indices.

`Answer` [ArrayAccessValidity.java](src/ArrayAccessValidity.java)

`Output Terminal`
```
--- INPUT ---
 - Enter N: 5
 - Enter elements -
   - Element at 0: 1
   - Element at 1: 2
   - Element at 2: 3
   - Element at 3: 4
   - Element at 4: 5
 - Enter Index: 6
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
```

```
--- INPUT ---
 - Enter N: 5
 - Enter elements -
   - Element at 0: 1
   - Element at 1: 2
   - Element at 2: 3
   - Element at 3: 4
   - Element at 4: 5
 - Enter Index: 3
Element at 3: 4
```

### Generic Exceptions
WAP in Java to perform division while appropriately handling invalid numeric input, division by zero, and other runtime problems

`Answer` [GenericExceptions.java](src/GenericExceptions.java)

`Output Terminal`
```
--- INPUT ---
 - Enter A: 5
 - Enter B: Four
java.util.InputMismatchException
```

```
--- INPUT ---
 - Enter A: 3
 - Enter B: 0

--- OUTPUT ---
java.lang.ArithmeticException: / by zero
```

```
--- INPUT ---
 - Enter A: 12
 - Enter B: 3

--- OUTPUT ---
12 / 3 = 4
```

### Custom Exception
WAP in Java to create InvalidMarksException. Throw it when marks are outside 0–100.

`Answer` [CustomException.java](src/CustomException.java)

`Output Terminal`
```
--- INPUT ---
 - Enter marks: -5

Exception in thread "main" InvalidMarksException: -5 is not valid as it is not between 0 and 100
        at CustomException.main(CustomException.java:25)
```

```
--- INPUT ---
 - Enter marks: 101

Exception in thread "main" InvalidMarksException: 101 is not valid as it is not between 0 and 100
        at CustomException.main(CustomException.java:25)
```

```
--- INPUT ---
 - Enter marks: 95

--- OUTPUT ---
Valid marks
```

### Bubble Sort
WAP in Java to input an array from the user and perform bubble sort to sort the array.

`Answer` [BubbleSort.java](src/BubbleSort.java)

`Output Terminal`
```
--- INPUT ---
 - Enter N: 5
 - Enter Elements - 
  - Elements 0: 9
  - Elements 1: 1
  - Elements 2: 2
  - Elements 3: 0
  - Elements 4: 4

--- OUTPUT ---
 Original: 9 1 2 0 4 
 Sorted  : 0 1 2 4 9 
```

```
--- INPUT ---
 - Enter N: 5
 - Enter Elements - 
  - Elements 0: 1
  - Elements 1: 2
  - Elements 2: 3
  - Elements 3: 4
  - Elements 4: 5

--- OUTPUT ---
 Original: 1 2 3 4 5 
 Sorted  : 1 2 3 4 5 
```

### Binary Search
WAP in Java to input an array from the user and perform binary search to find an element in it

`Answer` [BinarySearch.java](src/BinarySearch.java)

`Output Terminal`

```
--- INPUT ---
 - Enter N: 5
 - Enter Elements - 
  - Elements 0: 1
  - Elements 1: 2
  - Elements 2: 3
  - Elements 3: 4
  - Elements 4: 5
 - Element to be searched: 2

--- OUTPUT ---
2 was found at index 1
```

```
--- INPUT ---
 - Enter N: 5
 - Enter Elements - 
  - Elements 0: 1
  - Elements 1: 2
  - Elements 2: 3
  - Elements 3: 4
  - Elements 4: 5
 - Element to be searched: 6

--- OUTPUT ---
6 wasn't found in the array
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