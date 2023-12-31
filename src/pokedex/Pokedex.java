package pokedex;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import view.FramePokedex;

/**
 *
 * @author ZAFL
 */
public class Pokedex {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(new FlatIntelliJLaf());
      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
          new FramePokedex().setVisible(true);
        }
      });
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      System.err.println("error in Main Class: " + ex.getMessage());
    }
  }

}
