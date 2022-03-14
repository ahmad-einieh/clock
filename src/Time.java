
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Time {
    SimpleDateFormat timeFormat;
    String packegTime;


    public void setTime() {
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        int count = -1;
        while (true) {
            packegTime = timeFormat.format(Calendar.getInstance().getTime());
            clockGUI.time.setText(packegTime);
            Color[] colors = {Color.red, Color.black, Color.blue, Color.green, Color.yellow, Color.cyan, Color.orange, Color.pink};


            if (count >= colors.length - 1) {
                count = 0;
            } else {
                count++;
            }
            clockGUI.time.setForeground(colors[count]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(clockGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }


}
