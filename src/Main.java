import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Mikhaylov on 19.01.2018.
 */
public class Main {

    static List<Shape> originals = new ArrayList<>();
    static List<Shape> copies = new ArrayList<>();

    public static void main(String[] args) {

        // Прототипы
        Circle circle = new Circle();
        circle.x = 10;
        circle.x = 20;
        circle.radius = 50;
        circle.color = Shape.Color.RED;

        Rectangle rectangle = new Rectangle();
        rectangle.width = 200;
        rectangle.height = 100;
        rectangle.color = Shape.Color.BLUE;

        originals.add(circle);
        originals.add(rectangle);


        // Копии, созданные по прототипам
        // Плюс прототипа заключается в том, что можно копировать объекты "вслепую" - по типу Shape,
        // не завязываясь на конкретный тип объекта. За счет полиморфизма будет вызван метод clone того класса,
        // которым является этот объект
        for (Shape shape : originals) {
            copies.add(shape.clone());
        }

        System.out.println(copies);
        System.out.println("\n-----------------\n");

        // Копии, созданные по подготовленным прототипам, но с добавлением необходимых модификаций
        Circle modifiedCircle = (Circle) circle.clone();
        modifiedCircle.color = Shape.Color.YELLOW;
        modifiedCircle.radius = 150;

        Rectangle modifiedRectangle = (Rectangle) rectangle.clone();
        modifiedRectangle.height = 500;
        modifiedRectangle.width = 1000;

        System.out.println("New circle : " + modifiedCircle);
        System.out.println("New rectangle : " + modifiedRectangle);

    }
}
