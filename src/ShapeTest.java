public class ShapeTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rect = new Rectangle(1,7);
        double poleProstokata = calculator.rectPerimeter(rect);
        System.out.println(poleProstokata);

        Triangle trial = new Triangle(3,10);
        double poleTrojkata = calculator.trianglePerimeter(trial);
        System.out.println(poleTrojkata);

        Circle circ = new Circle(3);
        double poleKola = calculator.circleArea(circ);
        System.out.println(poleKola);

        Square squa = new Square(4);
        double poleKwadratu = calculator.squareArea(squa);
        System.out.println(poleKwadratu);

    }
}
