package ptv.dqm.enums;

/**
 * Error reasons enumeration.
 */
public enum ErrorReasonEnum {

  HUMAN("puik5mulihi0pbis8i1cl9r8ml"),
  WEB_SOURCE("aszyvemtxpanpv0ojkxrnwqcns"),
  TV_SOURCE("ltjkwizcjjyqornrymqmobi4ax"),
  INTERNAL_TECHNICAL("ioa3y4mwym7yvpy05gduqr4cys"),
  OFFICIAL_DECISION("mjnptnicufwraqw5tfdfcjuhbc");
  
  private String uuid;

  private ErrorReasonEnum(final String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }

}
