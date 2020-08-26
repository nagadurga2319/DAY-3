import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner; 
class UserMainCode{
   public static boolean validateDate(String strDate)
   {
	    
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
	    
	    
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
		
	        System.out.println("valid");
		return true;
	    }
	    
	    catch (ParseException e)
	    {
	        
	        System.out.println(" Invalid");
	        return false;
	    }
	   
	    
	
   }
}
class Main
{
   	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	String name = s.nextLine(); 
	UserMainCode umc=new UserMainCode();
	umc.validateDate(name);

	
	
   }
}