package name.stepin;

import name.stepin.SampleClass.UsedInnerClass;

public class Main {

  public static int unusedPublic1 = 1;
  protected int unusedPublic2 = 2;
  static int unusedPublic3 = 3;
  int unusedPublic4 = 4;

  private static boolean usedFilter(String s) {
    return s.length() % 2 == 0;
  }

  public static void main(String[] args) {
    SampleClass sampleClass = new SampleClass();
    String s = sampleClass.usedMethod(Main::usedFilter);
    sampleClass.usedMethodParameters(2, "b", 1, 3, 4);
    String b = sampleClass.usedMethod(Main::usedFilter);
    System.out.println(b);

    UsedInnerClass usedInnerClass = new UsedInnerClass();
    usedInnerClass.method2();
  }
}
