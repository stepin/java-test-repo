package name.stepin;

import name.stepin.SampleClass.UsedInnerClass;

public class Main {

  public static int unusedPublic1 = 1;
  protected int unusedPublic2 = 2;
  static int unusedPublic3 = 3;
  int unusedPublic4 = 4;

  public static void main(String[] args) {
    SampleClass sampleClass = new SampleClass();
    String s = sampleClass.usedMethod();
    sampleClass.usedMethodParameters("a", "b");
    String b = sampleClass.usedMethod();
    System.out.println(b);

    UsedInnerClass usedInnerClass = new UsedInnerClass();
    usedInnerClass.method2();
  }
}
