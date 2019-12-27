public class Constructors_01 {

    public static void main(String a[]){
        B b_obj = new B();
    }
}

/*
Every single class has a default no argument constructor unless you define
it.
 */

class A {
   A(){
       super();
   }
}


class B extends A {
B(){
    super();
}
}
