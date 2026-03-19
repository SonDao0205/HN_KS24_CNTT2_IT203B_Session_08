package demo.Singleton;

public class FactoryMethod {
    public static Shape create(String type) throws Exception {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "triangle" -> new Triangle();
            default -> throw new Exception(("Lỗi"));
        };

    }

    public static void main(String[] args) throws Exception {
        Shape shape = FactoryMethod.create("circle");
        System.out.println(shape.draw());
        
    }
}

interface Shape {
    boolean draw();
}

class Circle implements Shape {
    @Override
    public boolean draw() {
        System.out.println("Circle::draw()");
        return false;
    }
}

class Triangle implements Shape {
    @Override
    public boolean draw() {
        System.out.println("Triangle::draw()");
        return false;
    }
}


