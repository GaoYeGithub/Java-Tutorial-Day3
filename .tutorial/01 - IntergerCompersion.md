# Interger Compersion 

## Logical Conditions for Java Statments 

|   Logical Conditions     |         Meaning            |
|        :---:             |           :---:            |
|          < 	             |         Less than          |
|          <=		           |   Less than or equal to    |
|          >		           |        Greater than        |
|          >=		      	   |  Greater than or equal to  |
|          ==		     	     |           Equal To         |
|          !=			         |        Not Equal To        |


|   Conditional Statements     |                          Meaning                       |
|        :---:                 |                           :---:                        |
|         if 	                 |      if a specified condition is true execute code     |
|         else		             |       if the same condition is false execute code      |
|        else if		           |if previous condition is false check following condition|
|          switch		      	   |  Check aginst multiple possible case to check if True  |

```java
public class Main {
  public static void main(String[] args) {
    if (5 > 4) {
      System.out.println("5 is greater than 4");
    }
  }
}
```

When using variables don't just write the variable name

```java
public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 4;
    if (x > y) {
      System.out.println("x is greater than y");
    }
  }
}
```