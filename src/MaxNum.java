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
    // to find the max number or word method
    public void MaxTest(){
        W result = maxfind();
        System.out.println("THe Maximum is : "+result);
    }
    public static void main(String[] args) {
        MaxNum <Integer> intmax  = new MaxNum<>(54,34,88,47);
        intmax.MaxTest();
        MaxNum <Float> floatmax = new MaxNum<>(43.f,54.2f,22.6f,11.3f);
        floatmax.MaxTest();
        MaxNum <String> stringmax = new MaxNum<>("Well","Docker","Banana","Indigo");
        stringmax.MaxTest();;
    }
}