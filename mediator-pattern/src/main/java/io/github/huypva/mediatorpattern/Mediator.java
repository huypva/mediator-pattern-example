package io.github.huypva.mediatorpattern;

/**
 * @author huypva
 */
public interface Mediator {

  public void addColleague(Colleague colleague);

  public void mediate(Colleague colleague);
}
