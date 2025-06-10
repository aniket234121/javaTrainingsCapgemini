# Queue < Interface >

The Queue Interface is a part of java.util package and extends the Collection interface. It stores and processes the
data in order means elements are inserted at the end and removed from the front.

### Queue Interface Methods

| Method Signature     | Return Type | Description                                                               | Behavior on Failure            |
|----------------------|-------------|---------------------------------------------------------------------------|--------------------------------|
| `boolean add(E e)`   | boolean     | Inserts element into the queue. Throws `IllegalStateException` if full.   | Exception if capacity exceeded |
| `boolean offer(E e)` | boolean     | Inserts element if possible. Returns false if the queue is full.          | `false` if full                |
| `E remove()`         | E           | Retrieves and removes the head. Throws `NoSuchElementException` if empty. | Exception if empty             |
| `E poll()`           | E           | Retrieves and removes the head. Returns `null` if empty.                  | `null` if empty                |
| `E element()`        | E           | Retrieves but does not remove the head. Throws `NoSuchElementException`.  | Exception if empty             |
| `E peek()`           | E           | Retrieves but does not remove the head. Returns `null` if empty.          | `null` if empty                |

**Note:- the implementing class of queue interface will have all the methods from collection interface and also these 6
methods in queue interface. i.e.**

### All the Methods that are present inside implementing classes of queue.

| Method Signature                            | Defined In | Description                                                    |
|---------------------------------------------|------------|----------------------------------------------------------------|
| `boolean add(E e)`                          | Queue      | Inserts element. Throws if queue is full.                      |
| `boolean offer(E e)`                        | Queue      | Inserts element if possible. Returns false if full.            |
| `E remove()`                                | Queue      | Removes and returns head. Throws if empty.                     |
| `E poll()`                                  | Queue      | Removes and returns head. Returns null if empty.               |
| `E element()`                               | Queue      | Peeks head. Throws if empty.                                   |
| `E peek()`                                  | Queue      | Peeks head. Returns null if empty.                             |
| `int size()`                                | Collection | Returns number of elements in the queue.                       |
| `boolean isEmpty()`                         | Collection | Checks if the queue is empty.                                  |
| `boolean contains(Object o)`                | Collection | Checks if queue contains the specified element.                |
| `Iterator<E> iterator()`                    | Collection | Returns an iterator over the elements.                         |
| `Object[] toArray()`                        | Collection | Returns array of all elements.                                 |
| `<T> T[] toArray(T[] a)`                    | Collection | Returns array of elements in specified array type.             |
| `boolean remove(Object o)`                  | Collection | Removes a single instance of specified element.                |
| `boolean containsAll(Collection<?> c)`      | Collection | Checks if queue contains all elements in specified collection. |
| `boolean addAll(Collection<? extends E> c)` | Collection | Adds all elements from specified collection.                   |
| `boolean removeAll(Collection<?> c)`        | Collection | Removes all queue elements also in specified collection.       |
| `boolean retainAll(Collection<?> c)`        | Collection | Retains only elements also in specified collection.            |
| `void clear()`                              | Collection | Removes all elements.                                          |
| `boolean equals(Object o)`                  | Collection | Compares the queue to another object.                          |
| `int hashCode()`                            | Collection | Returns hash code of the queue.                                |

## 1. Priority Queue

A PriorityQueue is a special type of queue where elements are ordered according to their natural ordering (if they
implement Comparable) or by a custom Comparator provided at queue construction.

* It is not a FIFO queue like LinkedList or ArrayDeque.

* The head of the queue is the least element based on the ordering.

* Internally implemented using a binary heap (usually a Min-Heap).

* Stored as an array and satisfies the heap property: the parent is less than or equal to the children.

* Uses a Min-Heap by default, where the smallest element has the highest priority.

* Can use a custom Comparator to define a Max-Heap or other custom ordering.

* PriorityQueue does not allow null elements. Inserting null will throw NullPointerException.

* PriorityQueue is not thread-safe. Use PriorityBlockingQueue for concurrent scenarios.

* Allows duplicate elements.

### Constructors
| Constructor Signature            | Description                     |
|----------------------------------|---------------------------------|
| `PriorityQueue()`                | Natural order, default capacity |
| `PriorityQueue(int)`             | Natural order, custom capacity  |
| `PriorityQueue(int, Comparator)` | Custom comparator and capacity  |
| `PriorityQueue(Collection)`      | Initialize from a collection    |
| `PriorityQueue(PriorityQueue)`   | Copy another priority queue     |
| `PriorityQueue(SortedSet)`       | Initialize from sorted set      |
