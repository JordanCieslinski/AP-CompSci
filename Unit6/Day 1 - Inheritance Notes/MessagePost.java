import java.util.*;

public class MessagePost extends Post {
     private String message;

     public MessagePost(String author, String text) {
          super(author);
          message = text;

     }

     public String getText() {
          return message;
     }

     public String toString() {
          return super.toString() + " sends " + message;
     }
}