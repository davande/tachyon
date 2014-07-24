package tachyon.r.sorted;

import java.nio.ByteBuffer;

public class Utils {
  public static String byteArrayToString(byte[] bytes) {
    StringBuilder sb = new StringBuilder("(");
    for (int k = 0; k < bytes.length; k ++) {
      sb.append(bytes[k]).append(",");
    }
    sb.append(")");

    return sb.toString();
  }

  public static int compare(ByteBuffer a, ByteBuffer b) {
    int pa = a.position();
    int pb = b.position();

    while (pa < a.limit() && pb < b.limit()) {
      if (a.array()[pa] < b.array()[pb]) {
        return -1;
      } else if (a.array()[pa] > b.array()[pb]) {
        return 1;
      }
      pa ++;
      pb ++;
    }

    if (pa < a.limit()) {
      return 1;
    }
    if (pb < b.limit()) {
      return -1;
    }

    return 0;
  }

}
