package controller;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class BaseComponent extends JComponent {
    Map<String, BaseComponent> componentMap=new HashMap<>();
    public void ChangeTheme(){
        componentMap.forEach((key,value)->{
            value.ChangeTheme();
            setForeground();
            setBackground();
        });

    }
}
