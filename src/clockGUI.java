
import javax.swing.*;
import java.awt.Color;

public class clockGUI extends javax.swing.JFrame {
    int xMouse;
    int yMouse;


    public clockGUI() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

    }

    private void initComponents() {

        exit = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(1000, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setText("exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        time.setFont(new java.awt.Font("Bookman Old Style", 0, 33));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setToolTipText("");
        time.setAlignmentY(0.0F);
        time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        time.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                timeMouseDragged(evt);
            }
        });
        time.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timeMousePressed(evt);
            }
        });
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        pack();
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {

        System.exit(0);
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }

    private void timeMouseDragged(java.awt.event.MouseEvent evt) {

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    private void timeMousePressed(java.awt.event.MouseEvent evt) {

        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clockGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        Time t = new Time();


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clockGUI().setVisible(true);

            }
        });
        t.setTime();
    }

    private javax.swing.JLabel exit;
    public static javax.swing.JLabel time;

}
