
package test_menu;

    /*
      Lana Saad 202312276
      Maria Essam 202312161
      Lama Alkawaja 202312109
    */

public class Stack {
    
     private Node top;
    

    public Stack() {
        top = null; }
    
    
    public void push(Student St) {
        
        Node curr = new Node(St);
        
        if(top == null)
            top = curr;
        
        else {
            curr.setNext(top);
            top = curr; }
    }
    
    
    public Student pop() {

        if (top == null ) {
            System.out.println("Stack is empty!");
            return null; }
        
        Student temp = top.getData();
        Node pp = top;
        top = top.getNext();
        pp.setNext(null);
        return temp; }
    
    
    public Student top() {

        if (top == null) {
            System.out.println("Stack is empty!");
            return null; }
            
        return top.getData(); }
    
    
    public boolean isEmpty() {
        return (top == null); }
    
    
    public int size() {
        int count = 0;
        Node pp = top;
        while (pp != null) {
            count++;
            pp = pp.getNext();
        }
        return count; }
    
    
    public void display() {
        Node pp = top;
        
        if (pp == null) {
        System.out.println("The stack is empty.");
        return; }
    
        while(pp != null){
            System.out.println("name: " + pp.getData().getName() + " ,Gender: " + pp.getData().getGender() + " ,Id: " + pp.getData().getID() + " ,Age: " + pp.getData().getAge());
            pp = pp.getNext();
        }
    }
    
    
}


