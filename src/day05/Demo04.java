package day05;
/*
集合：set
1.不能有相同的元素,无序的
2.Set是Interface，HashSet、TreeSet是典型的实现类
3.HashSet 按Hash算法来存储元素。TreeSet是按照树来存出元素
 */

import java.util.HashSet;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Lily");
        names.add("Tom"); // 不能添加重复元素

        // 删除元素 remove
        // 不能修改元素，没有set方法，没有get方法
        //大小 size
        // 包含 contains
        //遍历 for
        //遍历 foreach

        names.remove("Tom");
        System.out.println(names.size());
        System.out.println(names.contains("Tom"));





    }
}
