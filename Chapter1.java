 (/**

Name: Rekardo Thomas
Course: CIS 144
Purpose:Chapter 1 - Coding assignments CIS 144
This displays code for programming exercises 1.1, 1.3, 1.5,1.8

*/ 


public class Chapter1 {
	public static void programmingExercise1_1() {
		
		//prints out welcome to java
		System.out.println("Welcome to Java.");
		
		//prints out welcome to Computer Science
		System.out.println("Welcome to Computer Science.");
		
		//prints out Programming is fun
		System.out.println("Programming is fun.");
	}
	


    public static void programmingExercise1_3() {
        
        //prints out Java Pattern
        
        System.out.println("    J    A    V     V    A");
        System.out.println("    J   A A    V   V    A A");
        System.out.println("J   J  AAAAA    V V    AAAAA");
        System.out.println(" J J  A     A    V    A     A");

    }




    public static void programmingExercise1_5() {
        
    double math_problem = (9.5 * 4.5) - (2.5 * 3) / (45.5 - 3.5);
        
    System.out.printf("The answer is: %.2f%n", math_problem);
        
     
    }




    public static void programmingExercise1_8(){
        
    double radius = 5.5;
    double pie = 3.14;
    double perimeter = 2 * radius * pie;
    double area = radius * radius * pie;
    
    System.out.println("The Area is " + area);
    System.out.println("The Perimeter is " + perimeter);
    
    }

}