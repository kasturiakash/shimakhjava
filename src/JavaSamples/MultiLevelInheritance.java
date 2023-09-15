package JavaSamples;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
	      Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	}

}



class Shape
{
	   public void display() 
	   {
	      System.out.println("Inside structure");
	   }
}
class square extends Shape 
{
	   public void area() {
	      System.out.println("Inside area");
	   }
}
class Cube extends square 
{
	   public void volume() 
	   {
	      System.out.println("Inside volume");
	   }
}