package com.paypay.impl;

public class EmptyQueueException extends Exception {

  private static final long serialVersionUID = -489209382147854520L;

  public EmptyQueueException() {
    super("Empty queue!");
  }
}
