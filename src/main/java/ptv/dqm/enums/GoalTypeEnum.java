package ptv.dqm.enums;

/**
 * Representing goal values in DQM tool.
 */
public enum GoalTypeEnum {
  GOAL("d7id2xtwrcry1kadaeeeacfr9t"),
  OWN("sicg1tjpgxodoxht5xueahsjlp"),
  PENALTY("ke93skeuxknz0cb7vzrqoocsvv"),
  UNKNOWN(null);

  private final String uuid;

  GoalTypeEnum(final String uuid) {
    this.uuid = uuid;
  }

  public static GoalTypeEnum resolveByUuid(final String uuid) {
    for (final GoalTypeEnum currentGoalType : GoalTypeEnum.values()) {
      if (currentGoalType.getUuid() != null && currentGoalType.getUuid().equals(uuid)) {
        return currentGoalType;
      }
    }

    return GoalTypeEnum.UNKNOWN;
  }

  public String getUuid() {
    return uuid;
  }

}
