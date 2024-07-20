import java.util.Stack;
public class Stacks {
    public static void main(String args[]){
        Stack<String> Animals = new Stack<>();
       
        // pushing element in stack 
        Animals.push("Elephent"); // we can use add() method here  but also use push() method to add or pushing items in stack  
        Animals.add("Lion");  
        Animals.add("Horse"); 
        Animals.add("Dog");
        Animals.add("Tiger");
        Animals.add("Camel");

        System.out.println("Animals Name in Stack:"+Animals);

        // we are want to see element in stack what is at top of stack 

        System.out.println(Animals.peek());  // output Camel 
        //System.out.println(Animals.elements()); it is used in vector to find peek element 

        Animals.pop();
        System.out.println(Animals);

        
 
    }
}
