package day02;

import java.util.Arrays;

/**
 * 数组的工具嘞: Arrays,封装了一些方法，方便操作数据
 *
 */

public class Demo03 {
    public static void main(String[] args) {
        // Arrays 是类名
        int[] ids = {1001,10012,1002,10013,1004};
        System.out.println("排序前: " + Arrays.toString(ids)); //Arrays.toString将数组转换成字符串
        Arrays.sort(ids); // 数组排序
        System.out.println("排序后:"+Arrays.toString(ids));

        // 二分查找，第一个参数就是一个升序的数组
        int key;
        int index = Arrays.binarySearch(ids,1002);
        System.out.println(index);
//        int inde = Arrays.binarySearch(ids,1005); // -4 1005如果存在数组中，它的索引是3，返回的结果:-(3+1)
//        System.out.println(index);
//
//        int newLength;
//        int[] newIds = Arrays.copyOf(ids);
//        System.out.println(Arrays.toString((newIds)));

    }



}
