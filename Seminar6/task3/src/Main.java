public class Main {
    public static void main(String[] args) {
        Shape3D shape1 = new Cube(3);
        Shape shape2 = new Circle(4);

        System.out.println(shape1.area());
        System.out.println(shape1.volume());
        System.out.println(shape2.area());
    }
}