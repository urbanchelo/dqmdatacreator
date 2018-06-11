package ptv.dqm.enums;

public enum MatchStatusEnum {

  PLAYED("Played", "FT"),
  PLAYING("Playing", "L"),
  SCHEDULED("Scheduled", "SCH"),
  CANCELLED("Cancelled", "C:C"),
  POSTPONED("Postponed", "P:P"),
  SUSPENDED("Suspended", "S:S"),
  ABANDONED("Abandoned", "A:A"),
  NOT_SUPPORTED("notSupported", "NS");

  private String status;
  private String code;

  private MatchStatusEnum(final String matchStatus, final String shortcut) {
    this.status = matchStatus;
    this.code = shortcut;
  }

  public String getMatchStatus() {
    return status;
  }

  public String getShortcut() {
    return code;
  }

  public static MatchStatusEnum resolveByCode(final String code) {
    for (MatchStatusEnum currentStatus : MatchStatusEnum.values()) {
      if (currentStatus.getShortcut().equals(code)) {
        return currentStatus;
      }
    }

    return NOT_SUPPORTED;
  }

  public static MatchStatusEnum resolveByStatus(final String status) {
    for (MatchStatusEnum currentStatus : MatchStatusEnum.values()) {
      if (currentStatus.getMatchStatus().equals(status)) {
        return currentStatus;
      }
    }

    return NOT_SUPPORTED;
  }

}
