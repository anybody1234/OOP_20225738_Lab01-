import javax.swing.JOptionPane;
public class Caculate {
    public static void main(String[] args) {
        String result1;
        result1 = JOptionPane.showInputDialog("Hay nhap so dau tien:");
        double num1= Double.parseDouble(result1);
        String result2;
        result2 = JOptionPane.showInputDialog("Hay nhap so thu hai:");
        double num2= Double.parseDouble(result2);
        double sum= num1+num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        if (num2 != 0) {
        double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null,"Thuong: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null,"Khong the chia");
        }
        JOptionPane.showMessageDialog(null,"Tong: " + sum);
        JOptionPane.showMessageDialog(null,"Hieu: " + difference);
        JOptionPane.showMessageDialog(null,"Tich: " + product);
        System.exit(0);
    }
}