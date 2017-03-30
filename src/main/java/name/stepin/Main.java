package name.stepin;

import name.stepin.SampleClass.UsedInnerClass;

public class Main {

  public static void main(String[] args) {
    SampleClass sampleClass = new SampleClass();
    String s = sampleClass.usedMethod();
    sampleClass.usedMethodParameters("a", "b");
    String b = sampleClass.usedMethod();
    System.out.println(b);

    UsedInnerClass usedInnerClass = new UsedInnerClass();
    usedInnerClass.mathod2();
  }
}
