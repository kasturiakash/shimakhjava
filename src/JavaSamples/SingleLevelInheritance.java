package JavaSamples;

class Employee {
	String office="shimakh";
    void salary() {
    	
        System.out.println(office);

        System.out.println("Salary= 200000");
    }
    
}

class Programmer extends Employee { 
// Programmer class inherits from Employee class
    void bonus() {
        System.out.println("Bonus=50000");
    }
}



public class SingleLevelInheritance 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Programmer p = new Programmer();
        p.salary(); // calls method of super class
        p.bonus(); // calls method of sub class
		

	}

}

