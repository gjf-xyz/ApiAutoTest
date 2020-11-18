package day02;

import java.util.Arrays;

/**
 * 二维数组： 可以看成一维的数组,数组中的元素时数组
 */

public class Demo04 {
    public static void main(String[] args) {
        //数组中有4个元素，每个元素是一个数组，里面有3个元素
        int[][] ids = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        // 效果同上
        int[][] ids2 = new int[4][3];
        ids2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        /*
        1 2 3
        4 5 6
        7 8 9
        10 11 12
         */
        System.out.println(ids[3][2]); //12
        System.out.println(Arrays.toString(ids[3]));

        // 遍历二维数组
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < ids[i].length; j++) {
                System.out.println(ids[i][j]);
            }
            System.out.println();

        }
    // 新建一个二维数组，里面存储3个人的信息，每个人包含: 姓名、年龄、身高、体重
        String[][]  ids3 = {{"张三","22","160","50"},{"李四","23","165","60"},{"王老五","24","170","45"}};
        System.out.println(ids3[2][1]);

        for (String[] strings : ids3){
            for (String string : strings){
                System.out.print(string + ",");
            }
            System.out.println();
        }

    }



}
