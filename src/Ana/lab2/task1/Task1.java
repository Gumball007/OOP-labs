package Ana.lab2.task1;

public class Task1 {
    public static void main(String[]args){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        theBox Box1 = new theBox();
        System.out.println("---Box 1---");
        System.out.println("The area of the Box1 is: " + Box1.Area() + " cm^2" );
        System.out.println("The volume of the Box1 is: " + Box1.Volume() + " cm^3" );

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        theBox Box2 = new theBox(7.1);
        System.out.println("---Box 2---");
        System.out.println("The area of the Box2 is: " + Box2.Area() + " cm^2" );
        System.out.println("The volume of the Box2 is: " + Box2.Volume() + " cm^3" );

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        theBox Box3 = new theBox(5.2, 2, 4);
        System.out.println("---Box 3---");
        System.out.println("The area of the Box3 is: " + Box3.Area() + " cm^2" );
        System.out.println("The volume of the Box3 is: " + Box1.Volume() + " cm^3" );

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        
    }
}


