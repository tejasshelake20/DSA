public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorial2(num));
    }

//    static int factorial(int num){
//        int fact = num;
//        while(num > 1) {
//            fact = fact * (num - 1);
//            num--;
//        }
//        return fact;
//    }

    static int factorial2(int num){
        if(num==0){
            return 1;
        }
        return num*factorial2(num-1);
    }
}
