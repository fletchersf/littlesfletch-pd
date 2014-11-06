package org.littlesfletch;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;

class ListMemoryChecker
{  
  public static void main(String args[]) {
    fillList();
  }

  public static void fillList() {
    long count = 0;
    try {
      boolean done = false;
      List ll = new LinkedList();
      while (!done) {
        // Use count as the seed so the string will be unique
        String hexChar = Long.toHexString(count).toUpperCase();
        ll.add(StringUtils.rightPad(hexChar, 1000, hexChar));
        count++;
      }
    }
    catch (Throwable e) {
      System.out.println("Caught throwable: " + e.getMessage());
    }
    finally {
      System.out.println("Chars: " + (count + 1) * 1000);
    }
  }
}
