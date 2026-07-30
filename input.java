import java.util.Scanner;
class Input
{
   public static void main(String args[]) {
      int id;
      String name;
      Scanner sc = new Scanner (System.in);
      id = sc.nextInt();
      name = sc.nextLine();
      System.out.println("my id is:"+id);
      System.out.println("my name is:"+name);

   }
}