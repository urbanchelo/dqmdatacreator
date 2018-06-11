package ptv.dqm.enums;

/**
 * Representing officials values for DQM tool.
 */
public enum OfficialTypeEnum {
  MAIN("hlw1qxaidkobague4zhtanphrx"),
  LINEMAN_1("y47fogl4xg9dissubda2sn039k"),
  LINEMAN_2("ay8t5iz872d0s7evxjrmdkru2"),
  FOURTH("qljmpejrl8mjdg53gnz4jjndor"),
  UNKNOWN(null);
  private final String uuid;

  OfficialTypeEnum(final String uuid) {
    this.uuid = uuid;
  }

  public static OfficialTypeEnum resolveByUuid(final String uuid) {
    for (final OfficialTypeEnum currentType : OfficialTypeEnum.values()) {
      if (currentType.getUuid() != null && currentType.getUuid().equals(uuid)) {
        return currentType;
      }
    }
    return OfficialTypeEnum.UNKNOWN;
  }

  public String getUuid() {
    return uuid;
  }
}