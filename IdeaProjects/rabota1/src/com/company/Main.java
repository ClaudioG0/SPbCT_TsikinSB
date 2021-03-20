private static JFrame frame = new JFrame("Конвертёр");
private static JTextField c = new JTextField();
private static String f = "Градусы по Фаренгейту: ";
private static JLabel fhr = new JLabel(f);
public static class ActionButton implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if(isNum(c.getText()))
        { double fieldC = Double.parseDouble(c.getText());
        double fieldF = fieldC * (double) 9/5 + 32;
        String f2 = f + String.format("%.1f",fieldF);
        fhr.setText(f2); }
        else
            {
                JOptionPane.showMessageDialog(frame, "Неверный формат значений или они отсутствуют");
            }
    }
}
private static boolean isNum(String s)
        throws NumberFormatException {
    try { Double.parseDouble(s);
        return true;
    }
    catch (NumberFormatException e)
    { return false;
    }
}
public static void main(String[] args)
{
    frame.setSize(450,180);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new GridLayout(2, 2, 10, 20));
    JPanel flow = new JPanel(new FlowLayout(FlowLayout.CENTER,100, 30));
    Font font = new Font("TimesRoman", Font.BOLD, 16); JLabel cls = new JLabel("Градусы по Цельсию");
    JButton conv = new JButton("Конвертировать"); conv.addActionListener(new ActionButton());
    panel.add(c);
    panel.add(cls);
    panel.add(conv);
    panel.add(fhr);
    flow.add(panel);
    frame.add(flow);
    frame.setVisible(true);
}