package Classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Acer
 */
public class Func_class {
    private void displayImage(JLabel label, String imagePath) {
    try {
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(imagePath));
        Image image = imgIcon.getImage().getScaledInstance(
            label.getWidth(), 
            label.getHeight(), 
            Image.SCALE_SMOOTH
        );
        label.setIcon(new ImageIcon(image));
    } catch (Exception e) {
        System.err.println("Không thể tải hình ảnh: " + imagePath);
        e.printStackTrace();
        
        
    }
   
}
}
