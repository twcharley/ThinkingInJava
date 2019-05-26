import java.util.Random;
/*page 165*/
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        int[] b;
        Random random=new Random();
        a=new int[random.nextInt(17)];
        b=a;
        for (int i=0 ;i<a.length;i++){
            a[i]=i;
        }
        for(int in :b){
            System.out.println(in);
        }

        Integer[] c=new Integer[10];
        for(int i=0;i<10;i++){
            System.out.println(c[i]);
        }
    }
}
