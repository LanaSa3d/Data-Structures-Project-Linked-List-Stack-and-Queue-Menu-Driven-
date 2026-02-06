
package test_menu;

import java.util.Scanner;

public class Test_Menu {

    /*
      Lana Saad 202312276
      Maria Essam 202312161
      Lama Alkawaja 202312109
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
    System.out.println("Welcome to the Data Structure Project Menu:\n");
    int choice = 0;
    while (choice != 4) {
        System.out.println("1. Linked List");
        System.out.println("2. Stack");
        System.out.println("3. Queue");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You chose Linked list!");
                LinkedList L1 = new LinkedList();
                int Lchoice = 0;
            OUTER:
            while (Lchoice != 9) {
                System.out.println("\nLinked List Menu:  ");
                System.out.println("1. Insert at Beginning");
                System.out.println("2. Insert at End");
                System.out.println("3. Insert at position");
                System.out.println("4. Delete at Beginning");
                System.out.println("5. Delete at End");
                System.out.println("6. Delete at Position");
                System.out.println("7. Search");
                System.out.println("8. Display");
                System.out.println("9. Return to the Main Menu");
                System.out.println("Enter your choice here:");
                Lchoice = input.nextInt();
                switch (Lchoice) {
                    case 1:
                        {
                            System.out.println("Enter the ID of the student you want to insert at first: ");
                            int id = input.nextInt();
                            System.out.println("Enter the Name of the student you want to insert at first: ");
                            String name = input.next();
                            System.out.println("Enter the Gender of the student you want to insert at first: ");
                            String gender = input.next();
                            System.out.println("Enter the Age of the student you want to insert at first: ");
                            int age = input.nextInt();
                            Student st1 = new Student(name, gender, id, age);
                            L1.insertAtFirst(st1);
                            System.out.println("Congrats! the student has been successfully added");
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Enter the Id of the student you want to insert at last: ");
                            int id = input.nextInt();
                            System.out.println("Enter the Name of the student you want to insert at last: ");
                            String name = input.next();
                            System.out.println("Enter the Gender of the student you want to insert at last: ");
                            String gender = input.next();
                            System.out.println("Enter the Age of the student you want to insert at last: ");
                            int age = input.nextInt();
                            Student st2 = new Student(name, gender, id, age);
                            L1.insertAtLast(st2);
                            System.out.println("Congrats! the student has been successfully added");
                            break;
                        }
                    case 3:
                        System.out.println("Do you want to insert after or before a specific student?");
                        String Str = input.next();
                        while (!Str.equalsIgnoreCase("before") && !Str.equalsIgnoreCase("after")) {
                            System.out.println("Incorrect choice. Try again :/");
                            Str = input.next();
                        }
                        if (Str.equalsIgnoreCase("before")) {
                            System.out.println("Type the ID of the student you want to add: ");
                            int id = input.nextInt();
                            System.out.println("Type the Name of the student you want to add: ");
                            String name = input.next();
                            System.out.println("Type the Gender of the student you want to add: ");
                            String gender = input.next();
                            System.out.println("Type the Age of the student you want to add:");
                            int age = input.nextInt();
                            Student st3 = new Student(name, gender, id, age);
                            
                            System.out.println("Enter the Id of the target node you want to insert the value before it: ");
                            int ID = input.nextInt();
                            L1.insertBefore(st3, ID);
                        } else if (Str.equalsIgnoreCase("after")) {
                            System.out.println("Enter the Id of the student you want to add: ");
                            int id = input.nextInt();
                            System.out.println("Enter the Name of the student you want to add: ");
                            String name = input.next();
                            System.out.println("Enter the Gender of the student you want to add: ");
                            String gender = input.next();
                            System.out.println("Enter the Age of the student you want to add:");
                            int age = input.nextInt();
                            Student st4 = new Student(name, gender, id, age);
                            
                            System.out.println("Enter the Id of the target node you would like to put the value After it: ");
                            int ID = input.nextInt();
                            L1.insertAfter(st4, ID);
                        }
                        break;
                    case 4:
                        L1.deleteAtFirst();
                        break;
                    case 5:
                        L1.deleteAtLast();
                        break;
                    case 6:
                        System.out.println("Enter the student ID you wish to Delete: ");
                        int numberToDelete = input.nextInt();
                        L1.DeleteAtPosition(numberToDelete);
                        break;
                    case 7:
                        System.out.println("Enter the student ID you wish for search: ");
                        int number = input.nextInt();
                        System.out.println(L1.SearchID(number));
                        break;
                    case 8:
                        System.out.println("\nThe list of students you entered is: ");
                        L1.display();
                        break;
                    default:
                        System.out.println("welcome Back to the Main Menu!");
                        break OUTER;
                }
            }
                break;

            case 2:
                System.out.println("You chose Stack!");
                Stack S1 = new Stack();
                int Schoice = 0;
            OUTER_1:
            while (Schoice != 7) {
                System.out.println("\nStack Menu:  ");
                System.out.println("1. Add an element to the top of the stack");
                System.out.println("2. Remove the first element from the stack");
                System.out.println("3. View the top element");
                System.out.println("4. Display the number of elements in the stack");
                System.out.println("5. Check if the stack is empty");
                System.out.println("6. Displays the stack");
                System.out.println("7. Return to the Main Menu");
                System.out.println("Enter your choice here:");
                Schoice = input.nextInt();
                switch (Schoice) {
                    case 1:
                        System.out.println("Enter the Id of the student you wish to place at the top: ");
                        int id = input.nextInt();
                        System.out.println("Please enter the Name of the student you wish to place at the top: ");
                        String name = input.next();
                        System.out.println("Please enter the Gender of the student you wish to place at the top: ");
                        String gender = input.next();
                        System.out.println("Please enter the age of the student you wish to place at the top: ");
                        int age = input.nextInt();
                        Student st5 = new Student(name, gender, id, age);
                        S1.push(st5);
                        System.out.println("Congrats! the student has been successfully added");
                        break;
                    case 2:
                        System.out.println(S1.pop());
                        break;
                    case 3:
                        System.out.println(S1.top());
                        break;
                    case 4:
                        System.out.println("The size of the stack is: " + S1.size());
                        break;
                    case 5:
                        if (S1.isEmpty() == true) {
                            System.out.println("Oops! Your Stack is empty");
                        } else {
                            System.out.println("Your Stack is not empty");
                        }
                        break;
                    case 6:
                        System.out.println("\nThe list of students you entered is: ");
                        S1.display();
                        break;
                    default:
                        System.out.println("Welcome Back to Main Menu!");
                        break OUTER_1;
                }
            }
                break;

            case 3:
                System.out.println("Your chose Queue!");
                Queue Q1 = new Queue();
                int Qchoice = 0;
            OUTER_2:
            while (Qchoice != 7) {
                System.out.println("\nQueue Menu:  ");
                System.out.println("1. Add an element to the rear of the queue.");
                System.out.println("2. Remove the front element from the queue.");
                System.out.println("3. View the front element without removing it.");
                System.out.println("4. Check the number of elements in the queue.");
                System.out.println("5. Check if the queue is empty.");
                System.out.println("6. Display the Queue");
                System.out.println("7. Return to the Main Menu");
                System.out.println("Enter your choice :");
                Qchoice = input.nextInt();
                switch (Qchoice) {
                    case 1:
                        System.out.println("Please enter the Id of the student you want to insert at the end: ");
                        int id = input.nextInt();
                        System.out.println("Please enter the Name of the student you want to insert at the end: ");
                        String name = input.next();
                        System.out.println("Please enter the Gender of the student you want to insert at the end: ");
                        String gender = input.next();
                        System.out.println("Please enter the Age of the student you want to insert at the end: ");
                        int age = input.nextInt();
                        Student st6 = new Student(name, gender, id, age);
                        Q1.enqueue(st6);
                        System.out.println("Congrats! the student has been successfully added");
                        break;
                    case 2:
                        System.out.println( Q1.dequeue());
                        break;
                    case 3:
                        System.out.println(Q1.front());
                        break;
                    case 4:
                        System.out.println("The size of the queue is: " + Q1.size());
                        break;
                    case 5:
                        if (Q1.isEmpty() == true) {
                            System.out.println("Oops! Your Queue is empty");
                        } else {
                            System.out.println("Your Queue is not empty");
                        }
                        break;
                    case 6:
                        System.out.println("\nThe list of students you entered is: ");
                        Q1.display_Queue();
                        break;
                    default:
                        System.out.println("Welcome Back to Main Menu!");
                        break OUTER_2;
                }
            }
                break;

            default:
                break;
        }
        }
        System.out.println("Phew! You exited the program successfully");
    }

        
}
    


        
