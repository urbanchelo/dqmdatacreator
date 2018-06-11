package ptv.dqm.enums;

/**
 * Error point property enumeration.
 */
public enum ErrorPointPropertyEnum {

  PLAYER_NAME("1xjaispkcwgxrhn3zjmxobyxhs"),
  PLAYER_JERSEY("cfsdzuahpewemincawksrjeecd"),
  TEAM("dcpabvy203836qtphsw76tq5ip"),
  TIME("b7sytrpdeykg5b6kt3jnkl5gyw"),
  VALUE("1ny0f3h85yf1d8we4k2vbtr2q");
  
  private String uuid;

  private ErrorPointPropertyEnum(final String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }

}
