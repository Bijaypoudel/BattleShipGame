import javax.swing.*;

public class StartBattle {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("img/ship.png");

        Game battleShip = new Game(10, 10, 5);

        JOptionPane.showMessageDialog(null, "This program will demonstrate" + "\n the radom initialization of a "
                + "\n battle ship game board with" + "\n a single shop of " + battleShip.getShips() + " unit length \n"
                + "\n All the user does in click buttons to either  " + "\n see another board or exit the program");

        String[] options = { "Stop Already!", "Show Another Map" };

        int choice = 1;

        do {
            choice = JOptionPane.showOptionDialog(null, battleShip.createFinalBoard(), "Attack!!!", 1, 1, icon,
                    options, options[1]);
        } while (choice == 1);
        JOptionPane.showMessageDialog(null, "Time to rest");
    }
}