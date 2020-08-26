import java.util.Scanner; 
class UserMainCode{
   public static boolean validatePlayer(String str)
   {
	    
	 
	    
	    for(int i=0;i<str.length();i++)
	    {
	       if(str.charAt(i)=='a')
		{
		if(i%2!=0)
		{
			continue;
		}
	    	else
		{
			System.out.println("Invalid");
			return false;
		}
	    	}
	    }
	    System.out.println("valid");
	    return true;
  }
}
class Main3
{
   	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String name = s.nextLine(); 
	UserMainCode umc=new UserMainCode();
	umc.validatePlayer(name);

	
	
   }
}