package mysnode;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public class snode<E> {   
 // ---------------------------------------------------------------------------------------------------------------//
  public E element;                         // initialization
  public snode<E> next;                 
 // ---------------------------------------------------------------------------------------------------------------//
  public snode(E element, snode<E> next){
      this.element = element;               // constructor
      this.next = next;
  }
// -----------------------------------------------------------------------------------------------------------------//
    public E getElement() { // pangkuha sa first data na naa sa head; for output purpose only
        return element;
    }
      public void setElement(E element) { // in removing process. this sets the next node for the new header/
        this.element = element;
     }
    public snode<E> getNext() { // pangkuha sa data sa sunod na node, for output purpose only;
        return next;
    }
    public void setNext(snode<E> next) { // pang assign sa sunod nga set, for transfer purpose only;
        this.next = next;
    }
}
