
/**
 * The Student class - For my Java Programming Exercise 
 * 
 * @author Omid Hezaveh 
 * @version 0.0.1
 */
public class Student extends Human
{
    // instance variables - replace the example below with your own
    private int age;
    private String schoolName; 
    private boolean isRich; 
    private String studentName;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name)
    {
        // initialise instance variables
        
        age = 18;
        schoolName = "Metropolia";
        isRich = false; 
        studentName = name;
        System.out.print( "Hello new student" );
        
    }
    
    /*
    public void introduce() 
    {
        System.out.print( );  
    }    
    */
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void changeSchool(String newSchoolName)
    {
        // put your code here
        schoolName = newSchoolName; 
        System.out.print( schoolName );  
    }
}
