/** 
 * http://matt.might.net/articles/discrete-math-and-code/
 * purely functional, sorted (but unbalanced) search tree in Java
 */

interface Ordered <T> {
  public boolean isLessThan(T that) ;
}

abstract class SortedSet<T extends Ordered<T>> {
  public abstract boolean isEmpty() ;
  public abstract boolean contains(T element) ;
  public abstract SortedSet<T> add(T element) ;

  public static final <E extends Ordered<E>> SortedSet<E> empty() {
    return new EmptySet<E>();
  }
}

final class EmptySet<T extends Ordered<T>> extends SortedSet<T> {
  public boolean isEmpty() {
    return true ;
  }

  public boolean contains(T element) {
    return false ;
  }

  public SortedSet<T> add(T element) {
    return new Node<T>(this,element,this) ;
  }

  public EmptySet() {
  }
}

final class Node<T extends Ordered<T>> extends SortedSet<T> {

  private final SortedSet<T> left ;
  private final T element ;
  private final SortedSet<T> right ;

  public boolean isEmpty() {
    return false ;
  }

  public Node(SortedSet<T> left, T element, SortedSet<T> right) {
    this.left = left ;
    this.right = right ;
    this.element = element ;
  }

  public boolean contains(T needle) {
    if (needle.isLessThan(this.element)) {
      return this.left.contains(needle) ;
    } else if (this.element.isLessThan(needle)) {
      return this.right.contains(needle) ;
    } else {
      return true ;
    }
  }

  public SortedSet<T> add(T newGuy) {
    if (newGuy.isLessThan(this.element)) {
      return new Node<T>(left.add(newGuy),this.element,right) ;
    } else if (this.element.isLessThan(newGuy)) {
      return new Node<T>(left,this.element,right.add(newGuy)) ;
    } else {
      return this ; // Already in set.
    }
  }
}

