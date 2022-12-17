class A
{
    int aa=10;
    
    class B
    {
        int bb=20;
        
        class C
        {
            int cc=30;
        }
    }
}
public class InnerClass
{
    public static void main (String[] args) 
    {
        A Object_Of_A=new A();//This is object of class A
        A.B Object_Of_B=Object_Of_A.new  B();//This is object of class B
        A.B.C Object_Of_C=Object_Of_B.new C();//This is object of class C
        
        System.out.println(Object_Of_A.aa + Object_Of_B.bb + Object_Of_C.cc);
    }
}
