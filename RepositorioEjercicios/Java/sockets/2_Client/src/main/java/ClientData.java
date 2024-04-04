
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;


public class ClientData implements Serializable{
    private String name;
    private String msg;
    private Date date;

    public ClientData(String name, String msg) {
        this.name = name;
        this.msg = msg;
        this.date = Calendar.getInstance().getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}