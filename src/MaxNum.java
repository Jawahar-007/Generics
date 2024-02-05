import java.util.Arrays;

public class MaxNum<W extends Comparable<W>>{
    private W[] values;

    public MaxNum(W... values){
        this.values = values;
    }
    public W maxfind(){
        if(values == null||values.length == 0)
            return null;
        Arrays.sort(values);
        return values[values.length-1];
    }
    private static <P> void MaxPrint(P max) {
        System.out.println("The Maximum is: " + max);
    }
    // to find the max number or word method
    public void MaxTest(){
        W result = maxfind();
        MaxPrint(result);
    }
    public static void main(String[] args) {
        MaxNum <Integer> intmax  = new MaxNum<>(54,34,88,47,76,45,12);
        intmax.MaxTest();
        MaxNum <Float> floatmax = new MaxNum<>(43.f,33.9f,10.5f,54.2f,22.6f,11.3f);
        floatmax.MaxTest();
        MaxNum <String> stringmax = new MaxNum<>("Well","Docker","Banana","Key","Read","Indigo");
        stringmax.MaxTest();;
    }
}