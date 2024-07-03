import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter Organization");
    String organization = myObj.nextLine();  
    String organizationID = "Replit";
    if (organization.equals(organizationID)) {
      System.out.println("Enter Profile ID");
      int ProfileID = Integer.parseInt(myObj.nextLine());
      switch (ProfileID) {
        case 123456:
          System.out.println("Hello User");
          break;
        case 111111:
          System.out.println("Hello Admin");
          break;
      } 
    } else {
      System.out.println("Invalid Profile ID");
    }
  }
}