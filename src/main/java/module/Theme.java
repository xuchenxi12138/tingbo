package module;

import java.awt.*;

public class Theme {
    public enum style{light,dark,spring};
    private Color foreground=Color.decode("#afb1b3");
    private Color backgroundColor=Color.decode("#21252b");
    private Color borderColor=Color.decode("#323844");
    private Font font=new Font("微软雅黑",Font.PLAIN,16);
    public Color getBackgroundColor(){
        return this.backgroundColor;
    }
    public Color getBorderColor(){return this.borderColor;}
    public Color getForeground(){return this.foreground;}
    void setForeground(String color){
        this.foreground=Color.decode(color);
    }
    void setBorderColor(String color){
        this.borderColor=Color.decode(color);
    }
    void setBackgroundColor(String color){
        this.backgroundColor=Color.decode(color);
    }
    public void setStyle(String style){
        switch (style){
            case "light":
                setBackgroundColor("#f2f2f2");
                setForeground("#080808");
                setBorderColor("#080808");
                break;
            case "dark":
                setBackgroundColor("#21252b");
                setForeground("#afb1b3");
                setBorderColor("#afb1b3");
        }
    }

}
