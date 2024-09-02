package GameOfTwoStacks;

import java.util.List;
import java.util.Stack;

public class GameOfTwoStacksMainAns {
    public static void main(String[] args) {
        List d = new Stack();
        List f = new Stack();
        d.add(6);
        d.add(5);
        d.add(4);
        d.add(3);
        d.add(2);
        d.add(1);

        f.add(3);
        f.add(4);
        f.add(2);

        System.out.println(d);
        System.out.println(f);

        System.out.println(twoStacks(24,d,f));
    }

    static int twoStacks(int maxSum, List<Integer> a, List<Integer> b){
        int result = 0, st1_count = 0, st2_count = 0, total_sum = 0;

        for(Integer st1_element : a){
            if(total_sum + st1_element > maxSum){
                break;
            }
            total_sum += st1_element;
            st1_count++;
        }

        result = st1_count;

        for(Integer st2_element : b){
            total_sum += st2_element;
            st2_count++;

            while (total_sum > maxSum && st1_count > 0){
                total_sum = total_sum - a.get(st1_count - 1);
                st1_count--;
            }
            result = (total_sum <= maxSum) ? Math.max(st1_count + st2_count, result) : result;
        }

        return result;

    }


}
