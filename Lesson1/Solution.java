package Lesson1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Solution {
    public static ArrayList<Integer> StrToIntArrList(String str) {
        String[] splitArray = str.split("");
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (String s : splitArray) {
            arrayList.add(Integer.parseInt(s));
        }

        return arrayList;
    }

    public int solution(int N){
        String bi = Integer.toBinaryString(N);
        ArrayList<Integer> numbers = StrToIntArrList(bi);
        Iterator<Integer> it = numbers.iterator();
        ArrayList<Integer> count_list = new ArrayList<Integer>();
        int count = 0;
        while(it.hasNext()) {
            Integer i = it.next();
            if(i == 0) {
                count++;
            }
            else if(i == 1) {
                count_list.add(count);
                count = 0;
            }
        }
        return Collections.max(count_list);
    };
}
