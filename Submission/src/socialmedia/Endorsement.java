/**
 * Represents an endorsement, which extends the class Post, which is located in the social media package
 * An endorsement is made up of a message, author, post ID (pid) and a postpointer(points to parent post)
 * 
 * @author Jeroen Mijer, Alexander Robertson
 * @version 1.0
 * @since 1.0
 */
package socialmedia;
public class Endorsement extends Post {

    Integer postPointer; // holds the postID that the endorsement is endorsing

    /**
     * Creates an endorsement
     * 
     * @param message message of the endorsement
     * @param author author of the endorsement
     * @param postPointer post ID of the parent post
     * @param pid post ID of the endorsement
     */
    public Endorsement(String message, Account author, Integer postPointer, Integer pid) {
        super(message, author, pid);
        this.postPointer = postPointer;

    }

    
    /** Gets the post pointer of an endorsement
     * 
     * @return post pointer of an endorsement
     */
    public Integer getPostPointer() {
        return postPointer;
    }

}
