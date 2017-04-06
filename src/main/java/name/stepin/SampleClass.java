package name.stepin;

import com.fasterxml.jackson.core.JsonParser;
import java.util.function.Predicate;

/**
 * 5 unused fields, 2 unused methods.
 */
@UsedAnnotation
public class SampleClass implements UsedInterface {

  private int neverUsedNotAssigned;
  private int neverUsed = 1;
  private int assignedNotAccessed = 2;
  private int assignedNotAccessed2 = 3;
  private String used = "used";
  private String notUsedFromMethod = "notUsedFromMethod";

  public String usedMethod(Predicate<String> filter) {
    Process p = null;
    assignedNotAccessed += 1;
    assignedNotAccessed2 = 5;
    System.out.println(usedIntf);
    System.out.println(UsedAnnotation.usedAnn);

    int usedValue = 0;
    int[] unusedArray = new int[10];
    int[] usedArray = new int[10];
    for (int i = 0; i < usedArray.length; i++) {
      usedArray[i] = usedValue++;
    }

    int usedCount = 0;
    while (usedCount++ < 5) {
      System.out.print("1");
    }
    System.out.println();

    if (filter.test("one")) {
      System.out.println("two");
    }

    return used;

  }

  public String neverUsedMethod() {
    return notUsedFromMethod;
  }

  public void usedMethodParameters(int a, String b, int c, int d, int e) {
    System.out.println(++a);
    System.out.println(d++);
    System.out.println(e);
    System.out.println(c > 3);
    usedPrivateClassFunction();
  }

  private void unusedPrivateClassFunction() {

  }

  private void usedPrivateClassFunction() {
    System.out.println(1);
  }

  public class UnusedInnerClass {

    public void method() {
      System.out.print("Something");
    }

    private void method3(JsonParser jsonParser) {
      System.out.print("Something");
    }
  }

  public static class UsedInnerClass {

    public void method() {
      System.out.print("Something");
    }

    public void method2() {
      System.out.print("Something");
    }
  }
}
