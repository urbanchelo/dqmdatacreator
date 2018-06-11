package ptv.dqm.enums;

public enum EventTypeGroupEnum {
  KEY_EVENTS("mfge1khvsolvrlkjwalcurhvl4"),
  LINEUPS("nwwvdpuxlgwspvmvfftl3q1cdq"),
  CORNERS("m0wvo7sclvpd5oiex5xzj1svjb"),
  SHOTS("u8fb3wtdobgzsceomcl33wjwgy"),
  FREEKICKS("kuv8grq2rpfuawcfarczialawu"),
  THROWINS("pvhq4xphayqunqc6vdaq8tqqxo"),
  GOALKICKS("a8fubkqme10r1xgriuwnbvqpxo"),
  ALL_EVENTS("vuuukbbtgaralllvbxcf6y47rs"),
  DASHBOARD("l0adh6wtldzkvf1fg1z7yvaxws");

  private String uuid;

  private EventTypeGroupEnum(final String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }
}
