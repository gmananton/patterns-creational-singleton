/**
 * Created by Anton Mikhaylov on 19.01.2018.
 */
public class Circle extends Shape {

    protected int radius;

    public Circle() {
    }

    public Circle(Circle src) {
        super(src);
        if (src != null) {
            this.radius = src.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
