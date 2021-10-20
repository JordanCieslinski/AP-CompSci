package Unit1.Get_to_Know_You;

import java.util.*;

import javax.swing.*;

public class get_to_know_you
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        String name = JOptionPane.showInputDialog("Hello, I'm Jordan. What's your name?");
        JOptionPane.showMessageDialog(null,"Well it is nice to meet you, "+name+". Do you want to play a game to get to know me?");
        int age = 16;
        String favClass = "Math";
        String activity = "Video Games";
        String sport = "Baseball";
        String num = "15";
        String color = "Blue";
        String food = "Pizza";
        String superPower = "Flight";
        String fear = "Heights";
        String siblings = "3";
        int count = 0;

        //#FIRST QUESTION

        String[] options = new String[] {"16", "17", "18", "15"};
    
        int ageGuess = JOptionPane.showOptionDialog(null, "How old am I?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
        if(ageGuess == 0 )//16)
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! I am "+age);
        }
        
        //#SECOND QUESTION

        String[] options2 = new String[] {"English", "History", "Math", "Science"};
    
        int favClassGuess = JOptionPane.showOptionDialog(null, "What is my favorite Class?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options2, options2[0]);
        
        if(favClassGuess == 2) //MATH 
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My favorite class is "+favClass);
        }
        
        //#THIRD QUESTION

        String[] options3 = new String[] {"Reading", "Art", "Biking", "Video games"};
    
        int activityGuess = JOptionPane.showOptionDialog(null, "What is my favorite activity?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options3, options3[0]);
        
        if(activityGuess == 3) //Video Games
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My favorite activity is playing "+activity);
        }
        
        //#FOURTH QUESTION

        String[] options4 = new String[] {"Soccer", "Baseball", "Basketball", "Football"};
    
        int sportGuess = JOptionPane.showOptionDialog(null, "What is my favorite sport?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options4, options4[0]);
        
        if(sportGuess == 1) //Baseball
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My favorite sport is "+sport);
        }
        
        //#FIFTH QUESTION

        String[] options5 = new String[] {"7", "2", "15", "50"};
    
        int numGuess = JOptionPane.showOptionDialog(null, "What is my favorite number?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options5, options5[0]);
        
        if(numGuess == 2) //15
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My favorite number is "+num);
        }
        
        //#SIXTH QUESTION

        String[] options6 = new String[] {"Blue", "Orange", "Red", "Green"};
    
        int colorGuess = JOptionPane.showOptionDialog(null, "What is my favorite Color?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options6, options6[0]);
        
        if(colorGuess == 0) //Blue
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My favorite color is "+color);
        }
        
        //#SEVENTH QUESTION

        String[] options7 = new String[] {"Burger", "Pasta", "Steak", "Pizza"};
    
        int foodGuess = JOptionPane.showOptionDialog(null, "What is my favorite food?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options7, options7[0]);
        
        if(foodGuess == 3) //Pizza
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My favorite food is "+food);
        }
        
        //#Eighth QUESTION

        String[] options8 = new String[] {"Invisibilty", "Super Strength", "Flight", "Mind Reading"};
    
        int powerGuess = JOptionPane.showOptionDialog(null, "What superpower would I want?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options8, options8[0]);
        
        if(powerGuess == 2) //Flight
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! My ideal superpower is "+superPower);
        }
        
        //#NINTH QUESTION

        String[] options9 = new String[] {"Heights", "Spiders", "Snakes", "Claustrophobia"};
    
        int fearGuess = JOptionPane.showOptionDialog(null, "What am I most afraid of?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options9, options9[0]);
        
        if(fearGuess == 2) //Heights
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! I am most afraid of "+fear);
        }
        
        //#TENHTH QUESTION

        String[] options10 = new String[] {"1", "2", "3", "None"};
    
        int siblingsGuess = JOptionPane.showOptionDialog(null, "How many siblings do I have?", "Get to know you quiz",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options10, options10[0]);
        
        if(siblingsGuess == 2) //3
        {
        JOptionPane.showMessageDialog(null, "CORRECT!");
        count++;
        }
        else
        {
        JOptionPane.showMessageDialog(null, "INCORRECT! I have 3 siblings.");
        }
        
        JOptionPane.showMessageDialog(null, "You got "+count+" out of 10 questions correct! Thanks for playing!");
        }

       

    }


