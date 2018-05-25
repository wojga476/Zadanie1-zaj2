
public class ShapeCalculator {

    double squareArea(Square square){
        double poleKwadratu = square.bokKwad * square.bokKwad;
        return poleKwadratu;

    }
    double circleArea(Circle circle){
        double poleKola = circle.promien * circle.promien * 3.14;
        return poleKola;

    }

    double trianglePerimeter(Triangle triangle){
        double poleTroj = triangle.dlugPodst * triangle.wysokosc;
        return poleTroj;

    }
    double rectPerimeter(Rectangle rectangle){
        double poleProst = rectangle.bokPros1 * rectangle.bokProst2;
        return poleProst;

    }

}
