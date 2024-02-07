import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {
    JTextField nameField;
    JTextField emailField;
    JRadioButton male, female;
    JCheckBox check;

    public ContactForm(){
        super("Обьективная реальность");
        super.setBounds(500,300,350,330);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,5));

        JLabel name = new JLabel("Введите имя джуниора: ");
         nameField = new JTextField("",1);
        JLabel email = new JLabel("Введите имя уважаемого Сеньора: ");
         emailField = new JTextField("",1);

        container.add(name);
        container.add(nameField);
        container.add(email);
        container.add(emailField);

        male = new JRadioButton("Мужицкий");
        female = new JRadioButton("Женский");
        check = new JCheckBox("Хочешь леща?", false);
        JButton send_button = new JButton("Отправить");

        male.setSelected(true);
        container.add(male);
        container.add(female);
        container.add(check);
        container.add(send_button);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        send_button.addActionListener(new ButtonEventManager());
    }
        class ButtonEventManager implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();

                String isMale = "Мужской";
                if (!male.isSelected())
                    isMale = "Женский";

                boolean checkbox = check.isSelected();

                JOptionPane.showMessageDialog(null, "Ваша почта" + email +
                        "\nВаш пол: " + isMale + "\nВы согласны?" + checkbox, "Hello, "
                        + name, JOptionPane.PLAIN_MESSAGE);
            }
        }
}
