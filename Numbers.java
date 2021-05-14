package Steam_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        int num[] = {1,2,5,16,-1,-2,0,32,3,5,8,23,4};
        List<Integer>list = new ArrayList<>();
        for (int i : num) {
            if (i > 0 && i % 2 == 0) list.add(i);
        }
        list.sort(Comparator.naturalOrder());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}