package riddle_home_work;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(int counter) throws HeadlessException {
        JButton button = new JButton("click to print counter");
        AtomicReference<Integer> num = new AtomicReference<>(counter);
        button.addActionListener(e -> {
            System.out.println(num);
            num.getAndSet(num.get() + 1);
            //todo counter++ should work, but it will never work in java.
            //todo you need to make some work around
        });

        getContentPane().add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame(5);
       // new ColorFrame(73);
    }
}
