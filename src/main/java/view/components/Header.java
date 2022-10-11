package view.components;

import module.Theme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class Header extends JMenuBar {
    void setStyle(){

    }
    public Header(){
//        setBackground();
//        setForeground(Color.WHITE);
//        add(ConnectionBtn());
    }
    private JMenu ConnectionBtn(){
        JMenu ConnectBtn=new JMenu("新建连接");
        ConnectBtn.setFont(new Font("微软雅黑",Font.PLAIN,16));
//        ConnectBtn;
        ConnectBtn.setMnemonic(KeyEvent.VK_C);

        JMenuItem mysql=new JMenuItem("mysql");
        JMenuItem es=new JMenuItem("es");
        ConnectBtn.add(mysql);
        ConnectBtn.add(es);
        return  ConnectBtn;
    }
}
