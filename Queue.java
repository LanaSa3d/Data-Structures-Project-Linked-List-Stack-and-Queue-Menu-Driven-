
package test_menu;

    /*
      Lana Saad 202312276
      Maria Essam 202312161
      Lama Alkawaja 202312109
    */

public class Queue {
    
     private Node front;
    private Node rear;
    
    
    public Queue(){
    
        front = null;
        rear = null; }
        

    public void enqueue(Student St){
        Node pp = new Node(St);
        
        if (front == null){
            front = pp;
            rear = pp; }
        
        else {
            rear.setNext(pp);
            rear = pp; }  
        System.out.println("Successfully added student to the rear of the queue.");
    }
    
    
    public Student dequeue() {

        if(front == null) {
            System.out.println("Queue is empty!");
            return null; }
            
        Student temp = front.getData();
        Node ss = front;
        front = front.getNext();
        ss.setNext(null);
        return temp; }
    
    
    public int size() {
        int count = 0;
        Node ss = front;
        
        while (ss != null) {
            count++;
            ss = ss.getNext(); }
        
        return count; }
    
    
    public Student front() { 
        if (front == null) {
            System.out.println("Queue is empty!");
            return null; }
        
        return front.getData(); }
    
    
    public boolean isEmpty() {
        return (front == null); }
    
    
    public void display_Queue (){
        Node ss = front;
        
        if (ss == null) {
        System.out.println("The queue is empty.");
        return; }
    
        while (ss != null){
            System.out.println("name: " + ss.getData().getName() + " ,Gender: " + ss.getData().getGender() + " ,Id: " + ss.getData().getID() + " ,Age: " + ss.getData().getAge());
            ss = ss.getNext();
        }
    }
    
    
}


