/**
 * Represents a Post, which is used as the parent class of any type of Post in the social media package, which is located in the social media package
 * A Post is made up of a message, an author and a post ID (pid)
 * 
 * @author Jeroen Mijer, Alexander Robertson
 * @version 1.0
 * @since 1.0
 */
package socialmedia;
import java.io.Serializable;

public class Post implements Serializable {
    private int pid;
    private String message;
    private Account author;
    
    /**
     * Creates a Post
     * 
     * @param message message of the Post
     * @param author author of the Post
     * @param pid post id of the Post
     */
    public Post (String message, Account author, Integer pid){
        this.pid = pid;
        this.message = message; 
        this.author = author;
    }

    
    /** Gets the author of a post
     * 
     * @return `Account that created the post (author)
     */
    public Account getAuthor() {
        return author;
    }
    
    /** Gets the message of a post
     * 
     * @return message of a post
     */
    public String getMessage() {
        return message;
    }
    
    /** Gets the post id (pid) of a post
     * 
     * @return post id (pid) of a post
     */
    public int getPid() {
        return pid;
    }
}

