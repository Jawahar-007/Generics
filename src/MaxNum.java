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
        MaxNum <Integer> nummax = new MaxNum<>();
        int result = nummax.maxfind(25,43,11);
        int result1 = nummax.maxfind(89,47,14);
        int result2 = nummax.maxfind(32,98,45);
        System.out.println("The Maximum Number 1st set is :"+result);
        System.out.println("The Maximum Number 2nd set is :"+result1);
        System.out.println("The Maximum Number 3rd set is :"+result2);
    }
}