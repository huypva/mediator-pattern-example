package io.github.huypva.mediatorpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Main {

  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();

    Colleague concrete1Colleague = new Concrete1Colleague("Concrete1", mediator);
    Colleague concrete2Colleague = new Concrete2Colleague("Concrete2", mediator);

    mediator.addColleague(concrete1Colleague);
    mediator.addColleague(concrete2Colleague);

    log.info("Concrete1Colleague action");
    concrete1Colleague.action1();

    log.info("Concrete2Colleague action");
    concrete2Colleague.action1();
  }
}
