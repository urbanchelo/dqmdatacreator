package ptv.dqm.generators;

public abstract class AbstractGenerator {

  public abstract void generateRow(String insert, Object... parameters);
}
