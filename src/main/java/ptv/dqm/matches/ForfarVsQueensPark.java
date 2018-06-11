package ptv.dqm.matches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import ptv.dqm.enums.BookingTypeEnum;
import ptv.dqm.enums.ETEnum;
import ptv.dqm.enums.GoalTypeEnum;
import ptv.dqm.enums.OfficialTypeEnum;
import ptv.dqm.enums.PeriodTypeEnum;
import ptv.dqm.enums.PlayerPositionEnum;
import ptv.dqm.enums.QaStatusEnum;
import ptv.dqm.enums.SourceTypeEnum;
import ptv.dqm.enums.SummaryEnum;
import ptv.dqm.model.MatchEvent;
import ptv.dqm.utils.UniqueIdentifier;

public class ForfarVsQueensPark {
  public static final String FIX_UUID = "dwp8wdxnlbmlxf4nthahp5qi2";
  public static final String ISO_8061_TZ = "'YYYY-MM-DD\"T\"HH24:MI:SSTZH:TZM'";
  public static final String UPDATE_CREATE_TS = "TO_TIMESTAMP('2018-06-07T14:07:07.495', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')";
  public static final String REAL_TS = "TO_TIMESTAMP_TZ('2018-05-04T17:52:20+01:00'," + ISO_8061_TZ + ")";
  public static final String HOM_ID = "t353";
  public static final String AWA_ID = "t355";
  public static final Integer HOM_POS = 1;
  public static final Integer AWA_POS = 2;
  public static final String RESP_ANALYST = "scfe6fyiwvg1dwttvo4ayzb09b";
  public static final String HUMAN_ERROR = "puik5mulihi0pbis8i1cl9r8ml";


  // ----- SOURCES -----
  public static final String OPTA = SourceTypeEnum.OPTA.getSourceUuid();
  public static final String OC = SourceTypeEnum.GSM.getSourceUuid();
  public static final String RB = SourceTypeEnum.RB.getSourceUuid();

  // ----- POSITIONS -----
  public static final String GKEEPER = PlayerPositionEnum.GOALKEEPER.getUuid();
  public static final String DEF = PlayerPositionEnum.DEFENDER.getUuid();
  public static final String MID = PlayerPositionEnum.MIDFIELDER.getUuid();
  public static final String STR = PlayerPositionEnum.STRIKER.getUuid();
  public static final String SUB = PlayerPositionEnum.SUBSTITUTE.getUuid();
  public static final String COACH = PlayerPositionEnum.COACH.getUuid();

  // ----- STATUS -----
  public static final String UNCHECKED_UUID = QaStatusEnum.UNCHECKED.getUuid();

  // ----- KEY EVENTS -----
  public static final String GOAL = GoalTypeEnum.GOAL.getUuid();
  public static final String ASSIST = ETEnum.ASSIST.getUuid();
  public static final String SUB_IN = ETEnum.SUBSTITUTION_IN.getUuid();
  public static final String SUB_OUT = ETEnum.SUBSTITUTION_OUT.getUuid();
  public static final String YELLOW = BookingTypeEnum.YELLOW.getUuid();
  public static final String RED = BookingTypeEnum.RED.getUuid();

  // ----- PERIODS -----
  static List<String> period_types = Arrays.asList(PeriodTypeEnum.FIRST_HALF_START.getUuid(),
      PeriodTypeEnum.FIRST_HALF_STOP.getUuid(),
      PeriodTypeEnum.SECOND_HALF_START.getUuid(),
      PeriodTypeEnum.SECOND_HALF_STOP.getUuid());

  static List<String> off_types = Arrays
      .asList(OfficialTypeEnum.MAIN.getUuid(), OfficialTypeEnum.LINEMAN_1.getUuid(), OfficialTypeEnum.LINEMAN_2.getUuid());

  static List<String> opta_period_TS = Arrays.asList("TO_TIMESTAMP_TZ('2018-04-21T15:00:32+01:00'," + ISO_8061_TZ + ")",
      "TO_TIMESTAMP_TZ('2018-04-21T15:46:53+01:00'," + ISO_8061_TZ + ")",
      "TO_TIMESTAMP_TZ('2018-04-21T16:01:23+01:00'," + ISO_8061_TZ + ")",
      "TO_TIMESTAMP_TZ('2018-04-21T16:50:36+01:00'," + ISO_8061_TZ + ")");

  // OPTA HOME LINEUPS
  static MatchEvent opHLU1 = new MatchEvent(GKEEPER, OPTA, null, "p106270", HOM_ID, HOM_POS, 1, "Marc", "McCallum", null, null, null, null, REAL_TS);
  static MatchEvent opHLU2 = new MatchEvent(DEF, OPTA, null, "p173200", HOM_ID, HOM_POS, 4, "Andy", "Munro", null, null, null, null, REAL_TS);
  static MatchEvent opHLU3 = new MatchEvent(DEF, OPTA, null, "p103050", HOM_ID, HOM_POS, 5, "Michael", "Travis", null, null, null, null, REAL_TS);
  static MatchEvent opHLU4 = new MatchEvent(DEF, OPTA, null, "p58413", HOM_ID, HOM_POS, 2, "Jamie", "Bain", null, null, null, null, REAL_TS);
  static MatchEvent opHLU5 = new MatchEvent(DEF, OPTA, null, "p192819", HOM_ID, HOM_POS, 3, "Darren", "Whyte", null, null, null, null, REAL_TS);
  static MatchEvent opHLU6 = new MatchEvent(MID, OPTA, null, "p229311", HOM_ID, HOM_POS, 8, "Russell", "Dingwall", null, null, null, null, REAL_TS);
  static MatchEvent opHLU7 = new MatchEvent(MID, OPTA, null, "p220364", HOM_ID, HOM_POS, 6, "Murray", "MacKintosh", null, null, null, null, REAL_TS);
  static MatchEvent opHLU8 = new MatchEvent(MID, OPTA, null, "p229312", HOM_ID, HOM_POS, 7, "Ross", "Maciver", null, null, null, null, REAL_TS);
  static MatchEvent opHLU9 = new MatchEvent(MID, OPTA, null, "p111914", HOM_ID, HOM_POS, 10, "Dylan", "Easton", null, null, null, null, REAL_TS);
  static MatchEvent opHLU10 = new MatchEvent(STR, OPTA, null, "p78613", HOM_ID, HOM_POS, 9, "Dale", "Hilson", null, null, null, null, REAL_TS);
  static MatchEvent opHLU11 = new MatchEvent(STR, OPTA, null, "p193419", HOM_ID, HOM_POS, 11, "Greg", "Hurst", null, null, null, null, REAL_TS);
  static MatchEvent opHLU12 = new MatchEvent(SUB, OPTA, null, "p2368", HOM_ID, HOM_POS, 14, "Kevin", "McNaughton", null, null, null, null, REAL_TS);
  static MatchEvent opHLU13 = new MatchEvent(SUB, OPTA, null, "p192621", HOM_ID, HOM_POS, 15, "Dean", "Brotherston", null, null, null, null, REAL_TS);
  static MatchEvent opHLU14 = new MatchEvent(SUB, OPTA, null, "p441402", HOM_ID, HOM_POS, 17, "Ben", "Starkey", null, null, null, null, REAL_TS);
  static MatchEvent opHLU15 = new MatchEvent(SUB, OPTA, null, "p172210", HOM_ID, HOM_POS, 12, "Josh", "Peters", null, null, null, null, REAL_TS);
  static MatchEvent opHLU16 = new MatchEvent(SUB, OPTA, null, "p442279", HOM_ID, HOM_POS, 16, "Jack", "Allan", null, null, null, null, REAL_TS);
  static MatchEvent opHLU17 = new MatchEvent(SUB, OPTA, null, "p88603", HOM_ID, HOM_POS, 21, "Grant", "Adam", null, null, null, null, REAL_TS);
  static MatchEvent opHLU18 = new MatchEvent(COACH, OPTA, null, "man40593", HOM_ID, HOM_POS, null, "Jim", "Weir", null, null, null, null, REAL_TS);

  // OPTA AWAY LINEUPS
  static MatchEvent opALU1 = new MatchEvent(GKEEPER, OPTA, null, "p58098", AWA_ID, AWA_POS, 1, "Michael", "White", null, null, null, null, REAL_TS);
  static MatchEvent opALU2 = new MatchEvent(DEF, OPTA, null, "p113734", AWA_ID, AWA_POS, 5, "Adam", "Cummins", null, null, null, null, REAL_TS);
  static MatchEvent opALU3 = new MatchEvent(DEF, OPTA, null, "p153343", AWA_ID, AWA_POS, 2, "Ross", "Millen", null, null, null, null, REAL_TS);
  static MatchEvent opALU4 = new MatchEvent(DEF, OPTA, null, "p136362", AWA_ID, AWA_POS, 6, "Scott", "Gibson", null, null, null, null, REAL_TS);
  static MatchEvent opALU5 = new MatchEvent(DEF, OPTA, null, "p50317", AWA_ID, AWA_POS, 3, "Sean", "Burns", null, null, null, null, REAL_TS);
  static MatchEvent opALU6 = new MatchEvent(MID, OPTA, null, "p448506", AWA_ID, AWA_POS, 7, "Michael", "Ruth", null, null, null, null, REAL_TS);
  static MatchEvent opALU7 = new MatchEvent(MID, OPTA, null, "p213751", AWA_ID, AWA_POS, 11, "David", "Galt", null, null, null, null, REAL_TS);
  static MatchEvent opALU8 = new MatchEvent(MID, OPTA, null, "p153637", AWA_ID, AWA_POS, 4, "Gregor", "Fotheringham", null, null, null, null,
      REAL_TS);
  static MatchEvent opALU9 = new MatchEvent(MID, OPTA, null, "p192874", AWA_ID, AWA_POS, 10, "Luke", "Donnelly", null, null, null, null, REAL_TS);
  static MatchEvent opALU10 = new MatchEvent(MID, OPTA, null, "p143673", AWA_ID, AWA_POS, 8, "Anton", "Brady", null, null, null, null, REAL_TS);
  static MatchEvent opALU11 = new MatchEvent(STR, OPTA, null, "p248818", AWA_ID, AWA_POS, 19, "Aidan", "Keena", null, null, null, null, REAL_TS);
  static MatchEvent opALU12 = new MatchEvent(SUB, OPTA, null, "p111724", AWA_ID, AWA_POS, 18, "Conor", "McVey", null, null, null, null, REAL_TS);
  static MatchEvent opALU13 = new MatchEvent(SUB, OPTA, null, "p194202", AWA_ID, AWA_POS, 14, "Dominic", "Docherty", null, null, null, null, REAL_TS);
  static MatchEvent opALU14 = new MatchEvent(SUB, OPTA, null, "p440100", AWA_ID, AWA_POS, 15, "Lewis", "McGhee", null, null, null, null, REAL_TS);
  static MatchEvent opALU15 = new MatchEvent(SUB, OPTA, null, "p248546", AWA_ID, AWA_POS, 19, "Alistair", "Miller", null, null, null, null, REAL_TS);
  static MatchEvent opALU16 = new MatchEvent(SUB, OPTA, null, "p192648", AWA_ID, AWA_POS, 12, "Thomas", "Orr", null, null, null, null, REAL_TS);
  static MatchEvent opALU17 = new MatchEvent(SUB, OPTA, null, "p212595", AWA_ID, AWA_POS, 16, "Robbie", "Leitch", null, null, null, null, REAL_TS);
  static MatchEvent opALU18 = new MatchEvent(SUB, OPTA, null, "p199805", AWA_ID, AWA_POS, 17, "William", "Mortimer", null, null, null, null, REAL_TS);
  static MatchEvent opALU19 = new MatchEvent(COACH, OPTA, null, "man37402", AWA_ID, AWA_POS, null, "Gus", "MacPherson", null, null, null, null,
      REAL_TS);

  // OPTA OFFICIALS
  static MatchEvent off1 = new MatchEvent(off_types.get(0), OPTA, null, "o43620", null, null, null, "Craig", "Napier", null, null, null, null, REAL_TS);
  static MatchEvent off2 = new MatchEvent(off_types.get(1), OPTA, null, "o43167", null, null, null, "Anthony", "Cooper", null, null, null, null, REAL_TS);
  static MatchEvent off3 = new MatchEvent(off_types.get(2), OPTA, null, "o48384", null, null, null, "Daniel", "Graves", null, null, null, null, REAL_TS);

  // OPTA PERIODS
  static MatchEvent period1 = new MatchEvent(period_types.get(0), OPTA, null, null, null, null, null, null, null, 0, null, null, null, opta_period_TS.get(0));
  static MatchEvent period2 = new MatchEvent(period_types.get(1), OPTA, null, null, null, null, null, null, null, 47, null, null, null, opta_period_TS.get(1));
  static MatchEvent period3 = new MatchEvent(period_types.get(2), OPTA, null, null, null, null, null, null, null, 45, null, null, null, opta_period_TS.get(2));
  static MatchEvent period4 = new MatchEvent(period_types.get(3), OPTA, null, null, null, null, null, null, null, 95, null, null, null, opta_period_TS.get(3));

  // OPTA GOALS
  static MatchEvent goal1 = new MatchEvent(GOAL, OPTA, "697618361", "p229312", HOM_ID, HOM_POS, 7, "Ross", "Maciver", 13, 12, 46, 1,
      "TO_TIMESTAMP_TZ('2018-04-21T15:13:39+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent goal2 = new MatchEvent(GOAL, OPTA, "110624170", "p192874", AWA_ID, AWA_POS, 10, "Luke", "Donnelly", 68, 67, 12, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:23:46+01:00'," + ISO_8061_TZ + ")");

  static MatchEvent assist1 = new MatchEvent(ASSIST, OPTA, "110624170", "p212595", AWA_ID, AWA_POS, 16, "Robbie", "Leitch", 68, 67, 12, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:23:46+01:00'," + ISO_8061_TZ + ")");

  static MatchEvent subIn1 = new MatchEvent(SUB_IN, OPTA, "1399231837", "p172210", HOM_ID, HOM_POS, 12, "Josh", "Peters", 66, 65, 29, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:21:52+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subOut1 = new MatchEvent(SUB_OUT, OPTA, "1399231837", "p193419", HOM_ID, HOM_POS, 11, "Greg", "Hurst", 66, 65, 29, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:21:52+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subIn2 = new MatchEvent(SUB_IN, OPTA, "467250082", "p442279", HOM_ID, HOM_POS, 16, "Jack", "Allan", 88, 87, 2, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:43:25+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subOut2 = new MatchEvent(SUB_OUT, OPTA, "467250082", "p111914", HOM_ID, HOM_POS, 10, "Dylan", "Easton", 88, 87, 2, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:43:25+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subIn3 = new MatchEvent(SUB_IN, OPTA, "836912576", "p194202", AWA_ID, AWA_POS, 14, "Dominic", "Docherty", 58, 57, 30, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:13:53+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subOut3 = new MatchEvent(SUB_OUT, OPTA, "836912576", "p448506", AWA_ID, AWA_POS, 7, "Michael", "Ruth", 58, 57, 30, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:13:53+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subIn4 = new MatchEvent(SUB_IN, OPTA, "1731663184", "p212595", AWA_ID, AWA_POS, 16, "Robbie", "Leitch", 66, 65, 29, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:18:31+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subOut4 = new MatchEvent(SUB_OUT, OPTA, "1731663184", "p213751", AWA_ID, AWA_POS, 11, "David", "Galt", 66, 65, 29, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:18:31+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subIn5 = new MatchEvent(SUB_IN, OPTA, "1058492806", "p172210", AWA_ID, AWA_POS, 12, "Thomas", "Orr", 85, 84, 5, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:21:52+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent subOut5 = new MatchEvent(SUB_OUT, OPTA, "1058492806", "p193419", AWA_ID, AWA_POS, 8, "Anton", "Brady", 85, 84, 5, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:21:52+01:00'," + ISO_8061_TZ + ")");

  // OPTA BOOKINGS
  static MatchEvent yellow1 = new MatchEvent(YELLOW, OPTA, "95595081", "p106270", HOM_ID, HOM_POS, 1, "Marc", "McCallum", 46, 45, 40, 1,
      "TO_TIMESTAMP_TZ('2018-04-21T15:46:12+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent yellow2 = new MatchEvent(YELLOW, OPTA, "1660434918", "p193419", HOM_ID, HOM_POS, 11, "Greg", "Hurst", 51, 50, 18, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:06:41+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent yellow3 = new MatchEvent(YELLOW, OPTA, "2102440303", "p136362", AWA_ID, AWA_POS, 6, "Scott", "Gibson", 55, 54, 3, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:10:26+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent yellow4 = new MatchEvent(YELLOW, OPTA, "1942084890", "p194202", AWA_ID, AWA_POS, 14, "Dominic", "Docherty", 61, 60, 2, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:16:25+01:00'," + ISO_8061_TZ + ")");
  static MatchEvent red1 = new MatchEvent(RED, OPTA, "684420350", "p173200", HOM_ID, HOM_POS, 14, "Dominic", "Docherty", 82, 81, 56, 2,
      "TO_TIMESTAMP_TZ('2018-04-21T16:38:19+01:00'," + ISO_8061_TZ + ")");

  static List<MatchEvent> optaHomeLineUps = Arrays.asList(opHLU1, opHLU2, opHLU3, opHLU4, opHLU5, opHLU6, opHLU7, opHLU8, opHLU9,
      opHLU10, opHLU11, opHLU12, opHLU13, opHLU14, opHLU15, opHLU16, opHLU17, opHLU18);

  static List<MatchEvent> optaAwayLineUps = Arrays.asList(opALU1, opALU2, opALU3, opALU4, opALU5, opALU6, opALU7, opALU8, opALU9,
      opALU10, opALU11, opALU12, opALU13, opALU14, opALU15, opALU16, opALU17, opALU18, opALU19);

  static List<MatchEvent> officials = Arrays.asList(off1, off2, off3);
  static List<MatchEvent> periods = Arrays.asList(period1, period2, period3, period4);
  static List<MatchEvent> goals = Arrays.asList(goal1, goal2, assist1);
  static List<MatchEvent> subs = Arrays.asList(subIn1, subOut1, subIn2, subOut2, subIn3, subOut3, subIn4, subOut4, subIn5, subOut5);
  static List<MatchEvent> bookings = Arrays.asList(yellow1, yellow2, yellow3, yellow4, red1);

  // ----- OPTA SUMMARIES VALUES -----
  static List<String> opSummaries = Arrays
      .asList("1:1", "A", "3", "22", "22", "13", "10", "2", "2E", "1:1", "2:2", "0:0", "1:0", "0:0", "2:3", "0:0", "0:0", "0:0", "0:0");

  public static void printMatch() {
    String insert = "INSERT INTO DQM_OWNER.DQM_MATCHES(FIXTURE_UUID, QA_STATUS_UUID) VALUES ('%s', '%s');";
    printQuery(insert, FIX_UUID, UNCHECKED_UUID);
    print("COMMIT;");

    printSummaries();
    printEvents();
  }

  public static void printSummaries() {
    String insert = "INSERT INTO DQM_OWNER.MATCH_SUMMARIES(SUMMARY_ID, FIXTURE_UUID, SOURCE_UUID, EVENT_TYPE_UUID, SUMMARY_VALUE, UPDATE_TIMESTAMP) "
        + "VALUES (%s, '%s', '%s', '%s', '%s', %s);";
    List<SummaryEnum> enumList = new ArrayList<SummaryEnum>(Arrays.asList(SummaryEnum.values()));

    print("\n----- MATCH SUMMARIES OPTA -----");
    for (SummaryEnum summary : enumList) {

      printQuery(insert, "DQM_OWNER.MATCH_SUMMRS_SUMMR_ID_SEQ.NEXTVAL", FIX_UUID, OPTA, summary.getUuid(), opSummaries.get(enumList.indexOf(summary)),
          "CURRENT_TIMESTAMP");
    }
    print("COMMIT;");

    print("\n----- MATCH SUMMARIES OPTA CORE -----");
    for (SummaryEnum summary : enumList) {
      printQuery(insert, "DQM_OWNER.MATCH_SUMMRS_SUMMR_ID_SEQ.NEXTVAL", FIX_UUID, OC, summary.getUuid(), "A", "CURRENT_TIMESTAMP");
    }
    print("COMMIT;");

    print("\n----- MATCH SUMMARIES RB -----");
    for (SummaryEnum summary : enumList) {
      printQuery(insert, "DQM_OWNER.MATCH_SUMMRS_SUMMR_ID_SEQ.NEXTVAL", FIX_UUID, RB, summary.getUuid(), "A", "CURRENT_TIMESTAMP");
    }
    print("COMMIT;");

  }

  public static void printEvents() {
    String groupInsert =
        "INSERT INTO DQM_OWNER.MATCH_EVENT_GROUPS (EVENT_GROUP_UUID, FIXTURE_UUID, EVENT_TYPE_UUID, QA_STATUS_UUID, SOURCE_USED, QA_REPORT, TEAM_POSITION, QA_SCORE, ERROR_REASON_UUID, RESPONSIBILITY_UUID) "
            + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', %d, %d, '%s', '%s');";
    String eventInsert =
        "INSERT INTO DQM_OWNER.DQM_MATCH_EVENTS (EVENT_UUID, EVENT_GROUP_UUID, SOURCE_UUID, EXT_EVENT_ID, PLAYER_JERSEY, PLAYER_NAME, PERIOD, MATCH_MINUTE, MATCH_SECOND, UPDATE_TIMESTAMP, DELETED_FLAG, PLAYER_FIRST_NAME, PLAYER_LAST_NAME, EXT_TEAM_ID, EXT_PLAYER_ID, REAL_TIMESTAMP, EVENT_VALUE, MATCH_TIME, CREATE_TIMESTAMP) "
            + "VALUES ('%s', '%s', '%s', %s, %d, '%s', %d, %d, %d, %s, '%s', '%s', '%s', '%s', '%s', %s, '%s', %d, %s); \n";
    String randomUuid;

    print("\n----- LINEUPS HOME TEAM -----");
    for (MatchEvent event : optaHomeLineUps) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
    }
    print("COMMIT;");

    print("\n----- LINEUPS AWAY TEAM -----");
    for (MatchEvent event : optaAwayLineUps) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
    }
    print("COMMIT;");

    print("\n----- OFFICIALS -----");
    for (MatchEvent event : officials) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
      // OPTA CORE INSERT
      // RB INSERT
    }
    print("COMMIT;");

    print("\n----- PERIODS -----");
    for (MatchEvent event : periods) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
    }

    print("\n----- GOALS -----");
    for (MatchEvent event : goals) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
    }
    print("COMMIT;");

    print("\n----- SUBSTITUTIONS -----");
    for (MatchEvent event : subs) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
    }
    print("COMMIT;");

    print("\n----- BOOKINGS -----");
    for (MatchEvent event : bookings) {
      randomUuid = getUniqueId();
      printQuery(groupInsert, randomUuid, FIX_UUID, event.getEventTypeUuid(), UNCHECKED_UUID, null, null, event.getTeamPos(), 0, HUMAN_ERROR, RESP_ANALYST);
      printQuery(eventInsert, getUniqueId(), randomUuid, event.getSource(), null,
          event.getPlayerJersey(),
          event.getFullName(),
          null, null, null,
          UPDATE_CREATE_TS, "N",
          event.getFirstName(),
          event.getLastName(),
          event.getExtTeamId(),
          event.getExtPlayerId(),
          event.getRealTimestamp(),
          null, null,
          UPDATE_CREATE_TS);
    }
    print("COMMIT;");

  }

  public static void printQuery(String insert, Object... parameters) {
    System.out.println(String.format(Locale.ENGLISH, insert, parameters));
  }

  public static void print(String text) {
    System.out.println(text);
  }

  public static String getUniqueId() {
    return UniqueIdentifier.getUniqueIdentifier().generateUniqueId();
  }
}
