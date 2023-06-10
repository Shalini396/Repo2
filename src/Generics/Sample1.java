package Generics;

class Sample0<T> {
	T obj;  
    void add(T obj)
    {
           this.obj=obj;
    }  
    T get()
    {
           return obj;
    }
}
class Sample1{
	public static void main(String args[])
    {  
          Sample0<Integer> m_int=new Sample0<Integer>();  
          m_int.add(2);
          Sample0<String>mstr=new Sample0<String>();  
          mstr.add("Softwaretesting");

          System.out.println("Member of MyGenericClass<Integer>:" + m_int.get());
          System.out.println("Member of MyGenericClass<String>:" + mstr.get());
    }
}
