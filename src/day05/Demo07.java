package day05;
/*
写一个函数，实现将1-5位的十一进制转换成十进制
 */

public class Demo07 {
    public static void main(String[] args) {
        //边界值内的值
        System.out.println(oct2sec("-12345"));
        System.out.println(oct2sec("+10023"));
        //最小边界值
        System.out.println(oct2sec("00000"));
        System.out.println(oct2sec("-9999"));
        System.out.println(oct2sec("0"));

        // 最大边界值
        System.out.println(oct2sec("+aaaaa"));
        System.out.println(oct2sec("-aaaaa"));
        System.out.println(oct2sec("aaaaa"));
        System.out.println(oct2sec("-1"));
        //非法的十一进制
        System.out.println(oct2sec("-o235"));
        System.out.println(oct2sec("b2l+45"));
        System.out.println(oct2sec("2345c"));
        System.out.println(oct2sec("@1234"));
        System.out.println(oct2sec("3!2"));

        //长度大于5位数
        System.out.println(oct2sec("123456"));
        System.out.println(oct2sec("+123456"));
        System.out.println(oct2sec("-123456"));
        //长度为空
        System.out.println(oct2sec(null));
        System.out.println(oct2sec(" "));










    }








    public static int oct2sec(String oct) {
    try{
        if (oct.startsWith("-")||oct.startsWith("+")){
        if (oct.length() <=6){
            return Integer.parseInt(oct,11);
        } else{
            System.out.println("数据长度不合法");
            return -1;
        }


        }else{
         if (oct.length()<=5)  {
            return Integer.parseInt(oct,11);
         }else{
             System.out.println("数据长度不合法");
             return -1;
         }


        }

    }catch (Exception e){
        System.out.println("输入的数据不是一个十一进制的数: "+ e.getMessage());
        return -1;
    }



    }
}


