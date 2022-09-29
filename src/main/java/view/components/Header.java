package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Header extends JMenuBar {

    public Header(){
        setBackground(Color.decode("#21252b"));
        add(newConnection());
    }
    private JMenu newConnection(){
        JMenu newConnectBtn=new JMenu("新建连接");
        newConnectBtn.setMnemonic(KeyEvent.VK_C);
        JMenuItem mysql=new JMenuItem("mysql");
        JMenuItem es=new JMenuItem("es");
        newConnectBtn.add(mysql);
        newConnectBtn.add(es);
        return  newConnectBtn;
    }
}
