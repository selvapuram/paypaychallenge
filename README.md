# Immutable Queue In Java

Immutable Queue implementation using Immutable Stack in Java Programming Language. 

A Stack is a Last In First Out (LIFO) data
structure. It supports two basic operations called push and pop. The push
operation adds an element at the top of the stack, and the pop operation
removes an element from the top of the stack.

Example stack of integers: 1, 2, 3. If we push these integers in order, we will
get:

```sh
1
2
3
```

Invoking pop will return 1 or the last element entered.

A Queue is a First In First Out (FIFO) data structure. 
It supports two basic operations called enQueue and deQueue. 
The enQueue operation adds an element at the beginning of the queue, and the
deQueue operation removes an element from the end of the queue.

Example queue of integers: 10, 20, 30. If we queue these integers in order, we
will get:

```sh
10, 20, 30
```

Invoking deQueue will return 30 or the first element entered.

This project contains tests for queue.

To run and test:

```sh
mvn clean install
```
