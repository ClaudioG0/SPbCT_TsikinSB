import java.awt.*;
import java.awt.event.*;


public class SinCanvas extends Canvas {

    public void paint(Graphics g) {
        int height = getHeight(),
                width = getWidth();
        // Вычисляем масштаб таким образом,
        // чтобы на компоненте всегда умещалось
        // 5 периодов
        double k=2*Math.PI*5/width;
        int sy = calcY(0, width, height, k);
        for (int i=1; i<width; i++) {
            int nsy = calcY(i, width, height, k);
            g.drawLine(i-1, sy, i, nsy);
            sy=nsy;
        }
    }

    // метод, вычисляющий значение функции
    // для отображения на экране
    private int calcY(int x, int width,
                      int height, double k) {
        double dx = (x-width/2.)*k;
        return (int)(height/2.*(1-Math.sin(dx)));
    }

    public static void main(String s[]) {
        final Frame f = new Frame("Draw");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(400, 300);

        final Canvas c = new SinCanvas();
        f.add(c);

        f.setVisible(true);
    }
}