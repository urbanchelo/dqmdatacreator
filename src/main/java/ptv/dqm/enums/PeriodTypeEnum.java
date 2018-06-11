package ptv.dqm.enums;

/**
 * Representing period values in DQM tool.
 */
public enum PeriodTypeEnum {

  PRE_MATCH("F", null, "y90scatxmar642uy53xnspj5q3"),
  FIRST_HALF_START("1S", 1, "3626vdbvzv1hbfszce5z23biar"),
  FIRST_HALF_STOP("1E", 1, "5726gxgberkzyfp49kp1i1enve"),
  SECOND_HALF_START("2S", 2, "3taocm0d4gnzplaloozh5u1men"),
  SECOND_HALF_STOP("2E", 2, "80bodv7e17b6tzg6exorkrbio9"),
  FIRST_HALF_EXTRA_START("3S", 3, "o20k8glz5c4xomt7n6wtn6rosv"),
  FIRST_HALF_EXTRA_STOP("3E", 3, "go5xtl7vs6ll23ijo94cw8tfup"),
  SECOND_HALF_EXTRA_START("4S", 4, "7nq1qy2mpl4fin6nj58qevurpw"),
  SECOND_HALF_EXTRA_STOP("4E", 4, "2fkwqx96ii6xxejr7iat7puzzh"),
  PENALTY_SHOOTOUT_START("5S", 5, "l3em2iyo1cwm1ap6br7ezlf0pw"),
  PENALTY_SHOOTOUT_STOP("5E", 5, "22ph44u2rcfao9yh54hezq0iq8"),

  UNKNOWN(null, null, null);

  private String code;
  private Integer number;
  private String uuid;

  PeriodTypeEnum(final String code, final Integer number, final String uuid) {
    this.code = code;
    this.number = number;
    this.uuid = uuid;
  }

  public static PeriodTypeEnum resolveByCode(final String code) {
    for (final PeriodTypeEnum currentEnum : PeriodTypeEnum.values()) {
      if (currentEnum.getCode() != null && currentEnum.getCode().equals(code)) {
        return currentEnum;
      }
    }

    return PeriodTypeEnum.UNKNOWN;
  }

  public static PeriodTypeEnum resolveByUuid(final String uuid) {
    for (final PeriodTypeEnum currentEnum : PeriodTypeEnum.values()) {
      if (currentEnum.getUuid() != null && currentEnum.getUuid().equals(uuid)) {
        return currentEnum;
      }
    }

    return PeriodTypeEnum.UNKNOWN;
  }

  public String getCode() {
    return code;
  }

  public Integer getNumber() {
    return number;
  }

  public String getUuid() {
    return uuid;
  }
}
