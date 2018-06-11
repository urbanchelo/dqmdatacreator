package ptv.dqm.enums;

public enum TeamPositionEnum {
  HOME(1, "Home", "HOM"),
  AWAY(2, "Away", "AWA"),
  UNKNOWN(-1, null, null);


  private final Integer position;
  private final String name;
  private final String code;

  TeamPositionEnum(final int position, final String name, final String code) {
    this.position = position;
    this.name = name;
    this.code = code;
  }

  public int getPosition() {
    return position;
  }

  public String getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  public static TeamPositionEnum resolveByPosition(final Integer position) {
    for (TeamPositionEnum currentTeamPosition : TeamPositionEnum.values()) {
      if (position != null && currentTeamPosition.getPosition() == position) {
        return currentTeamPosition;
      }
    }

    return TeamPositionEnum.UNKNOWN;
  }

  public static TeamPositionEnum resolveByName(final String name) {
    for (TeamPositionEnum currentTeamPosition : TeamPositionEnum.values()) {
      if (currentTeamPosition.getName() != null && currentTeamPosition.getName().equalsIgnoreCase(name)) {
        return currentTeamPosition;
      }
    }
    return TeamPositionEnum.UNKNOWN;
  }
}