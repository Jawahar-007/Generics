public class MaxNum<W extends Comparable<W>>{
    public W maxfind(W num1,W num2,W num3){
        W max = num1;
        if(num2.compareTo(max)>0){
            max = num2;
        }
        if(num3.compareTo(max)>0){
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        MaxNum <Integer> intmax  = new MaxNum<>();
        int result = intmax.maxfind(25,43,11);
        int result1 = intmax.maxfind(89,47,14);
        int result2 = intmax.maxfind(32,98,45);
        System.out.println("The Maximum Number 1st set is :"+result);
        System.out.println("The Maximum Number 2nd set is :"+result1);
        System.out.println("The Maximum Number 3rd set is :"+result2);

        MaxNum<Float> floatmax = new MaxNum<>();
        float fresult = floatmax.maxfind(56.4f,32.6f,89.5f);
        float fresult1 = floatmax.maxfind(43.1f,55.2f,76.8f);
        float fresult2 = floatmax.maxfind(90.6f,32.4f,12.3f);
        System.out.println("The Maximum number in 1st set is :"+fresult);
        System.out.println("The Maximum number in 2nd set is :"+fresult1);
        System.out.println("THe Maximum number in 3rd set is :"+fresult2);

        MaxNum<String> stringmax  = new MaxNum<>();
        String stringresult = stringmax.maxfind("Apple","Banana","WaterMelon");
        String stringresult1 = stringmax.maxfind("Indigo","Den","Wheat");
        String stringresult2 = stringmax.maxfind("Oreo","Mango","Friend");
        // Based on Unicode Value Of The String
        System.out.println("The Maximum String in 1st Set is: "+stringresult);
        System.out.println("The Maximum String in 2nd Set is: "+stringresult1);
        System.out.println("The Maximum String in 3rd Set is: "+stringresult2);
    }
}