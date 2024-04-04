package org.example.N_11_Linked_Lists.Class_2;

/**
 * @version 1.0.0
 * @author krodr
 * @Methods
 *      <ol>
 *          <li>isEmpty</li>
 *          <li>empty</li>
 *          <li>length</li>
 *          <li>hasData</li>
 *          <li>addData</li>
 *          <li>searchData</li>
 *          <li>removeData</li>
 *          <li>showData</li>
 *          <li>averageData</li>
 *          <li>amountData</li>
 *      </ol>
 */
public class LinkedList {
    Node header = null;

    /**
     *
     * @param_ none
     * @Value_of_return boolean
     * @return <pre>{@code true}</pre>
     *          <p><b>if</b></p>
     *         <pre>   <i>this Linked list is empty</i></pre>
     *         <p><b>else</b></p>
     *         <pre>{@code false}</pre>
     */
    public boolean isEmpty(){
        return true;
    }
    /**
     * @apiNote this method add new data to the linked list
     * @param data
     */
    public void addData(int data){
        if (header == null){
            header = new Node(data);
        }else{
            Node temp = new Node(data);
            temp.linked = header;
            header = temp;
        }
    }

    /**
     *
     * @param dataSearch
     * @return data to search
     */
    public Integer search(int dataSearch){
        while (header != null) {
            if (dataSearch == header.data)
                return header.data;
            header = header.linked;
        }
        return 0;
    }
    /**
     * @apiNote this method show everybody data of the linked list
     */
    public void showData(){
        Node auxiliary = header;
        while (auxiliary != null){
            System.out.print(auxiliary.data + " ");
            auxiliary = auxiliary.linked;
        }
    }

    public void removeData (int dataRemove){
        while(dataRemove != header.data){
            if (dataRemove == header.data){
                header.linked = header.linked.linked;
                break;
            }
        }
    }
    public void firstInsert(int item){
        if (header == null){
            header = new Node(item);
        }else{
            Node tem = new Node(item);
            Node varAux = header;
            while (varAux.linked != null)
                varAux = varAux.linked;
            varAux.linked = tem;
        }
    }
    public void addSort(int item){
        if (header == null){
            header = new Node(item);
        }else {
            Node temp = new Node(item);
            if (temp.data < header.data){
                temp.linked = header;
                header = temp;
            }else {
                Node saveHeader = header;
                Node saveData = header;
                while (saveHeader != null && saveHeader.data < temp.data){
                    saveData = saveHeader;
                }
                saveData.linked = temp;
                temp.linked = saveHeader;
            }
        }

    }

}
