public class Twitter {
    public static void main(String[] args) {
        Post doug = new Post("Jaxson");
        doug.unlike();
        MessagePost tammy = new MessagePost("tam", "fax");
        tammy.unlike();
        tammy.getText();
    }
}