package com.paypay.impl;

/**
 * A concrete class that represents an Immutable Stack.
 * 
 * @param <T> generic type for elements of Stack
 * @see Stack
 */
public final class ImmutableStack<T> implements Stack<T> {

  private final T value;
  private final Stack<T> tail;

  private ImmutableStack(T value, Stack<T> tail) {
    this.value = value;
    this.tail = tail;
  }

  @Override
  public final Stack<T> push(T e) {
    return new ImmutableStack<>(e, this);
  }

  @Override
  public final Stack<T> pop() {
    return tail;
  }

  @Override
  public final T head() {
    return value;
  }

  @Override
  public final boolean isEmpty() {
    return false;
  }

  @SuppressWarnings("rawtypes")
  public static final Stack of() {
    return EmptyStack.getInstance();
  }

  /**
   * A singleton class that represents an empty Stack.
   * 
   *
   * @param <T> generic type for elements of Stack
   * @see Stack
   */
  private static final class EmptyStack<T> implements Stack<T> {

    @SuppressWarnings("rawtypes")
    private static final EmptyStack instance = new EmptyStack();

    @SuppressWarnings("rawtypes")
    public static final EmptyStack getInstance() {
      return instance;
    }

    @Override
    public final Stack<T> push(T e) {
      return new ImmutableStack<>(e, this);
    }

    @Override
    public final Stack<T> pop() throws EmptyStackException {
      throw new EmptyStackException();
    }

    @Override
    public final T head() throws EmptyStackException {
      throw new EmptyStackException();
    }

    @Override
    public final boolean isEmpty() {
      return true;
    }
  }
}
