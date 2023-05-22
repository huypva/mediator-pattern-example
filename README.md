The example project on Mediator Pattern

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── mediator-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./mediator-pattern/target/mediator-pattern-0.0.1-SNAPSHOT.jar
16:47:45.515 [main] INFO io.github.huypva.mediatorpattern.Main -- Concrete1Colleague action
16:47:45.517 [main] INFO io.github.huypva.mediatorpattern.BaseColleague -- Colleague Concrete1 action 1
16:47:45.518 [main] INFO io.github.huypva.mediatorpattern.BaseColleague -- Colleague Concrete2 action 2
16:47:45.518 [main] INFO io.github.huypva.mediatorpattern.Main -- Concrete2Colleague action
16:47:45.518 [main] INFO io.github.huypva.mediatorpattern.BaseColleague -- Colleague Concrete2 action 1
16:47:45.518 [main] INFO io.github.huypva.mediatorpattern.BaseColleague -- Colleague Concrete1 action 2
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://en.wikipedia.org/wiki/Mediator_pattern
- https://refactoring.guru/design-patterns/mediator