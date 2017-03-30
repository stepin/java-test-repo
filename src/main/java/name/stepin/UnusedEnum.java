package name.stepin;

import java.util.UUID;

public enum UnusedEnum {
  APPLE, WATER;

  private String unusedEnum;
  private String usedEnum = UUID.randomUUID().toString();

  @Override
  public String toString() {
    return super.toString() + "; " + usedEnum;
  }

  private void unusedPrivateEnumFunction(String s) {

  }
}
