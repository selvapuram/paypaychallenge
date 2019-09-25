package com.paypay.impl;

/**
 * 
 */
public class QueueApplication {

  @SuppressWarnings("unchecked")
  public static void main(String args[]) {

    try {
      Queue<Integer> q = ImmutableQueue.of();
      q = q.enQueue(100);
      q = q.enQueue(200);
      q = q.deQueue();
      System.out.println(q.head());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
