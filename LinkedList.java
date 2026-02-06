
package test_menu;

    /*
      Lana Saad 202312276
      Maria Essam 202312161
      Lama Alkawaja 202312109
    */

public class LinkedList {
    
     private Node head;

    public LinkedList() {
        head = null; }
    

    public void insertAtFirst(Student St) {
        
        Node SS = new Node(St);
        if (head == null) {
            head = SS; } 
        else {
            SS.setNext(head);
            head = SS; }        
    }

    
    public void insertAtLast(Student St) {
        
        Node SS = new Node(St);
        if (head == null) {
            head = SS; }
        else {
            Node PP = head;
            while (PP.getNext() != null) {
                PP = PP.getNext(); }
            PP.setNext(SS); }         
    }
    
    
     public void insertAfter(Student St, int ID) {
        Node SS = new Node(St);
        Node PP = head;
        Node targetSt = null;

        if (head == null) {
            System.out.println(" The Linked list is empty! ");
            return; }
        
        while (PP != null) {
            if (PP.getData().getID()== ID) {
                targetSt = PP;
                break; }
            
            PP=PP.getNext();
        }
        
        if (targetSt != null) {
            Node After = targetSt.getNext();
            SS.setNext(After);
            targetSt.setNext(SS);
            System.out.println("Congratulation! The student has been successfully added and their full information is: " + "Name: " + SS.getData().getName() + " ,Id: " + SS.getData().getID() + " ,Gender: " + SS.getData().getGender() + " ,Age: " + SS.getData().getAge());
        } else {
            System.out.println("student not found "); }
    }

     
    public void insertBefore(Student St, int ID) {
        
        Node SS = new Node(St);
        Node prev = null;
        Node PP= head;
        Node targetSt = null;
        if (head == null) {
            
            System.out.println(" The Linked list is empty! ");
            return; }
        
        while (PP != null) {
            
            if (PP.getData().getID() == ID) {
                
                targetSt = PP;
                break; }
            
            prev = PP;
            PP=PP.getNext(); }
        
        if (targetSt != null) {
            
            if (prev == null) {
                
                SS.setNext(head);
                head = SS; }
            else {
                
                prev.setNext(SS);
                SS.setNext(targetSt); }
            
            System.out.println("Congratulation! The student has been successfully added and their full information is: " + "Name: " + SS.getData().getName() + " ,Id: " + SS.getData().getID() + " ,Gender: " + SS.getData().getGender() + " ,Age: " + SS.getData().getAge());
        } else {
            System.out.println("student not found "); }
    }

    
    public void deleteAtFirst() {
        
        if (head == null) {
            
            System.out.println(" The Linked list is empty! ");
            return; } 
        
        else {
            
            Node pp = head;
            head = head.getNext();
            pp.setNext(null);
            System.out.println("The information of the student has been deleted successfully ");
        }
    }

    public void deleteAtLast() {
        
        if (head == null) {
            
            System.out.println("Your Linked list is already empty");
            return;
        }
        
        if (head == null || head.getNext() == null) {
            head = null;
            System.out.println("Student information was deleted ");
        } else {
            Node ss = head;
            while (ss.getNext().getNext() != null) {
                ss = ss.getNext();
            }
            
            ss.setNext(null);
            System.out.println("Student information was deleted. ");
        }
    }
    
    
    public void DeleteAtPosition(int ID) {
        
        Node Delete = null;
        Node PP = head;
        Node prev = null;
        if (head == null) {
            
            System.out.println(" The Linked list is empty! ");
            return;
        }
        while (PP != null) {
            
            if (PP.getData().getID() == ID) {
                
                Delete= PP;
                break;
            }
            prev = PP;
            PP = PP.getNext();}
        
        if (Delete == null) {
            
            System.out.println("The ID you entered isnt found ");
        }
        
        if (Delete!= null) {
            
            if (prev==null) {
                
                head=head.getNext();
            } 
            else {
                
                prev.setNext(Delete.getNext());
            }
            System.out.println("Congratulation! The student has been successfully added and their full information is: " + "Name: " + Delete.getData().getName() + " ,Id: " + Delete.getData().getID() + " ,Gender: " + Delete.getData().getGender() + " ,Age: " + Delete.getData().getAge());
        }
    }

    
    public Node search(Student St) {
        Node PP = head;
        while (PP != null) {
            if (PP.getData().equals(St)) {
                return PP;
            }
            PP = PP.getNext();
        }
        return null;
    }

    
    public String SearchID(int St_ID) {
        
        Node PP = head;
        while (PP != null) {
            if (PP.getData().getID() == St_ID) {
                return "Here is the information for the student that is being searched: " + " Name: " + PP.getData().getName() + " ,Id: " + PP.getData().getID() + " ,Gender: " + PP.getData().getGender() + " ,Age: " + PP.getData().getAge();
                }
            PP = PP.getNext();
        }
        return "student not found";
    }

    
     public void display() {
        Node PP = head;
        
        if (PP == null) {
        System.out.println("The Linked List is empty.");
        return; }
        
        while (PP != null) {
            System.out.print("Name: " + PP.getData().getName() + " ,Id: " + PP.getData().getID() + " ,Gender: " + PP.getData().getGender() + " ,Age: " + PP.getData().getAge());
            System.out.println();
            PP = PP.getNext();
        }
    }  
    
}


