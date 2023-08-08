public class Expressions {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.calculateArea();
        circle.showInfo();
    }
}

class Circle {
    double radius;
    double area;

    public static void main(String[] args) {

    }

    public void setRadius(double radius){
        this.radius = radius;
        System.out.println("Радиус круга: " + radius);
    }

    public void calculateArea(){
        area = Math.PI * radius * radius;
    }

    public void showInfo(){
        System.out.println("Площадь круга: " + area);
    }
}
