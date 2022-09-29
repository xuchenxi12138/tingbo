package module;

public class Connection {
    private String host;
    private String port;
    private String database="";
    private String user="";
    private String password="";

    Connection(){
        host="localhost";
        port="3306";
        database="";
        user="";
        password="";
    }
    public void setHost(String host){
        this.host=host;
    }
    public void setPort(String port){this.port=port;}
    public void setDatabase(String database){this.database=database;}
    public void setUser(String user){this.user=user;}
    public void setPassword(String password){this.password=password;}
    public void connect(){

    }
}
