import java.lang.*;
import java.util.Scanner; 
class UserMainCode
{
  public static boolean validateCity(String str)
  {
       int len=str.length();
       for(int i=1;i<=len;i++)
      {
         if(str.charAt(i)!='*' && str.charAt(i+1)!='*' && str.charAt(len-1)!='*' &&  str.charAt(len)!='*')
          {
                System.out.println("Valid");
                return true;
          }
         else
         {
              System.out.println("Invalid");
              return false;
         }
      }
     return true;
    }
}
public class Main2
{
     public static void main(String args[])
     {
        UserMainCode umc=new UserMainCode();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
         umc.validateCity(name);
     }
}
