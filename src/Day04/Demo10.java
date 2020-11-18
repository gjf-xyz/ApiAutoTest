package Day04;

public class Demo10 {
    public static void main(String[] args) {
        Crile a = new Crile(3);
        System.out.println("圆的周长是： "+ String.format("%.2f" ,a.l()));
        System.out.println("圆的面积是： "+ String.format( "%.2f", a.s()));
        a.toString();

        Yz b = new Yz(3,4);
        System.out.println("圆柱的表面积是："+ String.format("%.2f", b.s()));
        System.out.println("圆柱的体积是： "+ String.format("%.2f", b.v()));
        b.toString();


    }

}
class Crile{
    private  float r;

    public Crile(float r) {
        this.r = r;
    }
    public float l(){
        return (float) (2*Math.PI*r);
    }
    public  double s(){
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "Crile{" +
                "r=" + r +
                '}';
    }
}
class Yz extends Crile{
 private float h;


    public Yz(float r,float h) {
        super(r);
        this.h = h;
    }
    public double s(){
        return  (super.s()*2*+super.l()*h);
    }
    public double v(){
        return super.s()*h;
    }

    @Override
    public String toString() {
        return "Yz{" +
                "h=" + h +
                "} " + super.toString();
    }
}
