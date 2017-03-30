package name.stepin;

/**
 * 5 unused fields, 2 unused methods.
 */
@UsedAnnotation
public class SampleClass {

  private int neverUsedNotAssigned;
  private int neverUsed = 1;
  private int assignedNotAccessed = 2;
  private int assignedNotAccessed2 = 3;
  private String used = "used";
  private String notUsedFromMethod = "notUsedFromMethod";

  public String usedMethod() {
    assignedNotAccessed += 1;
    assignedNotAccessed2 = 5;
    return used;

  }

  public String neverUsedMethod() {
    return notUsedFromMethod;
  }

  public void usedMethodParameters(String a, String b) {
    System.out.println(a);
  }

  public class UnusedInnerClass {

    public void mathod() {
      System.out.print("Something");
    }
  }

  public static class UsedInnerClass {

    public void mathod() {
      System.out.print("Something");
    }

    public void mathod2() {
      System.out.print("Something");
    }
  }
}
