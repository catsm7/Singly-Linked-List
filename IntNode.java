/**
* IntNode.java
* @author Catalina Sanchez-Maes
* February 6th, 2019
* CS 272
*/
public class IntNode{//class open
      private int value;
      private IntNode link;
      
      public IntNode(){
         setValue(0);
         setLink(null);
      }//end default constructor
      
      public IntNode(int _data, IntNode _node){
         setValue(_data);
         setLink(_node);
      }//end parameter constructor
      
      public int getValue(){
         return value;
      }//end getNode
      
      public IntNode getLink(){
         return link;
      }//end getLink
      
      public void setValue(int _data){
         value = _data;
      }//end setNode
      
      public void setLink(IntNode _link){
         link = _link;
      }//end setLink
      
      /**		
	   *	@param	head	
	   *	 The Linked list head
	   *	@precondition 
      *   should not be a null object and must be an instance of StringSet
      *  @return
      *   integer that calculates the total length
	   */	
      
      public static int listLength(IntNode head){
         int total = 0;
         IntNode cursor = head;
         while(cursor != null) {
    	      cursor = cursor.getLink();
    	      total++;
         }//end while
         return total;
      }//end listLength
      
      /**		
	   *	@return String
      *   string that shows the relationships between all the nodes
	   */	
      
      public String toString() {
    	  String str = "";
    	  IntNode cursor = this;
          while(cursor != null) {
            str += Integer.toString(cursor.getValue());
            if (cursor.getLink() != null){
               str += "->";
            }//end if
       	   cursor = cursor.getLink();
          }//end while
          System.out.println();
          return str;
      }//end toString
      
      /**		
	   *	@param	newdata	
	   *   creation of a new link in the list after the current node
	   */	
      
      public void addNodeAfterThis(int newdata) {
    	  IntNode cursor = this;
        IntNode n4 = new IntNode(newdata, cursor.getLink());
        cursor.setLink(n4);
    	  return;
      }//end addNodeAfterThis
      
      /**		
	   *	@param	head	
	   *	 The Linked list head
	   *	@param data
      *   The value stored in the linked list	
      *  @precondition head 
      *   must not be null
      *  @return
      *   a boolean value fo whether the data is retained by the Linked list
	   */	
      
      public static boolean search(IntNode head, int data) {
    	  if (head == null) {
    		  return false;
    	  }
    	  boolean found = false;
    	  IntNode cursor = head;
    	  while (cursor != null) {
    		  if(cursor.getValue() == data) {
    			  found = true;
    			  return found;
    		  }
    		  cursor = cursor.getLink();
    	  }
    	  return found; 
      }//end search
      
      /**			
      *  @precondition 
      *   at least 1 node must be created first
	   */	
      
      public void removeNodeAfterThis() {
    	  if (this.getLink() == null){
            return;
        }//end if
        IntNode cursor = this;
        this.setLink(this.getLink().getLink());
      }//end removeNodeAfterThis
      
      /**			
      *  
	   */
      public static int listEvenNumber(IntNode head){
         if (head == null){
            return 0;
         }
         while(
      
      }//end listEvenNumber
      
      
}//end class