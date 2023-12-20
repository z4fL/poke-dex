package pokedex;

import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import view.FramePokedex;

/**
 *
 * @author ZAFL
 */
public class Pokedex {

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
      java.util.logging.Logger.getLogger(FramePokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
  }

}
