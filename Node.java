
package test_menu;

    /*
      Lana Saad 202312276
      Maria Essam 202312161
      Lama Alkawaja 202312109
    */

public class Node {
    
    private Student data;
    private Node next;
	
	
	public Node (Student St) {
            data = St;
	    next = null; }
	
	
	public Student getData() {
            return data; }
	
	
	public void setData(Student St) {
            this.data = St; }
	

	public Node getNext() {
            return next; }

        
	public void setNext(Node next) {
            this.next = next; }
        
}
    

