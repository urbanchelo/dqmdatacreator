package ptv.dqm.enums;

/**
 * Representing shortcuts of sources.
 */
public enum SourceTypeEnum {
  MFL,
  RB("RB", "v7pvv1p2oiu333nv66ggalqorp"),
  OPTA("OPTA", "av7pvv1p2oiu333nv66ggkrqio"),
  GSM("GSM", "ku1pnl1u2fz7dwafkrejqkflro"), // opta core
  UNKNOWN(null, null);


  private String sourceUuid;
  private String prefix;

  private SourceTypeEnum(final String prefix, final String sourceUuid) {
    this.sourceUuid = sourceUuid;
    this.prefix = prefix;
  }

  private SourceTypeEnum() {
  }

  public static SourceTypeEnum resolveByUuid(final String uuid) {
    for (final SourceTypeEnum source : SourceTypeEnum.values()) {
      if (source.getSourceUuid() != null && source.getSourceUuid().equals(uuid)) {
        return source;
      }
    }

    return SourceTypeEnum.UNKNOWN;
  }

  public String getSourceUuid() {
    return sourceUuid;
  }

  public String getPrefix() {
    return prefix;
  }
}
