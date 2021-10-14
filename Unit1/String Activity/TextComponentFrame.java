import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TextComponentFrame extends JFrame
{
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 300;
    public TextComponentFrame()
    {
        setTitle("Subscription Form");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        final JTextField personName = new JTextField();
        final JTextField emailField = new JTextField();
        final JTextField zipCode = new JTextField();
        final JTextField birthDate = new JTextField();
        final JTextField phone= new JTextField();
        final JPasswordField passwordField = new JPasswordField();

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(6, 6)); //dimensons of layout
        northPanel.add(new JLabel("Name :  ", SwingConstants.RIGHT));
        northPanel.add(personName);

        northPanel.add(new JLabel("Password :  ", SwingConstants.RIGHT));
        northPanel.add(passwordField);

        northPanel.add(new JLabel("Email : ", SwingConstants.RIGHT));
        northPanel.add(emailField);
        northPanel.add(new JLabel("Zip Code : ", SwingConstants.RIGHT));
        northPanel.add(zipCode);
        northPanel.add(new JLabel("Year of Birth: ", SwingConstants.RIGHT));
        northPanel.add(birthDate);
        northPanel.add(new JLabel("Phone Number: ", SwingConstants.RIGHT));
        northPanel.add(phone);
        phone.setText("XXX-XXX-XXXX");       

        add(northPanel, BorderLayout.NORTH);

        final JTextArea textArea = new JTextArea(8, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();

        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton);
        insertButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    char[] cPssword  = passwordField.getPassword();

                    //*********************  Here is where the action is performed!!!!************************              
                    String candidateName = personName.getText() ;
                    String candidateEmail = emailField.getText();
                    String candidateZipCode = zipCode.getText();
                    String candidateBirthdate = birthDate.getText();
                    String candidatePhone = phone.getText(); 
                    String candidatePassword = new String(cPssword);

                    //#Below this comment is where you will call your methods once they have been created.
                    //# YOU MUST CREATE YOUR METHODS FIRST BEFORE YOU TEST THEM HERE!!!
                    checkName(candidateName);
                    checkEmail(candidateEmail);
                    checkZip(candidateZipCode);
                    checkYear(candidateBirthdate);
                    checkPhone(candidatePhone);
                    checkPassword(candidatePassword);
                    //#This method below allows text to appear in the GUI.
                    textArea.append("Invalid Password");

                }
            });
        add(southPanel, BorderLayout.SOUTH);
    }
    //Create all 6 methods first before testing them above
    public static boolean checkName(String str)
    {
        if(str.length() < 2)
        {
            return false;
        }
        else
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(!Character.isLetter(str.charAt(i)))
                    return false;
            }
            return true;
        }
    }

    public static boolean checkPassword(String str)
    {
        int countLow = 0;
        int countUp= 0;
        int countNum = 0;
        if(str.length() < 4)
        {
            return false;
        }
        else
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(!Character.isLetterOrDigit((str.charAt(i))))
                    return false;
                else if(Character.isDigit((str.charAt(i))))

                    countNum++;

                else if(Character.isLowerCase((str.charAt(i))))
                    countLow++;

                else if(Character.isUpperCase((str.charAt(i))))
                    countUp++;

            }
        }
        if(countNum > 0 && countUp > 0 && countLow > 0) 
            return true;
        else
            return false;
    }

    public static boolean checkEmail(String str)
    {
        int locOfAtSign = str.indexOf("@");
        int locOfDot = str.indexOf(".");

        if(locOfAtSign == -1 || locOfDot == -1)
            return false;

        if(locOfDot < locOfAtSign)
        {
            return false;
        }
        else
            return true;
    }

    public static boolean checkZip(String str)
    {
        if(str.length() != 5)
            return false;
        else
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(!Character.isDigit(str.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    public static  boolean checkYear(String str)
    {
        int birthYr = Integer.valueOf(str);
        int age = 2021 - birthYr;
        
        if(age > 100 || age < 5)
            return false;
        
        return true;
    }
    
    public static boolean checkPhone(String str)
    {
        int firstDash = str.indexOf("-");
        int lastDash = str.lastIndexOf("-");
        if(firstDash == -1 || lastDash == -1)
            return false;
        String numStr = str.substring(0,firstDash)+str.substring(firstDash+1,lastDash)+str.substring(lastDash+1);
        if(str.length() != 12)
            return false;    
        for(int i = 0; i < numStr.length(); i++)
            {
                if(!Character.isDigit(numStr.charAt(i)))
                    return false;
            }
        
        if(firstDash != 3)
            return false;
        else if(lastDash != 7)
            return false;
        return true;
    }
}