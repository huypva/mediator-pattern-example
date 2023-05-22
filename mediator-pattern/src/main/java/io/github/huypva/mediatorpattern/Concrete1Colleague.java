package io.github.huypva.mediatorpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Concrete1Colleague extends BaseColleague {

  public Concrete1Colleague(String name, Mediator mediator) {
    super(name, mediator);
  }
}
