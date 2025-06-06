# Stream API

Stream was introduced in Java 8.

the Stream API is used to process collections of objects. A stream in Java is a sequence of objects that supports
various methods that can be pipelined to produce the desired result.

Use of Stream in Java.

* Stream API is a way to express and process collections of objects.
* Enable us to perform operations like filtering, mapping, reducing, and sorting.

<H6>Feature</h6>

* Not Modify the original list.


* **Each intermediate operation is lazily executed and returns a stream as a result, hence, various intermediate
  operations can be pipelined. Terminal operations mark the end of the stream and return the result.**

### Different Operations On Streams

There are two types of Operations in Streams:

**1. Intermediate Operations**
<p>These are the operations(methods) which will return you a stream.</p>

**2. Terminal Operations**
<p>These operations(methods) can return void or anything.</p>

![img.png](img.png)

* Example....

  `list.stream().filter((element)->{
  System.out.println(element);
  return element%2==0;

  });`

This way it doesn't execute because filter() is an intermediate operN (returns stream) so it will not execute.

**Methods in stream**

### Intermediate Stream Operations
| Method                                                               | Return Type | Description                                                      |
|----------------------------------------------------------------------|-------------|------------------------------------------------------------------|
| `map(Function<? super T, ? extends R> mapper)`                       | `Stream<R>` | Transforms each element using a function.                        |
| `filter(Predicate<? super T> predicate)`                             | `Stream<T>` | Filters elements based on a predicate.                           |
| `sorted()`                                                           | `Stream<T>` | Sorts the elements of the stream.                                |
| `flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)` | `Stream<R>` | Flattens nested collections into a single stream.                |
| `distinct()`                                                         | `Stream<T>` | Removes duplicate elements.                                      |
| `peek(Consumer<? super T> action)`                                   | `Stream<T>` | Performs an action on each element without modifying the stream. |
| `limit(long maxSize)`                                                | `Stream<T>` | Limits the stream to the first N elements.                       |
| `skip(long n)`                                                       | `Stream<T>` | Skips the first N elements.                                      |

### Terminal Stream Operations
| Method                                               | Return Type                        | Description                                                        |
|------------------------------------------------------|------------------------------------|--------------------------------------------------------------------|
| `collect(Collector<? super T, A, R> collector)`      | `Collector Result (e.g., List<T>)` | Collects the stream elements into a collection.                    |
| `forEach(Consumer<? super T> action)`                | `void`                             | Performs an action for each element.                               |
| `reduce(BinaryOperator<T> accumulator)`              | `Optional<T>` or `T`               | Reduces stream elements to a single value.                         |
| `count()`                                            | `long`                             | Returns the count of elements.                                     |
| `findFirst()`                                        | `Optional<T>`                      | Returns the first element, if present.                             |
| `findAny()`                                          | `Optional<T>`                      | Returns any one element (especially useful with parallel streams). |
| `allMatch(Predicate<? super T> predicate)`           | `boolean`                          | Checks if all elements match a condition.                          |
| `anyMatch(Predicate<? super T> predicate)`           | `boolean`                          | Checks if any element matches a condition.                         |
| `noneMatch(Predicate<? super T> predicate)`          | `boolean`                          | Checks if no elements match a condition.                           |
| `toArray()` or `toArray(IntFunction<A[]> generator)` | `Object[]` or `T[]`                | Converts the stream to an array.                                   |
| `iterator()`                                         | `Iterator<T>`                      | Returns an iterator over the elements in the stream.               |
| `toList()`                                           | `List<T>` (Java 16+)               | Collects elements into an immutable list.                          |

## Ways to create Streams

There are many ways to create a stream instance of different sources. Once created, the instance will not modify its
source, therefore allowing the creation of multiple instances from a single source.

1. **Empty Stream**

```
Stream<String> streamEmpty = Stream.empty();
```

2. **From Collections**

````
Collection<String> collection = Arrays.asList("a", "b", "c");
Stream<String> streamOfCollection = collection.stream();
````

3. **From Arrays**

````
String[] arr = new String[]{"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
````

4. **Stream.generate()**

    The generate() method accepts a Supplier<T> for element generation. As the resulting stream is infinite, 
    the developer should specify the desired size, or the generate() method will work until it reaches the memory limit:
````
Stream<String> streamGenerated =
Stream.generate(() -> "element").limit(10);
````
5. **From String**
```
IntStream streamOfChars = "abc".chars();
```

6. **From range**


    IntStream stream= IntStream.range(1,11);

7. **From values**


    Stream<String> st=Stream.of("abc","sdfa","asdf");
8. **From File** (I/O or new I/O)