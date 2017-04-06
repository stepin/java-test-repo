package name.stepin;

import com.fasterxml.jackson.core.JsonParser;

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

  public String usedMethod() {
    Process p = null;
    assignedNotAccessed += 1;
    assignedNotAccessed2 = 5;
    System.out.println(usedIntf);
    System.out.println(UsedAnnotation.usedAnn);
    return used;

  }

  public String neverUsedMethod() {
    return notUsedFromMethod;
  }

  public void usedMethodParameters(String a, String b) {
    System.out.println(a);
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
