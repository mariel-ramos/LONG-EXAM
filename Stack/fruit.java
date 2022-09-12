import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Create a Stack of character of your favorite fruit
        Stack<String> fruit = new Stack<>();

        fruit.push("S");
        fruit.push("T");
        fruit.push("R");
        fruit.push("A");
        fruit.push("W");
        fruit.push("B");
        fruit.push("E");
        fruit.push("R");
        fruit.push("R");
        fruit.push("Y");

        //Print the Stack
        System.out.println(fruit);

        //Add a "MILK SHAKE" to the Stack

        fruit.push(" ");
        fruit.push("M");
        fruit.push("I");
        fruit.push("L");
        fruit.push("K");

        fruit.push(" ");
        fruit.push("S");
        fruit.push("H");
        fruit.push("A");
        fruit.push("K");
        fruit.push("E");

        //Print the Stack
        System.out.println(fruit);

        //Remove "MILK SHAKE" and add "CAKE"
        fruit.pop();
        fruit.pop();
        fruit.pop();
        fruit.pop();
        fruit.pop();
        
        fruit.pop();
        fruit.pop();
        fruit.pop();
        fruit.pop();
        fruit.pop();

        fruit.push("C");
        fruit.push("A");
        fruit.push("K");
        fruit.push("E");

        //Print the Stack
        System.out.println(fruit);

        }
}
