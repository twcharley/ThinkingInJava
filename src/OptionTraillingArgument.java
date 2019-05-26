/* page 168 */
public class OptionTraillingArgument {
    static void f(int require,String... args){
        System.out.print("require:"+require+" ");
        for(String s:args)
            System.out.print(s+"  ");
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"2","3","4");
        f(2,new String[]{"A","B"});
    }
}
