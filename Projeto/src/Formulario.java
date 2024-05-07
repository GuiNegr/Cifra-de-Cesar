import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ListSelectionListener, ItemListener, ActionListener {

    JButton decoding, codding;
    JTextField textArea, resp;

    public Formulario() {
        setTitle("CIFRA DE CEZAR");
        setSize(720, 400);
        getContentPane().setBackground(new Color(145, 32, 241));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new GridLayout(2, 2));
        textArea = text();
        resp = text();
        codding = botao("CODAR");
        codding.addActionListener(e -> {
            if (e.getSource() == codding) {
                Decoding novo = new Decoding();
                resp.setText(novo.instCod(textArea.getText()));
                textArea.setText(" ");
            }
        });
        decoding = botao("DECODAR");
        decoding.addActionListener(e -> {
            if (e.getSource() == decoding) {
                Decoding novo = new Decoding();
                textArea.setText(novo.isdecodding(resp.getText()));
                resp.setText(" ");
            }
        });
        setVisible(true);
    }

    public JButton botao(String text) {
        JButton jB = new JButton();
        jB.setText(text);
        jB.setBackground(new Color(0));
        jB.setForeground(new Color(255, 255, 255));
        add(jB);
        return jB;
    }

    public JTextField text() {
        JTextField jt = new JTextField();
        jt.setForeground(new Color(80, 33, 133));
        jt.setFont(new Font("Impact ", Font.BOLD, 42));
        add(jt);
        return jt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
