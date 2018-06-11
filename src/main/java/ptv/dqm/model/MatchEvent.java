package ptv.dqm.model;

public class MatchEvent {


  private String eventTypeUuid;
  private String extEventId;
  private String extPlayerId;
  private String extTeamId;
  private String source;
  private Integer teamPos;
  private Integer playerJersey;
  private String firstName;
  private String lastName;
  private Integer time;
  private Integer min;
  private Integer sec;
  private Integer period;
  private String realTimestamp;

  public MatchEvent(String eventTypeUuid, String sourceUuid, String extEventId,String extPlayerId, String extTeamId, Integer teamPos,  Integer playerJersey, String firstName, String lastName, Integer time, Integer min, Integer sec, Integer period, String realTimestamp){
    this.eventTypeUuid = eventTypeUuid;
    this.teamPos = teamPos;
    this.source = sourceUuid;
    this.extEventId = extEventId;
    this.extPlayerId = extPlayerId;
    this.extTeamId = extTeamId;
    this.playerJersey = playerJersey;
    this.firstName = firstName;
    this.lastName = lastName;
    this.time = time;
    this.min = min;
    this.sec = sec;
    this.period = period;
    this.realTimestamp = realTimestamp;
  }

  public String getExtEventId() {
    return extEventId;
  }

  public void setExtEventId(String extEventId) {
    this.extEventId = extEventId;
  }

  public String getExtPlayerId() {
    return extPlayerId;
  }

  public void setExtPlayerId(String extPlayerId) {
    this.extPlayerId = extPlayerId;
  }

  public String getExtTeamId() {
    return extTeamId;
  }

  public void setExtTeamId(String extTeamId) {
    this.extTeamId = extTeamId;
  }

  public Integer getPlayerJersey() {
    return playerJersey;
  }

  public void setPlayerJersey(Integer playerJersey) {
    this.playerJersey = playerJersey;
  }

  public String getFullName() {
    if (getFirstName() != null && getLastName() != null){
      return getFirstName() + ' ' + getLastName();
    }
    return null;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public Integer getSec() {
    return sec;
  }

  public void setSec(Integer sec) {
    this.sec = sec;
  }

  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public String getRealTimestamp() {
    return realTimestamp;
  }

  public void setRealTimestamp(String realTimestamp) {
    this.realTimestamp = realTimestamp;
  }

  public String getEventTypeUuid() {
    return eventTypeUuid;
  }

  public void setEventTypeUuid(String eventTypeUuid) {
    this.eventTypeUuid = eventTypeUuid;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Integer getTeamPos() {
    return teamPos;
  }

  public void setTeamPos(Integer teamPos) {
    this.teamPos = teamPos;
  }
}
