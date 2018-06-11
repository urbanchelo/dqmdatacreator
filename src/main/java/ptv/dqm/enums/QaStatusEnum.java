package ptv.dqm.enums;

public enum QaStatusEnum {
  // MATCH STATUSES
  CLEAN("zsbghmkqb2uctfwc7fsxlakroc"),
  IN_PROGRESS("speoshaampm7q3th4oaskriqob"),
  CLOSED_WITH_ERRORS("nykp001tgh83lrdgw8nzzntqke"),
  CLOSED_WITH_LATE_UPDATES("ag1ifi82vpqjfj97g0mnozjr3f"),
  CLOSED_WITH_ERRORS_AND_LATE_UPDATES("ebj5x67f9h7sf4ygxa8ccj4j1g"),

  // EVENT STATUSES
  CHECKED("a4siloqlpqc0s8w0iwifdsakjh"),
  DELETED("zozduylzbkw7yqfd0ni9zckjai"),
  ERROR("z0s4b8nrkdavidlgyx0yqeasoj"),
  LIVE_LATE_UPDATE("whl0edel8sucks7ot63ccawe2k"),
  POST_MATCH_UPDATE("mp1vbc080ing29zdlln7xca44l"),
  MISSED_INTERVAL("ebsvhh9f4dartsjn1p90dia4um"),

  // MATCH AND EVENT STATUSES
  UNCHECKED("e2vb58vcoysn263yhrqukriqoa"),
  PENDING_ERRORS("xhwglbc3ncxqzfxvd5h4alqitd"),

  // OTHER
  UNKNOWN(null);

  private final String uuid;

  QaStatusEnum(final String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }

  public static QaStatusEnum resolveByUuid(final String uuid) {
    for (QaStatusEnum currentQaStatus : QaStatusEnum.values()) {
      if (currentQaStatus.getUuid() != null && currentQaStatus.getUuid().equals(uuid)) {
        return currentQaStatus;
      }
    }

    return QaStatusEnum.UNKNOWN;
  }

}
