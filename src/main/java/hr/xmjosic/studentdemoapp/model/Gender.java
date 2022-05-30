package hr.xmjosic.studentdemoapp.model;

import java.util.Arrays;

public enum Gender {
  MALE,
  FEMALE,
  UNKNOWN;

  public static Gender fromCode(String value) {
    return Arrays.stream(Gender.values())
        .filter(gender -> gender.toString().equalsIgnoreCase(value))
        .findFirst()
        .orElse(UNKNOWN);
  }
}
