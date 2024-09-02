package GameOfTwoStacks;

import java.util.*;

public class GameOfTwoStacks {

    public static void main(String[] args) {
        List d = new Stack();
        List f = new Stack();
        d.add(6);
        d.add(5);
        d.add(3);
        d.add(2);
        d.add(1);

        f.add(5);
        f.add(2);
//        f.add(8);
//        f.add(5);

        System.out.println(d);
        System.out.println(f);

        System.out.println(twoStacks(19,d,f));

    }
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {

        int sum = 0;
        int ans = 0;

        if(a.isEmpty() && b.isEmpty()){
            return ans;
        }

        while(!a.isEmpty() && !b.isEmpty() && sum <= maxSum){
            int add = 0;
            if((a.get(0) >= b.get(0))){
                add = a.get(0);
                sum += add;
                if(sum > maxSum){
                    return ans;
                }
                else {
                    ans++;
                }
                a.remove(0);

                add = b.get(0);
                sum += add;
                if(sum > maxSum){
                    return ans;
                }
                else {
                    ans++;
                }
                b.remove(0);
            }

            else{
                add = b.get(0);
                sum = sum + add;
                if(sum > maxSum){
                    return ans;
                }
                else {
                    ans++;
                }
                b.remove(0);

                add = a.get(0);
                sum = sum + add;
                if(sum > maxSum){
                    return ans;
                }
                else {
                    ans++;
                }
                a.remove(0);
                ans++;

            }
//            sum = sum + add;
        }

        if(!a.isEmpty() && b.isEmpty()){
            ans++;
        }

        if(a.isEmpty() && !b.isEmpty()){
            ans++;
        }

//        if(a.isEmpty()){
//            while (sum <= maxSum) {
//                sum = sum + b.remove();
//                ans++;
//            }
//        }
//
//        if(b.isEmpty()){
//            while (sum <= maxSum) {
//                sum = sum + a.remove();
//                ans++;
//            }
//        }

        return ans;

    }
}

//public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
//    // Write your code here
//    int[] arrA = a.stream().mapToInt(Integer::intValue).toArray();
//    int[] arrB = b.stream().mapToInt(Integer::intValue).toArray();
//
//    return twoStacks(maxSum, arrA, arrB, 0, 0) - 1;
//
//}
//
//private static int twoStacks(int x, int[] a, int [] b,int sum, int count){
//    if(sum > x){
//        return count;
//    }
//
//    int ans1 = count;
//    if (a.length > 0) {
//        ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
//    }
//
//    int ans2 = count;
//    if (b.length > 0) {
//        ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
//    }
//    return Math.max(ans1,ans2);
//}
