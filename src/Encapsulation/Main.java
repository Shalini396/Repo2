package Encapsulation;

public class Main {
	public static void main(String[] args) {
        //create an object of Student class
        Student s=new Student();
        //set fields values using setter methods
        s.setId (27);
        s.setname("Shalini");
        //print values using getter methods        
        System.out.println("Student Data:" + "\nStudent ID:" + s.getId()
                            + " Student Name:" + s.getname());
    }

}
