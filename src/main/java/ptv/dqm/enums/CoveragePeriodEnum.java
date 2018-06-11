package ptv.dqm.enums;

/**
 * Coverage period enumeration. The 4 options for the coverage period are : Pre-match, Live,
 * Post-match, Not available. Used for setting the right period for collecting/presenting data. When
 * adding new enum value, add also translation to message.property file in Toolkit.
 *
 * @author michal.kapusta
 */
public enum CoveragePeriodEnum {

  NOT_AVAILABLE(5),
  PRE_MATCH(1),
  LIVE(2),
  POST_MATCH(3);

  /**
   * Mapping ID.
   */
  private int mappingId;

  private CoveragePeriodEnum(final int id) {
    this.mappingId = id;
  }

  /**
   * Get coverage period by mapping ID.
   *
   * @param mappingId Mapping ID.
   * @return period enumeration value, otherwise null when it's unknown.
   */
  public static CoveragePeriodEnum resolveById(final int mappingId) {
    CoveragePeriodEnum type = null;
    for (final CoveragePeriodEnum period : CoveragePeriodEnum.values()) {
      if (period.mappingId == mappingId) {
        type = period;
        break;
      }
    }
    return type;
  }

  /**
   * @return the mappingId
   */
  public int getMappingId() {
    return mappingId;
  }

}
