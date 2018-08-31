import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"message","title",JOptionPane.INFORMATION_MESSAGE);
        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null,input,"title" , JOptionPane.INFORMATION_MESSAGE);
        int ans =  JOptionPane.showConfirmDialog(null
                ,"รักหรือเปล่า?"
                ,"ถามเธอ",JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null
            ,"รักนะจุ๊บๆ");
        }else{
            JOptionPane.showMessageDialog(null
            ,"จำไว้เลย");
        }

    }
}
