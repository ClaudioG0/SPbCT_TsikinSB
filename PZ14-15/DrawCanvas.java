import java.awt.*;
import java.awt.event.*;


public class DrawCanvas extends Canvas {
    private int lastX, lastY;
    private int ex, ey;
    private boolean clear=false;

    public DrawCanvas () {
        super();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });


        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                ex=e.getX();
                ey=e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }

//    public void paint(Graphics g) {
//        g.drawLine(0, 0, getWidth(), getHeight());
//        g.drawLine(0, getHeight(), getWidth(), 0);
//    }


//    public void paint(Graphics g) {
//        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
//        g.drawOval(0, 0, getWidth()-1, getHeight()-1);
//    }


    public void paint(Graphics g) {
        Font font = new Font("Lucida Console", Font.BOLD, 44);
        g.setFont(font);
        g.drawString("somebody once told me...", 20, 50);
        g.drawLine(20, 50, 115, 50);

    }

//    public void paint(Graphics g) {
//        for (int i=0; i<4; i++) {
//            for (int j=0; j<4; j++) {
//                int c = (int)((i+j)*255/6);
//                g.setColor(new Color(c, c, c));
//                g.fillRect(i*getWidth()/4, j*getHeight()/4, getWidth()/4, getHeight()/4);
//            }
//        }
//    }

//    public void paint(Graphics g) {
//        Color c = new Color(
//                (int)(Math.random()*255),
//                (int)(Math.random()*255),
//                (int)(Math.random()*255));
//        g.setColor(c);
//        //g.setClip(null);
//        g.fillRect(0, 0, getWidth(), getHeight());
//    }


    public static void main(String s[]) {
        final Frame f = new Frame("Draw");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setSize(400, 300);

        final Canvas c = new DrawCanvas();
        f.add(c);

        f.setVisible(true);


    }
}