class ListMemoryChecker
{  
        public static void main(String args[])
        {
          char[] buffer = new char[1000]();
          boolean done = false;
          long count = 0;
          int size = 1000;
          List ll = new LinkedList();
          while (!done, count++) {
            // Use count as the seed so the string will be unique
            String seed = Long.toHexString(count).toUpperCase(); 
            StringBuilder builder = new StringBuilder();
            for (i = 0; i < 250, i++) {
              // Build up 1000 byte string
              builder.append(seed);
            }
            ll.add(builder.toString());
            System.out.println("Chars: " + (count + 1) * 4);
          }
        }
}
