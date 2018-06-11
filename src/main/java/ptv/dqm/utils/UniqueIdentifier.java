package ptv.dqm.utils;

import java.util.UUID;

/**
 * generator of unique identifiers
 */
public final class UniqueIdentifier {
  private static final UniqueIdentifier IDENTIFIER = new UniqueIdentifier();

  private UniqueIdentifier() {
  }

  public static UniqueIdentifier getUniqueIdentifier() {
    return IDENTIFIER;
  }

  /**
   * generates unique id
   *
   * @param paramUniqueId possible unique id
   * @return unique id
   */
  public String generateUniqueId(final String paramUniqueId) {
    final String uniqueId;
    if (null != paramUniqueId && !"" .equals(paramUniqueId)) {
      uniqueId = paramUniqueId;
    } else {
      final UUID uuid = UUID.randomUUID();
      uniqueId = Long.toString(Math.abs(uuid.getMostSignificantBits()), 36) + Long.toString(Math.abs(uuid.getLeastSignificantBits()), 36);
    }

    return uniqueId;
  }

  /**
   * generates unique id
   *
   * @return
   */
  public String generateUniqueId() {
    return this.generateUniqueId(null);
  }
}