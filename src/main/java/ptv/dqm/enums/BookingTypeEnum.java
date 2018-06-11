package ptv.dqm.enums;

/**
 * Representing booking values for DQM tool.
 */
public enum BookingTypeEnum {
  YELLOW("66t8g96fgerweni32r62maekio"),
  YELLOW_RED("l2futuj8vlt5qj16ofd96pfoke"),
  RED("5fqgjochl8pbgkrvpuhrvdje61"),
  COACH("70ur2q9m55b85jsg9b2vk8e6g1"),
  UNKNOWN(null);

  private final String uuid;

  BookingTypeEnum(final String uuid) {
    this.uuid = uuid;
  }

  public static BookingTypeEnum resolveByUuid(final String uuid) {
    for (final BookingTypeEnum currentBookingType : BookingTypeEnum.values()) {
      if (currentBookingType.getUuid() != null && currentBookingType.getUuid().equals(uuid)) {
        return currentBookingType;
      }
    }

    return BookingTypeEnum.UNKNOWN;
  }

  public String getUuid() {
    return uuid;
  }
}
