import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ValidateForm
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    TextComponentFrame frame = new TextComponentFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}

 
