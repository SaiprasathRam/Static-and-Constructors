package learnjavaconstructors;

public class JavaConstructors
{
 int empID;
 String Name;
 static String CompName;
 JavaConstructors()
 {
	 System.out.println("Default Constructors");
 }
 JavaConstructors(int empID, String Name, String CompName)
 {
	 this();
	 this.empID = empID;
	 this.Name = Name;
	 this.CompName = CompName;
 }
 
 public static void main(String[] args)
 {
	 JavaConstructors obj01 = new JavaConstructors(100, "Sai", "CTS");
	 JavaConstructors obj02 = new JavaConstructors(200, "Karthik", "TCS");
	 System.out.println(obj01.empID);
	 System.out.println(obj01.Name);
	 System.out.println(obj01.CompName);
	 System.out.println(obj02.empID);
	 System.out.println(obj02.Name);
	 System.out.println(obj02.CompName);
 }
}
