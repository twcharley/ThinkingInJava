public class ExplicitStatic //P159
 {
     public static void main(String[] args) {
         System.out.println("inside Main()");
         Cups.cups[1].f(99);

     }
}


class Cup {
    static int count=0;
    Cup(int marker){

        System.out.println("Cup("+marker+")"+"count="+(++count));

    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }

}

class Cups{

    static Cup cups[]=new Cup[10];
    static {
        for (int i=0 ;i<10;i++){
            cups[i]=new Cup(i);
        }
    }
    Cups(){
        System.out.println("Cups()");
    }


}
