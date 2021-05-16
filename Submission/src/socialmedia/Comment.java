/**
 * Represents a comment, which extends the class Post, which is located in the social media package
 * An account is made up of a message, author, post ID (pid), arraylist of comments, arraylist of endorsements, a postpointer(points to parent post)
 * 
 * @author Jeroen Mijer, Alexander Robertson
 * @version 1.0
 * @since 1.0
 */
package socialmedia;
import java.util.ArrayList;

public class Comment extends Post {

    Integer postPointer; // holds the postID that the comment is replying to
    ArrayList <Endorsement> endorsements;
    ArrayList <Comment> comments;

    /**
     * Creates a comment
     * Sets the arraylist of comments and endorsements to empty, since a comment can only be commented on or endorsed after creation
     * @param message message of the comment
     * @param author author of the comment
     * @param postPointer post ID of the parent post
     * @param pid post ID of the comment
     */
    public Comment(String message, Account author, Integer postPointer, Integer pid) {
        super(message, author, pid);
        this.endorsements = new ArrayList<Endorsement>();
        this.comments = new ArrayList<Comment>();
        this.postPointer = postPointer;
    }
    
    /** Gets post pointer
     * 
     * @return post pointer of the comment
     */
    public Integer getPostPointer() {
        return postPointer;
    }
    
    
    /** Gets arraylist of endorsements
     * 
     * @return arraylist of endorsements that endorsed a comment
     */
    public ArrayList<Endorsement> getEndorsements() {
        return endorsements;
    }
    
    
    /** Gets arraylist of comments
     * 
     * @return arraylist of comments that commented on a comment
     */
    public ArrayList<Comment> getComments() {
        return comments;
    }

    
    /** Adds an endorsement to the arraylist of endorsements to a comment
     * 
     * @param endorsement endorsement to be added to the arraylist of endorsements
     */
    public void addEndorsement(Endorsement endorsement) {
        this.endorsements.add(endorsement);
    }

    
    /** Adds a comment to the arraylist of comments in a comment
     * 
     * @param comment comment to be added to the arraylist of endorsements
     */
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    
    /** Sets post pointer of the comment
     * Used only when the parent comment is deleted and the post pointer now refers to the generic deleted message
     * 
     * @param postPointer new postpointer that the comment will now contain
     */
    public void setPostPointer(Integer postPointer) {
        this.postPointer = postPointer;
    }
}
