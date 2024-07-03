# else if, else, Short Hand If

Unforunatly it doesn't work with string if you want to check string use these String Method



```java
public class Main {
  public static void main(String[] args) {
    int time = 12;
    if (time == 12) {
      System.out.println("Lunch Time.");
    } else {
      System.out.println("Keep Working.");
    }
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    int time = 22;
    if (time < 12) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
  }
}
```

Lastly you can use short hand if to reduce the lines for simple checks
```java
public class Main {
  public static void main(String[] args) {
    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
  }
}
```
