package Day04;

import java.util.Random;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Clice a = new Clice(5);
        System.out.println(a.toString());
        System.out.println(String.format("圆的周长是：%.2f",a.l()));
        System.out.println(String.format("圆的面积是：%.2f",a.s()));

        Cylinder b = new Cylinder(4,6);
        System.out.println(b.toString());
        System.out.println(String.format("圆柱的周长是：%.2f",b.s()));
        System.out.println(String.format("圆柱的体积是：%.2f",b.v()));
    }
}

class Clice {
    // 属性
    private float r;
    // 构造方法
    public Clice(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double l() {
        return 2 * Math.PI * r;
    }

    public double s() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "Clice{" +
                "r=" + r +
                '}';
    }
}

class Cylinder extends Clice {
    private float h;

    public Cylinder(float r) {
        super(r);
    }

    public Cylinder(float r, float h) {
        super(r);
        this.h = h;
    }
    @Override
    public double s() {
        return super.s() * 2 + super.l() * h;
    }

    public double v() {
        return super.s() * h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +
                "} " + super.toString();
    }
}