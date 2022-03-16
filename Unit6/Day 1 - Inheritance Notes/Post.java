
import java.util.*;

public class Post {
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String author) {
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();
    }

    public Post() {
        username = "Bob Smith";
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();
    }

    public void unlike() {
        if (likes > 0)
            likes--;
    }

    public void addComment(String text) {
        comments.add(text);
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String timeString(long time) {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;
        long seconds = pastMillis / 1000;
        long minutes = seconds / 60;
        if (minutes > 0)
            return minutes + " minutes ago";
        return seconds + " seconds ago";
    }

    public String toString() {
        return "The user's name is " + username;
    }
}
