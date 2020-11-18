package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo08 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("mom");
        names.add("nom");

        names.set(0,"bom"); //修改第一个元素的值
        System.out.println(names.get(0)); // 获取列表的值

        names.add(2,"sys"); //插入元素

        System.out.println(names.size()); // 列表长度
        System.out.println(names.contains("bom")); // 是否包含某个元素
        //
        Set<String> b = new HashSet<>();
        names.add("Tom");
        names.add("Lily");

        names.remove("Tom");
        System.out.println(names.size());
        System.out.println(names.contains("Tom"));

        // map 映射




    }
}
class Sta{
    String name;
    float score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sta{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

