import javax.swing.*;


public class woody
{
    public static void main(String[] args)
    {
        final String input;
        input = JOptionPane.showInputDialog("n (m): ");
        final double n = Double.parseDouble(input);

        final int halves = (int)Math.floor(n * 2);
        final int fiths = (int)Math.floor((n - (double)halves / 2) * 5);

        JOptionPane.showMessageDialog( null, n + " = " + halves + "×½ + " + fiths + "×⅕ + "
                + (n - halves / 2 - fiths / 5) + 'm');
    }
}