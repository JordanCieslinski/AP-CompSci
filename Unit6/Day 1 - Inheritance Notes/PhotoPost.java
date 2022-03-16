import java.util.*;

public class PhotoPost extends Post{
     private String filename;
     private String caption;

     public PhotoPost(String author, String fn, String cap) {
          super(author); // This calls the constructor from the Post class. It MUST be done first
          filename = fn;
          caption = cap;
     }
     public PhotoPost(String fn, String cap){
          //super(); This is what is automatically done by java. there just needs to be a default constructor in Post
          filename = fn;
          caption = cap;
     }

     public String getImageFile() {
          return filename;
     }

}
