package ptv.dqm.enums;

/**
 * Servers for mapping coverage event types to dqm event types.
 */
public enum CoverageTypesMappingEnum {
  GOAL("1x6xz6j2klaim1a2olqaowltez", "d7id2xtwrcry1kadaeeeacfr9t"),
  OWN_GOAL("1x6xz6j2klaim1a2olqaowltez", "sicg1tjpgxodoxht5xueahsjlp"),
  PENALTY_GOAL("1x6xz6j2klaim1a2olqaowltez", "ke93skeuxknz0cb7vzrqoocsvv"),
  YELLOW_CARD("yb65b1s28s0s12htc6zdtvqt3", "66t8g96fgerweni32r62maekio"),
  RED_CARD("yb65b1s28s0s12htc6zdtvqt3", "5fqgjochl8pbgkrvpuhrvdje61"),
  YELLOW_RED_CARD("yb65b1s28s0s12htc6zdtvqt3", "l2futuj8vlt5qj16ofd96pfoke"),
  SUBS_IN("jw8ncvp9gz2f1dacmscs3m985", "4pzwrgioju34r5cuh8fqovgi7c"),
  SUBS_OUT("jw8ncvp9gz2f1dacmscs3m985", "641etn0ncuhsrmevxjvsq4wuab"),
  GOALKEEPER("16j7h3q9hkbso13usrb9ef5krb", "jjfsb6ykjopcopmydou3isc7dw"),
  DEFENDER("16j7h3q9hkbso13usrb9ef5krb", "ugxnl2cxewnqecqytoogvoonol"),
  MIDFIELDER("16j7h3q9hkbso13usrb9ef5krb", "hervqsxvioi9rfisltvrl03h6e"),
  STRIKER("16j7h3q9hkbso13usrb9ef5krb", "me91bj6ixx67dwoac8z7rcirsj"),
  SUBSTITUTE("16j7h3q9hkbso13usrb9ef5krb", "ammvhey0fjvgpmp78jb0xn7ywt"),
  COACH("16j7h3q9hkbso13usrb9ef5krb", "kcwgflljkzclsjgyyplivfh9sd"),
  CAPTAIN("16j7h3q9hkbso13usrb9ef5krb", "wt8wz3cbtvzxsm437r09knnpgb"),
  UNKNOWN(null, null);

  private String coverageTypeUuid;
  private String eventTypeUuid;

  private CoverageTypesMappingEnum(final String coverageTypeUuid, final String eventTypeUuid) {
    this.coverageTypeUuid = coverageTypeUuid;
    this.eventTypeUuid = eventTypeUuid;
  }

  public static CoverageTypesMappingEnum resolveByEventTypeUuid(final String eventTypeUuid) {
    for (final CoverageTypesMappingEnum eventType : CoverageTypesMappingEnum.values()) {
      if (eventType.getEventTypeUuid() != null && eventType.getEventTypeUuid().equals(eventTypeUuid)) {
        return eventType;
      }
    }
    return CoverageTypesMappingEnum.UNKNOWN;
  }

  public String getCoverageTypeUuid() {
    return coverageTypeUuid;
  }

  public String getEventTypeUuid() {
    return eventTypeUuid;
  }
}
