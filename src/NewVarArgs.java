/* page 168 */
public class NewVarArgs {
    public static void printArray(Object... args){
        for (Object obj:args){
            System.out.println(obj+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray("1",2,3,4);//autoBoxing
        printArray(new Integer(1),new String("String"),3);
        printArray(47,3.14F,11.11D);
        printArray(new A(),new A());
        printArray(new Integer[]{1,2,34,5});
        printArray();//empty
    }
}
