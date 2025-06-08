# Collectors Class

Collectors is a utility class in java.util.stream that provides static methods to accumulate elements of a stream into
various results, such as collections, strings, maps, statistics, etc.

### Methods

| Method                    | Signature                                                                                         | Return Type                                | Description                                                     |
|---------------------------|---------------------------------------------------------------------------------------------------|--------------------------------------------|-----------------------------------------------------------------|
| `toList()`                | `toList()`                                                                                        | `Collector<T, ?, List<T>>`                 | Collects elements into a `List`. Preserves order.               |
| `toSet()`                 | `toSet()`                                                                                         | `Collector<T, ?, Set<T>>`                  | Collects elements into a `Set`. Removes duplicates.             |
| `toMap()`                 | `toMap(Function<? super T, ? extends K> keyMapper, Function<? super T, ? extends U> valueMapper)` | `Collector<T, ?, Map<K,U>>`                | Collects elements into a map. Fails on duplicate keys.          |
|                           | `toMap(keyMapper, valueMapper, mergeFunction)`                                                    | `Collector<T, ?, Map<K,U>>`                | Handles duplicate keys with a merge function.                   |
|                           | `toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)`                                       | `Collector<T, ?, M>`                       | Allows specifying a map type (like `LinkedHashMap`).            |
| `joining()`               | `joining()`                                                                                       | `Collector<CharSequence, ?, String>`       | Concatenates character sequences with no delimiter.             |
|                           | `joining(CharSequence delimiter)`                                                                 | `Collector<CharSequence, ?, String>`       | Concatenates with a delimiter.                                  |
|                           | `joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)`                       | `Collector<CharSequence, ?, String>`       | Concatenates with delimiter, prefix, and suffix.                |
| `groupingBy()`            | `groupingBy(Function<? super T, ? extends K>)`                                                    | `Collector<T, ?, Map<K, List<T>>>`         | Groups elements by a classifier function.                       |
|                           | `groupingBy(classifier, downstream)`                                                              | `Collector<T, ?, Map<K, D>>`               | Groups and collects using another collector.                    |
|                           | `groupingBy(classifier, supplier, downstream)`                                                    | `Collector<T, ?, M>`                       | Groups with a custom map supplier.                              |
| `partitioningBy()`        | `partitioningBy(Predicate<? super T>)`                                                            | `Collector<T, ?, Map<Boolean, List<T>>>`   | Partitions elements into two lists based on a predicate.        |
|                           | `partitioningBy(predicate, downstream)`                                                           | `Collector<T, ?, Map<Boolean, D>>`         | Partitions and collects using another collector.                |
| `counting()`              | `counting()`                                                                                      | `Collector<T, ?, Long>`                    | Counts the number of elements in the stream.                    |
| `summarizingInt()`        | `summarizingInt(ToIntFunction<? super T>)`                                                        | `Collector<T, ?, IntSummaryStatistics>`    | Collects count, sum, min, avg, and max of int values.           |
| `summarizingDouble()`     | `summarizingDouble(ToDoubleFunction<? super T>)`                                                  | `Collector<T, ?, DoubleSummaryStatistics>` | Same as above for `double`.                                     |
| `summarizingLong()`       | `summarizingLong(ToLongFunction<? super T>)`                                                      | `Collector<T, ?, LongSummaryStatistics>`   | Same as above for `long`.                                       |
| `mapping()`               | `mapping(Function<? super T, ? extends U>, Collector<? super U, A, R>)`                           | `Collector<T, A, R>`                       | Applies a function and collects using another collector.        |
| `reducing()`              | `reducing(BinaryOperator<T>)`                                                                     | `Collector<T, ?, Optional<T>>`             | Reduces elements using a binary operator.                       |
|                           | `reducing(U identity, Function<? super T, ? extends U>, BinaryOperator<U>)`                       | `Collector<T, ?, U>`                       | Maps elements and reduces them.                                 |
| `collectingAndThen()`     | `collectingAndThen(Collector<T, A, R>, Function<R, RR>)`                                          | `Collector<T, A, RR>`                      | Wraps another collector and applies a finishing transformation. |
| `filtering()` *(Java 9+)* | `filtering(Predicate<? super T>, Collector<? super T, A, R>)`                                     | `Collector<T, A, R>`                       | Filters stream elements before collecting.                      |
