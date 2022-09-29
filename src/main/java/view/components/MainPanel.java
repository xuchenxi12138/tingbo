package view.components;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private ASidePanel aSidePanel=new ASidePanel();
    private QueryPanel queryPanel=new QueryPanel();
    public MainPanel(){
        add(aSidePanel, BorderLayout.WEST);
        add(queryPanel,BorderLayout.EAST);
    }
}
