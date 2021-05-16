/**
 * Represents an account, located in the social media package
 * An account is made up of a user ID (uid), a handle a description field and a list of all posts it has made.
 * 
 * @author Jeroen Mijer, Alexander Robertson
 * @version 1.0
 * @since 1.0
 */
package socialmedia;

import java.util.ArrayList;
import java.io.Serializable;


public class Account implements Serializable {
    private Integer uid;
    private String handle;
    private String descField;
    private ArrayList<Post> posts;

    /**
     * Creates an account
     * Sets the arraylist of posts to empty, since an account can only make posts after it has been created
     * 
     * @param handle code of the account
     * @param descField description field of the account
     * @param uid user ID of the account
     */
    public Account(String handle, String descField, Integer uid) {
        this.uid = uid;
        this.handle = handle;
        this.descField = descField;
        this.posts = new ArrayList<Post>();
    }

    
    /**
     * Gets account description field
     * 
     * @return description field of the account
     */
    public String getDescField() {
        return descField;
    }

    
    /** Gets user id
     * 
     * @return User ID of the account
     */
    public Integer getUID() {
        return uid;
    }

    
    /** Gets account handle
     * 
     * @return Handle of the account
     */
    public String getHandle() {
        return handle;
    }

    
    /** Gets arraylist of posts account has made
     * 
     * @return Arraylist of posts account has made
     */
    public ArrayList<Post> getPosts() {
        return posts;
    }

    
    /** Sets description field of account
     * 
     * @param descField new description field of the account
     */
    public void setDescField(String descField) {
        this.descField = descField;
    }

    
    /** Sets handle of the account
     * 
     * @param handle new handle of the account
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }

    
    /** Adds post to arraylist of posts contained within account
     * 
     * @param post Post being appended to the arraylist
     */
    public void addPost(Post post) {
        this.posts.add(post);
    }

    
    /** Removes original post from arraylist of posts contained within account
     * 
     * @param post (OriginalPost) Post being removed from Arraylist
     */
    public void removePost(OriginalPost post) {
        this.posts.remove(post);
    }
    
    /** Removes comment from arraylist of posts contained within account
     * 
     * @param post (Comment) Post being removed from Arraylist
     */
    public void removePost(Comment post) {
        this.posts.remove(post);
    }
    
    /** Removes endorsement from arraylist of posts contained within account
     * 
     * @param post (Endorsement)Post being removed from Arraylist
     */
    public void removePost(Endorsement post) {
        this.posts.remove(post);
    }
}
