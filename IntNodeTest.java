/**
* IntNodeTest.java
*  @author Catalina Sanchez-Maes
* February 6th, 2019
* CS 272
*/
import java.lang.*;
public class IntNodeTest{//class open
   public static void main(String[] args) {//main open
   //Testing IntNode object constructor and accessor/mutator methods
    	  IntNode n1 = new IntNode();//default constructor
        System.out.println("Current LinkedList: " + n1.toString());
        //Linked list: 0
    	  System.out.println("Default value: " + n1.getValue());//default = 0
    	  System.out.println("Default link: " +n1.getLink());//default = null
    	  n1.setValue(25);//change to 25
    	  System.out.println("Altered value: " + n1.getValue());
        IntNode n2 = new IntNode();//n2 = 0, null
        System.out.println("Adding seprately created n2 to the head");
        n1 = new IntNode(36, n2); //parameter constructor
        System.out.println("Current LinkedList: " + n1.toString());
        //Linked list: 36 -> 0
        
    	  IntNode n3 = new IntNode();
        n3.setValue(45);
        n2.setLink(n3);//test the set link accessor
        System.out.println(n3.getLink()); //null because default constuctor & no link after
        
        //Testing the addition of a new node to the created linkedList
        n1.addNodeAfterThis(26);
    	  System.out.println("Implicit call to toString with a link in the center of the list: " + n1.getLink()); //makes an implicit call to toString
        System.out.println("Current LinkedList(all added): " + n1.toString());
        System.out.println("List length: " +IntNode.listLength(n1));//list length test
        System.out.println("Search 36: "+ IntNode.search(n1, 36));//true if 36
        System.out.println("Search 44: "+ IntNode.search(n1, 44));//false
        System.out.println("Search 45: "+ IntNode.search(n1, 45));//true
        n1.removeNodeAfterThis();//testing remove node on middle node
        System.out.println("Current LinkedList(node 26 removed): " + n1.toString());
        n3.removeNodeAfterThis();//testing remove node at end
        System.out.println("Current LinkedList(node after tail removed): " + n1.toString());

   }//end main
}//end class