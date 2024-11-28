import javax.swing.*;

public class MainForm {
    private JPanel MainPanel;
    private JTextField txtName;
    private JLabel lblName;
    private JButton btnValidar;
    private JLabel txtResultado;

    public static void main(String[] args) {
        //Cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela" );
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha TV no tamanho do meu painel
        frame.pack();
        //Frame.SetSize(500,500);
        //ligar a TV
        frame.setVisible(true);

    }
}
