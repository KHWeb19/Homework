import java.awt.*;
import java.awt.event.*;

public class Jv_8_4 extends Frame  implements ActionListener {
    Panel p;
    Button b1, b2;
    private FileDialog fdia;
    private Frame f;

    public Jv_8_4() {
        f = new Frame();
        p = new Panel();
        add(p, "South");
        b1 = new Button("����(file) ��ȭ���� ���� ��ư");
        b2 = new Button("���� ��ư");
        p.add(b1);
        p.add(b2);
        add(p);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            fdia = new FileDialog(f, "���� ��ȭ â�� �� ���� ȯ���մϴ�", FileDialog.LOAD);
            fdia.setVisible(true);
            b1.requestFocus();
        }

        if (e.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Jv_8_4 win = new Jv_8_4();
        win.setTitle("File Dialog sample");
        win.setSize(500,300);
        win.setVisible(true);
    }
}