package lambdaAusdruecke;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.*;

public class LambdaAufgabe1 {
    /* interface Runnable    { void run(); }
interface ActionListener { void actionPerformed(ActionEvent e); }
interface Supplier<T>    { T get(); }
interface Consumer<T>    { void accept(T t); }
interface Comparator<T>  { int compare(T o1, T o2); } */
    Runnable              runnable   = () -> {};
    ActionListener        listener   = (ActionEvent e) -> {};
    Supplier<String>      supplier   = () -> {return ""; };
    Consumer<Point>       consumer   = (Point t) -> {};
    Comparator<Rectangle> comparator = (o1, o2) -> 0;

    DoubleSupplier ds = () -> {return 0.0; };
    LongToDoubleFunction ltdf = (long value) -> {return 0.0; };
    UnaryOperator<String> up = String::trim;
}
