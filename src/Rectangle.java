/**
 * Created by Anton Mikhaylov on 19.01.2018.
 * Конкретный прототип
 */

public class Rectangle extends Shape {

    protected int width;
    protected int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle src) {
        super(src);
        if (src != null) {
            this.width = src.width;
            this.height = src.height;
        }
    }


    /**
     Метод клонирования создаёт новый объект и передаёт в его конструктор для копирования
     собственный объект. Этим мы пытаемся получить атомарность операции клонирования.
     В данной реализации, пока не выполнится конструктор, нового объекта ещё не существует.
     Но как только конструктор завершён, мы получаем полностью готовый объект-клон, а не пустой объект,
     который нужно ещё заполнить.
     */
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
