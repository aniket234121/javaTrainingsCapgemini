![img.png](img.png)
`Iterable Interface`
Iterable Interface is the topmost interface in java.
1. It have a **Iterator interface** which is having has a relationship
2. The Iterable interface is present in java.lang.Iterable package. 
3. It was introduced in JDK 1.5. It allows users to iterate through elements sequentially from a collection. 
4. It returns each element of the collection one after the other, beginning from the front and moving forward. 
5. There are three ways in which elements can be iterated in Java: 

 * the  for loop,
 * the forEach() method, and
 * the iterator() method. 
6. The Collection interface extends the Iterable interface thus, all the classes implementing the Collection interface are iterable.

## Traversing using Iterator
1. Enhanced for Loop(for Each).
   
    `for(DataType variable_name : CollectionName){
      //action to be performed
        }`
        
2. using iterator.

        `Iterator<Integer> iter;
        iter = stack.iterator();

        // iterating elements of the set
        while (iter.hasNext()) {
            int nextElement = iter.next();
            System.out.print(nextElement + " ");
        }`
   **if We are using iterating collection with help of advanced for loop for iteration and iterator we will get **Concurrent Modification Exception** if we modify the list.**
   * Iterator interface present inside java.util package.
   * Iterator() is method present inside Iterator interface.
   * Inside ArrayList class iterator method is overridden which returns the object of iterator type
   * some where inside collection framework we have child implementing classes of iterator interface.
   * Iterator design pattern we would use when we don't want to expose out data structures.
     * Iterator is exhaustive in nature.only once we can use.
     * Iterator cannot traverse in reverse.
   * if we want to use again we have to create new iterator these two drawbacks can be overcome by using list  iterator.
   
3. using For Loop.

   `for(DataType variable_name : CollectionName){
     //action to be performed
      }`