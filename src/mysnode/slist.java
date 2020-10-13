/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysnode;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public class slist<E> {
    
    public snode<E> head,tail;
    public int size;                // initialization
    // ------------------------------------------------------------------------------------------------------
    public slist(){
        head = null;
        tail = null;                // constructor
    }
    //-----------------------------------------------------------------------------------------------------------
    public int size(){
        return size;                // checking the size of the node/
    }
    //----------------------------------------------------------------------------------------------------------------
    public boolean isEmpty(){
        return size() == 0;         // use for checking the node if it is empty or not
    }  
    //----------------------------------------------------------------------------------------------------------------
    public E first(){
        return head.getElement(); // use for checking the head of the node.
    } 
    //----------------------------------------------------------------------------------------------------------------
    public E last(){
        return tail.getElement();  // use for checking the tail of the node.
    } 
    //----------------------------------------------------------------------------------------------------------------
    public E removefirst() {
        
        snode<E> temp = head;
        head = head.getNext();

        if (head == null) {
            throw new EmptyListException();
        }

        temp.setNext(null);
        size--;

        return temp.getElement();
    }
    //------------------------------------------------------------------------------------------------------------------
    public void addfirst(E element){
        snode<E> newNode = new snode<>(element, null);

        if (size() == 0) {
            tail = newNode;
        }

        newNode.setNext(head);
        head = newNode;
        size++;
    }  
    //-------------------------------------------------------------------------------------------------------------------
    public void addlast(E element){
        
       snode<E> newNode = new snode<>(element, null);
       
        if (size() == 0) {
            head = newNode;
        }

        tail = newNode;
        tail.setNext(newNode);
        
        size++;
    }
    //---------------------------------------------------------------------------------------------------------------------
    public void display(){
        snode<E> temp = head;
        
        for (int i=0;i < size();i++){                       // output purposes
            System.out.print("["+temp.getElement()+"]");
            temp = temp.getNext();
        }     
        
        System.out.print("\n"+"The size of the node: "+size());
    } 
    //-------------------------------------------------------------------------------------------------------
    public void dfl(){                                      /// for checcking only nodes what the head and the tail
        System.out.print("\n"+"THE HEAD:"+first());
        System.out.print("\n"+"THE TAIL:"+last()+"\n");
        
    }
    //-------------------------------------------------------------------------------------------------------
    
   
}
