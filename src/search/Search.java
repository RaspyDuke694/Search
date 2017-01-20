
package search;

import search.windows.MainGUI;
import java.awt.Frame;
import java.sql.SQLException;

/**
 *
 * @author Vishal
 */
public class Search {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Frame w = new MainGUI();
        w.pack();
        w.setVisible(true);
    }
    
}
