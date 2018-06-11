package ptv.dqm.generators;

import java.util.Locale;

public class SummaryScriptGenerator extends AbstractGenerator{

  private String insert = "INSERT INTO DQM_OWNER.MATCH_SUMMARIES ";

  public void generateRow(String insert, Object... parameters) {

    final String formattedQuery = String.format(Locale.ENGLISH, insert, parameters);

    System.out.println(formattedQuery);
  }

}
