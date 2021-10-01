public class Magpie
{
    /**
     * @return a simple response to get a conversation going, (i.e. "Top of the morning lad, do you want to have a conversation?")
     */
    public String getGreeting()
    {
        return "Hello! Do you want to have a chat?";
    }

    /**
     * Gives a response to a user statement, the response should meet the following 3 conditions:
     * 1) If the statement contains "no" the response should be "Why so negative".
     * 2) If the statement contains "mother", "brother", "sister", "father" the response should be "Tell me more about your family"
     * 3) If the statement doesn't meet conditions 1 and 2 the response calls the getRandomResponse() method to obtain a random response.
     * 
     * @param statement: the user entered statement
     * 
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {

        

        String state = statement.toLowerCase();

        for(int i = 0; i < statement.length();i++)
        {
            if(statement.length() < 2)
            {
                System.out.println("Please say something");

            }
            else if(findKeyword(state, "i want to") != -1)
            {
                return transformIWantToStatement(statement); 
            }
            else if(findKeyword(state, "no") != -1)
            {
                return "Why so negative?"; 
            }
            else if(findKeyword(state, "father") != -1 || findKeyword(state, "mother") != -1 || findKeyword(state, "brother") != -1 ||findKeyword(state, "sister") != -1)
            {
                return "Tell me more about your family";
            }
            else if(findKeyword(state, "math") != -1)
            {
                return "So, are you taking a math course?";
            }
            else if(findKeyword(state, "hit") != -1)
            {
                return "I don't like violence. Let's change the subject";
            }
            else if(findKeyword(state, "wuest") != -1)
            {
                return "I hear he is one swell guy";
            }
            else if(findKeyword(state, "pizza") != -1)
            {
                return "I've never had pizza before. I've never eaten anything.";
            }
            else if(findKeyword(state, "baseball") != -1)
            {
                return "I like baseball! GO YANKEES!";
            }
                
            }
            return getRandomResponse();
    }

    /**
     * Creates a random response (i.e. "Interesting, tell me more" or "Hmmmmm...")
     * Must contain at least 4 random responses to choose from
     * @return a String
     */
    public String getRandomResponse()
    {
        String [] randoms = {"Cool, tell me more","Hmmmm","I'm a little confused with what you said","I'm a chat bot"};
        return randoms[(int)(4*Math.random())];
    }

    /**
     * Search for one word in phrase. The search is not case sensitive.
     * This method will check that the given goal is not a substring of a
     * longer string (so, for example, "I know" does not contain "no").
     *
     * @param statement the string to search
     *
     * @param goal the string to search for
     *
     * @return the index of the first occurrence of goal in
     * statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal)
    {
        int pos = statement.indexOf(goal); 
        int length = goal.length(); 

        if(statement.length() < length)
            return -1;
        else if(statement.equals(goal))
        {
            return pos;
        }
        else if(pos == 0)
        {
                if(statement.charAt(pos+length) == ' ')
                    return pos;

                return -1;
        }
        else if(statement.indexOf(goal) == statement.length() - length)
        {
            if(statement.charAt(pos-1) == ' ')
                return pos;
            return -1;
        }
            return -1;
            
        

    }
    /**
    * Take a statement with "I want to <something>." and transform it into
    * "What would it mean to <something>?"
    *
    * @param statement the user statement, assumed to contain "I want to"
    *
    * @return the transformed statement
    */
    public String transformIWantToStatement(String statement)
    {
        int endPos = statement.indexOf("i want to") + "i want to".length();
        return "What does it mean to "+statement.substring(endPos + 2) + "?";
    }

}
