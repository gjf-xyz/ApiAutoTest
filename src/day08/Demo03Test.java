package day08;

import static org.junit.jupiter.api.Assertions.*;

class Demo03Test {

    @org.junit.jupiter.api.Test
    void isTriangle() {
        Demo03 demo03 = new Demo03();
        // 失败的地方中断，之后的不在执行。
        assertEquals("一般三角形",Demo03.isTriangle(7,8,11));
        assertEquals("等边三角形",Demo03.isTriangle(1,1,1));
        assertEquals("直角三角形",Demo03.isTriangle(3,4,5));
        assertEquals("等腰三角形",Demo03.isTriangle(6,6,7));
        assertEquals("不是三角形",Demo03.isTriangle(6,6,13));
        assertEquals("边长不合法",Demo03.isTriangle(-1,-2,-3));
    }
}