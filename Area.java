class Shape
{
   protected String shapeName;
    Shape(String shapeName)
    {
      this.shapeName=shapeName;
    }
   double calculateArea()
   {
         return 0;
   }
}
class Square extends Shape
{
   private int side;
   Square(int side)
   {
     this.side=side;
   }
    double calculateArea()
   {
     double a=side*side;
      return a;
   }
}
class Rectangle extends Shape
{
   private int length;
   private int breadth;
   Rectangle(int length,int breadth)
   {
     this.length=length;
     this.breadth=breadth;
   }
    double calculateArea()
   {  
     double ar=length*breath;
     return ar;
   }
}
class Circle extends Shape
{
   private int radius;
   Circle(int radius)
   {
     this.radius=radius;
   }
    double calculateArea()
   {
     double ac=3.14*radius*radius;
      return ac;
   }
}
 public class Area
{
  public static void main(String args[])
 {
    int n,n1,n2,n3,n4;
   Shape s=new Shape( );
   Square sq=new Square(int n2);
   Rectangle r=new Rectangle(int n,int n1);
   Circle c=new Circle(int n3 );
   System.out.println("1:Rectangle 2:Square 3:Circle");
   Scanner sc=new Scanner(System.in);
   int choice=sc.nextInt();
   switch(choice)
   {
     case 1:
            System.out.println("Enter length and breadth");
             n= sc.nextInt();
             n1=sc.nextInt();
            System.out.print("Area of Rectangle: %.2f" + r.calculateArea( ));
            break;
   case 2:
           System.out.println("Enter side");
            n2= sc.nextInt();
            System.out.print("Area of Square: %.2f" + sq.calculateArea( ));
               break;
   case 3:
            System.out.println("Enter Radius");
             n3= sc.nextInt();
           
            System.out.print("Area of Circle: %.2f" + c.calculateArea( ));  
              break;
   default:System.out.println("invalid");
}
}
}
