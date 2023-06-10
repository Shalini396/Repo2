package Generics;

public class Sample12<T1, T2> {
	T1 obj1;  // An object of type T1
    T2 obj2;  // An object of type T2
 
    // constructor to initialise T1 & T2 objects
    Test_Generics(T1 obj1, T2 obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    public void print()
    {
        System.out.println("T1 Object:" + obj1);
        System.out.println("T2 Object:" + obj2);
    }
}
class Sample2
{
     public static void main (String[] args)
    {
         Sample12<String, Integer>obj =
             newSample12<String, Integer>("Java Generics", 1);
 
         obj.print();
    }
}
