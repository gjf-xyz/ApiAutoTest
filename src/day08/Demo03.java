package day08;
/*
单元测试： 动态测试。
白盒测试，能看到代码逻辑的。
一般由开发来做，有一些公司是由测试来做的
Junit,Java中的单元测试框架。
 */


public class Demo03 {
    // 是否三角形
    // 判定覆盖: 条件(a + b <= c || a + c <= b || b + c <= a),每个条件true/flase至少覆盖一次
    // 条件覆盖：一个判定点包含一个或多个条件，这些条件之间都有逻辑关系 a<0,每个判定的true/flase至少覆盖一次。
    // 路径（分支）覆盖：每条可能路径都至少覆盖一次。（基于流程图，覆盖每条可能的路径）

    public static String isTriangle(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return "边长不合法";
        } else if (a + b <= c || a + c <= b || b + c <= a){
            return "不是三角形";
        } else if (a == b && b == c) {
            return "等边三角形";
        } else if (a == b || b == c || a == c) {
            return "等腰三角形";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
            return "直角三角形";
        } else {
            return "一般三角形";
        }

    }
}
