package ConceptOfTheDay.inheritance;
public class inheritanceConcept {
    public static void main(String[] args) {
        A a = new A(10); // placeholder number
        a.methodOne();
        B b = new B();
        b.methodOne();
    }
}

class A {

    void methodOne() {
        System.out.println("method one");
    }

    // if we had put int i inside the constructor, we would get a compile time error. Because it needs to be default
    // To avoid this error, write the constructor for sub class. From that constructor call super class constructor explicitly. See the below code,
    // so we used super(10) to send in an int to i in A

    A(int i) {
        System.out.println("constructor A");
    }

    private int i;
    int j;
    protected int k;
    public int m;

}


// B reaches the methods inside class A too.
class B extends A {
    public B() {
        super(10);
        System.out.println("class b constructor");

    }

    void methodOfClassB() {
        //System.out.println(i);        Private member can not be inherited
        System.out.println(j);           //Default member can be inherited within package
        System.out.println(k);         //protected member can be inherited to any subclass
        System.out.println(m);       //public member can be inherited to all sub classes
    }

}

class C extends B {
    void methodOfClassC() {
        System.out.println(j);     //Default member can be inherited within package
        System.out.println(k);    //protected member can be inherited to any subclass
        System.out.println(m);    //public member can be inherited to any subclass

        B b = new B();
        System.out.println(b.j);   //Default member can be used within package
        System.out.println(b.k);   //Protected member can be used anywhere in the package
        System.out.println(b.m);  //Public member can be used anywhere
    }
}
