package shape;

public class Main {
    public static void main(String[] args) {

        Shape kor = new Circle(5);
        Shape negyzet = new Square(6);
        Shape teglalap = new Rectangle(4,5);

        System.out.println(kor.area());
        System.out.println(kor.perimeter());
        System.out.println(negyzet.area());
        System.out.println(negyzet.perimeter());
        System.out.println(teglalap.area());
        System.out.println(teglalap.perimeter());




    }
}
