package ptv.dqm.enums;

import java.io.Serializable;

public enum AssetTypeEnum implements Serializable {

  DATA("1wsadttqshdgi16sbywxkul2g0", "DATA"),
  EDITORIAL("3dv4rk6vkke1j3bmnf7jkbpz", "EDITORIAL"),
  LIVE_VIDEO("1anf3aftmeogp1xh2ohvlkc908", "LIVE_VIDEO"),
  VIDEO("rp0sk9oxibbi145toeg4atzyl", "VIDEO"),
  FAST_DATA("a72k54l2aihu17ljb2whtp5it", "FAST_DATA");

  private String uuid;
  private String name;

  private AssetTypeEnum(final String uuid, final String name) {
    this.uuid = uuid;
    this.name = name;
  }

  public String getUuid() {
    return uuid;
  }

  public String getName() {
    return name;
  }

  /**
   * Get asset type enumeration by UUID.
   *
   * @param uuid Enumeration UUID.
   * @return Asset type enumeration by UUID.
   */
  public static AssetTypeEnum getByUuid(final String uuid) {
    AssetTypeEnum assetType = null;

    for (final AssetTypeEnum type : AssetTypeEnum.values()) {
      if (type.uuid.equals(uuid)) {
        assetType = type;
        break;
      }
    }
    if (assetType == null) {
      throw new IllegalArgumentException("No asset type with UUID " + uuid + " found. ");
    }

    return assetType;
  }

}