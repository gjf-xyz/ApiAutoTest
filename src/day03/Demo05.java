package day03;

public class Demo05 {
    public static void main(String[] args) {

        Triangle s = new Triangle(4, 4, 3);
        s.isTriangle();
    }
}

// 定义三角形类
class Triangle {
    // 属性
    float a;
    float b;
    float c;

    // 构造方法重载
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //定义一个判断三角形类型的方法
    public void isTriangle() {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("边长不合法");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("不是三角形");
        } else if (a == c & b == c) {
            System.out.println("等边三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("等腰三角形");
        } else if (a * a + b * b == c * c) {
            System.out.println("直角三角形");
        }
    }

}

class TextTriangle {
    public static void main(String[] args) {
        Triangle s = new Triangle(-5, 6, 10);
        System.out.println("期望结果为:输入不合法");
        s.isTriangle();
        Triangle s1 = new Triangle(5, 6, 12);
        System.out.println("期望结果为:不是三角形");
        s1.isTriangle();
        Triangle s2 = new Triangle(7, 7, 7);
        System.out.println("期望结果为:等边三角形");
        s2.isTriangle();
        Triangle s3 = new Triangle(7, 13, 7);
        System.out.println("期望结果为: 等腰三角形");
        s3.isTriangle();
        Triangle s4 = new Triangle(3, 4, 5);
        System.out.println("期望结果为: 直角三角形");
        s4.isTriangle();


    }
}


