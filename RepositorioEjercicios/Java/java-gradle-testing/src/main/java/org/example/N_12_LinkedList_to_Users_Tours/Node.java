package org.example.N_12_LinkedList_to_Users_Tours;

/**
 * @version 1.0.0
 * @author krodr
 * @class Node
 */
public class Node {
    public Node linked;
    public Users Data;

    /**
     *
     * @param data
     */
    Node(Users data){
        this.Data = data;
        this.linked = null;
    }
}
