import java.util.Scanner; 

class fullName {
  public static void main(String[] args) {
    Scanner myFirstName = new Scanner(System.in); 
    System.out.println("Enter Firstname");
    String firstname = myFirstName.nextLine();
    Scanner myLastName = new Scanner(System.in); 

    System.out.println("Enter Lastname");
    String lastname = myFirstName.nextLine();
    System.out.println("Your FullName is " + firstname + " " + lastname);
}
}