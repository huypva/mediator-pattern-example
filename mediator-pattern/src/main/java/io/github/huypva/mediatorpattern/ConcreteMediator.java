package io.github.huypva.mediatorpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class ConcreteMediator implements Mediator {
  private List<Colleague> colleagueMap = new ArrayList<>();

  @Override
  public void addColleague(Colleague colleague) {
    colleagueMap.add(colleague);
  }

  @Override
  public void mediate(Colleague colleague) {
    colleagueMap.stream()
        .filter(inst -> inst != colleague)
        .forEach(inst -> inst.action2());
  }
}
