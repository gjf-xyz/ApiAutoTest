package day03;
/*
方法：
  参数： 参数可以是任意类型的，任意个。
  返回值： 任意类型的，或者void
  方法重载： 一个类有重名的方法，但是参数个数/参数类型/参数顺序不一样.调用比较简单。
 可变参数：可以是0个，1个或者多个
 */

public class Demo02 {
    public int add(int a, int b){
        System.out.println("整数的加法");
        return  a+b;
    }
    public  float add(float a, float b){
        System.out.println("float类型的加法");
        return  a+b;
    }
    public  int add(int a,int b, int c){
        System.out.println("三个整数的加法");
        return  a+b+c;
    }
    public int max(int a, int b){
        return Math.max(a, b);
    }
    public  float max(float a,float b){
        return Math.max(a, b);
    }
    public  int max (int a,int b,int c){
        int max3 = Math.max(a, b);
        return Math.max(max3, c);
    }
    public double max(int a ,float b,double c){
        float  max3 = a>b ? a:b;
        return max3>c ? max3:c;

    }

    /**
     * 可变参数: 一个方法只能有一个可变参数，如果方法有多个参数，可变参数放最后。
     *
     * @param strs
     */



    public  void print(String ... strs){
        for (String str:strs){
            System.out.println(str + ",");
        }
      }

    public static void main(String[] args) {
        //方法重载
        System.out.println("");
        System.out.println(0);
        System.out.println(0.0);
        System.out.println(true);
        //
        Demo02 d = new Demo02();
         int r1 = d.add(1,2);
        float r2 = d.add(10.0F,11.0F);
       int r3 =  d.add(1,2,3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        //
        int a = d.max(2,3);
        float b = d.max(12.3F,10.9F);
        int c = d.max(2,3,5);
        double h  = d.max(12,12.3F,4.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        d.print("1","2","3");
        d.print("hello","java");
        
        
    }

    public void add(String tom) {
    }



  
    /*
    max函数：
    1，两个整数，求最大值
    2，两个浮点数，求最大值
    3、三个整数，求最大值
    4、一个整数、一个float、一个double，返回最大值
     */





}
