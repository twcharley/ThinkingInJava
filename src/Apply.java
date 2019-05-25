import java.util.Arrays;

public class Apply {
    public static void process(Processor p,Object o){
        System.out.println(p.name()+"  :"+p.process(o));
    }
    public static String s="Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new DownCase(),s);
        process(new Spliter(),s);
    }
}

class Processor{
    public Object process(Object input){return input;}
    public String name(){return getClass().getSimpleName();}
}

class Upcase extends Processor{
    public String process(Object input){return ((String)input).toUpperCase();}

}

class DownCase extends Processor{
    public String process(Object input){return ((String)input).toLowerCase();}

}

class Spliter extends Processor{
    public String process(Object input){return Arrays.toString(((String) input).split(" "));}
}