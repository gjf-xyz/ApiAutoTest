package day05;
/*
collections 集合工具类：max、min、sort、binarySearch
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo06 {
    public static void main(String[] args) {
        List<String> ss = Arrays.asList("pig","cat","dog","bird","fish");

        String max = Collections.max(ss);
        System.out.println(max);
        System.out.println(Collections.min(ss));

        Collections.sort(ss);
        System.out.println(ss);

        Collections.shuffle(ss);
        System.out.println(ss);




    }
}
