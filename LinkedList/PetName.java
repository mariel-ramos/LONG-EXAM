import java.util.LinkedList;


class main {
    public static void main(String[] args){
    
    
    //Create new linkelist; 
    LinkedList<String> petName = new LinkedList<>();

    petName.add("A");
    petName.add("U");
    petName.add("S");
    petName.add("T");
    petName.add("I");
    petName.add("N");

    System.out.println(petName);

    //Add "B" to the head/front of the Linked list
    petName.addFirst("B");

    //Add "S" to the tail/end  of the Linked list
    petName.addLast("S");

    System.out.println(petName);

    //Replace the last character of the Link list
    petName.set(7, "!");

       //Remove the first character of the Linked list
       petName.remove(0);

       //Display the LinkedList
       System.out.println(petName);
}

}
