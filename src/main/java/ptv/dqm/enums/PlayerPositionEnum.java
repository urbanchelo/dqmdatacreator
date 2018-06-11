package ptv.dqm.enums;

/**
 * Representing player position values for DQM tool.
 */
public enum PlayerPositionEnum {
  CAPTAIN("wt8wz3cbtvzxsm437r09knnpgb"),
  GOALKEEPER("jjfsb6ykjopcopmydou3isc7dw"),
  DEFENDER("ugxnl2cxewnqecqytoogvoonol"),
  MIDFIELDER("hervqsxvioi9rfisltvrl03h6e"),
  STRIKER("me91bj6ixx67dwoac8z7rcirsj"),
  SUBSTITUTE("ammvhey0fjvgpmp78jb0xn7ywt"),
  COACH("kcwgflljkzclsjgyyplivfh9sd"),
  UNKNOWN(null);


  private final String uuid;

  PlayerPositionEnum(final String uuid) {
    this.uuid = uuid;
  }

  public static PlayerPositionEnum resolveByUuid(final String uuid) {
    for (final PlayerPositionEnum currentPlayerPosition : PlayerPositionEnum.values()) {
      if (currentPlayerPosition.getUuid() != null && currentPlayerPosition.getUuid().equals(uuid)) {
        return currentPlayerPosition;
      }
    }

    return PlayerPositionEnum.UNKNOWN;
  }

  public String getUuid() {
    return uuid;
  }

}
