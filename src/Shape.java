/**
 * Created by Anton Mikhaylov on 19.01.2018.
 * Базовый прототип - описывает операцию клонирования,
 * которую должны реализовать его наследники
 */

public abstract class Shape {

    protected int x;
    protected int y;
    protected Color color;

    public static enum Color {
        RED, YELLOW, BLUE
    }

    public Shape() {
    }

    public Shape(Shape src) {
        if (src != null) {
            this.x = src.x;
            this.y = src.y;
            this.color = src.color;
        }
    }

    public abstract Shape clone();
}
