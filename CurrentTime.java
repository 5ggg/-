import java.text.SimpleDateFormat;           
import java.util.Date;  
 
public class CurrentTime{
    public static void main(String[] args){
        
        SimpleDateFormat sdf = new SimpleDateFormat();// Clear Time
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        Date date = new Date();// get current time
        System.out.println("Current Time:   " + sdf.format(date)); 
    } 
}
