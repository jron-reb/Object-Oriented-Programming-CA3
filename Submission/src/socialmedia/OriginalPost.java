/**
 * Represents an original post, which extends the class Post, which is located in the social media package
 * An original post is made up of a message, author, post ID (pid), arraylist of comments and an arraylist of endorsements
 * 
 * @author Jeroen Mijer, Alexander Robertson
 * @version 1.0
 * @since 1.0
 */

package socialmedia;
import java.util.ArrayList;

public class OriginalPost extends Post {
    ArrayList <Endorsement> endorsements;
    ArrayList <Comment> comments;

    /**
     * Creates an original post
     * Sets the arraylist of comments and endorsements to empty, since an original post can only be commented on or endorsed after creation
     * @param message message of the original post
     * @param author author of the original post
     * @param pid post id of the original post
     */
    public OriginalPost(String message, Account author, Integer pid) {
        super(message, author, pid);
        this.endorsements = new ArrayList<Endorsement>();
        this.comments = new ArrayList<Comment>();

    }
    
    
    /** Gets  arraylist of endorsements
     * 
     * @return arraylist of endorsements that endorsed an original post
     */
    public ArrayList<Endorsement> getEndorsements() {
        return endorsements;
    }

    
    /** Gets arraylist of comments
     * 
     * @return arraylist of comments that commented on an original post
     */
    public ArrayList<Comment> getComments() {
        return comments;
    }

    
    /** Adds an endorsement to the arraylist of endorsements in an original post
     * 
     * @param endorsement endorsement to be added to the arraylist of endorsements of an original post
     */
    public void addEndorsement(Endorsement endorsement) {
        this.endorsements.add(endorsement);
    }

    
    /** Adds a comment to the arraylist of comments in an original post
     * 
     * @param comment comment to be added to the arraylist of comments
     */
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}