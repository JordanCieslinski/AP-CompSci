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

        if(state.indexOf("no") != -1)
            return "Why so negative?";
        else if(state.indexOf("father") != -1 || state.indexOf("mother") != -1 || state.indexOf("brother") != -1 ||state.indexOf("sister") != -1)
        {
            return "Tell me more about your family";
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
        return randoms[(int)Math.random()];
    }
}
