package ptv.dqm.enums;

public enum SummaryEnum {
  SCORE("dv4e5k5pjdqecgcnptm3993ggt"),
  ATTENDANCE("2mvt9lgagauoujp1heol0mj626"),
  OFFICIALS("h019r6qhg1t6i2gnegk2bl2k3i"),
  LINEUPS("c9o1i30sjce89jc6beph9njpnd"),
  PITCH_POSITIONS("gpuu55bshisjfj76258fooc9kr"),
  BENCH("o8ird6mhctrm5olaod8qfpnp4e"),
  SHIRT_NUMBERS("9bqes039jasufslen7r9eeosca"),
  COACHES("8jauhr3l77qm98brr7hnr7puqg"),
  PERIOD("o800r4fhmichaelwqagq9glohd"),
  GOALS("jl2c9cb2van36dr3gnpruuh7o8"),
  YELLOW("66t8g96fgerweni32r62maekio"),
  YELLOW_RED("l2futuj8vlt5qj16ofd96pfoke"),
  RED("5fqgjochl8pbgkrvpuhrvdje61"),
  COACH("70ur2q9m55b85jsg9b2vk8e6g1"),
  SUBSTITUTIONS("5v2dp5o3o9dp22v0cdffeosfnl"),
  CORNERS("g87f0v9s80fno0ein8947b84fj"),
  FREE_KICKS("pdj0ac06papfu25l5t80i2ndor"),
  THROW_INS("1i4mapv0o61e9pvp0b6cl9sio1"),
  GOAL_KICKS("gkk0r6nmq6tgc3ermog3jm1lcc"),;

  private final String uuid;

  SummaryEnum(final String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }
}
