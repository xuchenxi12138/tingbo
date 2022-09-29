package view.page;

import sun.applet.Main;
import view.components.Bottom;
import view.components.Header;
import view.components.MainPanel;

import javax.swing.*;
import java.awt.*;

public class BaseFrame extends JFrame {
    private Header header=new Header();
    private MainPanel mainPanel=new MainPanel();
    private Bottom bottom=new Bottom();

    public BaseFrame(){
        //设置显示窗口标题
        setTitle("大标题，就是左上角显示的标题");
        //设置窗口显示尺寸
        setSize(666,200);
        //设置窗口是否可以关闭
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个标签
//        JLabel label=new JLabel("lable就是一个文本");
//        //获取本窗口的内容窗格
//        Container c=getContentPane();
//        c.add(label);
//        //将lable标签组件添加到内容窗格上
//        add(label);

//        setTitle("TingBer");
        add(header, BorderLayout.NORTH);
        add(mainPanel,BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);
        setVisible(true);
    }
}
