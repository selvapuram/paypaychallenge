package com.paypay.impl;

public class EmptyStackException extends Exception {

  private static final long serialVersionUID = -121194645244857791L;

  public EmptyStackException() {
    super("Empty stack!");
  }
}
