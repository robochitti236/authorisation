import java.util.*;
class create
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Sign up now\nEnter user id: ");
    String duid = input.next();
    System.out.print("User id available\nEnter pin: ");
    int dpin = input.nextInt();
    System.out.print("Account created. Login now\nEnter user id: ");
    String uid = input.next();
    if(Objects.equals(uid, duid))
    {
      System.out.print("Welcome "+duid+"\nEnter pin: ");
      int pin = input.nextInt();
      if(pin==dpin)
      {
        System.out.print("Access Granded");
      }
      else
      {
        System.out.print("Access Denied");
      }
    }
    else
    {
      System.out.print("User not found");
    }
    input.close();
  }
}
