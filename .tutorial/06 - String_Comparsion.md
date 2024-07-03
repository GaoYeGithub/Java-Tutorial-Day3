# String Comparsion

Unforunatly it doesn't work with string if you want to check string use these String Method

|   String Comparsions     |         Meaning            |
|        :---:             |           :---:            |
|        equals()	         |          Equal To          |
|    equalsIgnoreCase() 	 |      Ignore If equal       |


```java
import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    String thing1 = "apple"
    String thing2 = "apple";
    if (thing1.equals(thing2)) {
      System.out.println("It an apple!");
    }
  }
}
```

```java
import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter Username");
    String userName = myObj.nextLine();  
    String adminName = "Gary";
    if (userName.equals(adminName)) {
      System.out.println("Hello Admin");
    }
  }
}
```
