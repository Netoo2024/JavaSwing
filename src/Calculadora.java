import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField textPrimeiroValor;
    private JTextField textSegundoValor;
    private JButton btnSomar;
    private JButton btnLimpar;
    private JTextField txtResultado;
    private JPanel panelMain;

    public Calculadora(){

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Peguei a informação da tela
                Integer primeiro = Integer.valueOf(textPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(textSegundoValor.getText());

                //Processei
                Integer soma = primeiro + segundo;

                //Mandei pra tela o resultado
                txtResultado.setText(soma.toString());
            }
        });

    }



    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
