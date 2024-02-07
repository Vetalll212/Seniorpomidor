import com.programmer.ILights;

import javax.swing.*;
import java.awt.*;
// new string
public class Car extends Transport implements ILights {

    private boolean isOn;
    public Car(float speed, int weight, String color, byte[] coordinate) {

        super(speed, weight, color, coordinate); //new
    }
    public Engine engine = new Engine();
    @Override
    public void moveObject(float speed) {
        System.out.println("Наш обьект двигается со скоростью: " + speed);
    }
    public Car(){}

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    @Override
    public void seLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }

    public static class ContactForm extends JFrame {
        public ContactForm(){
            super("Контактная форма");
            super.setBounds(200, 100, 250,100);
            super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = super.getContentPane();
            container.setLayout(new GridLayout(3,2,2,2));
        }
    }
}