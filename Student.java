
package test_menu;

    /*  
      Lana Saad 202312276
      Maria Essam 202312161
      Lama Alkawaja 202312109
    */

public class Student {
    
    private String name;
    private String gender;
    private int ID;
    private int age;
     

    public Student(){
        name = null;
        gender = null;
        ID = 0;
        age = 0;}
    

    public Student(String name,String gender,int ID,int age) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.age = age; }
    

    public String getName() {
        return name; }
    

    public void setName(String name) {
        this.name = name; }
    

    public String getGender() {
        return gender; }
    

    public void setGender(String gender) {
        this.gender = gender; }
    

    public int getID() {
        return ID; }
    

    public void setID(int ID) {
        this.ID = ID; }

    
    public int getAge() {
        return age; }
    

    public void setAge(int age) {
        this.age = age; }
    
    
    public void display() {
        System.out.println("The name is: " + name);
        System.out.println("The gender is: " + gender);
        System.out.println("The id of the student is: " + ID);
        System.out.println("The age is: " + age); }


    public String toString() {
        return "Name: " + name + ", ID: " + ID + ", Gender: " + gender + ",Age: " + age ;
    }


}

    
