package io.github.huypva.mediatorpattern;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
@Getter
public class BaseColleague implements Colleague {

  String name;
  Mediator mediator;

  public BaseColleague(String name, Mediator mediator) {
    this.name = name;
    this.mediator = mediator;
  }


  @Override
  public void action1() {
    log.info("Colleague {} action 1", name);
    mediator.mediate(this);
  }

  @Override
  public void action2() {
    log.info("Colleague {} action 2", name);
  }
}
