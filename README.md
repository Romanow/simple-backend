# Simple Backend

### Сборка и локальный запуск

```shell
# сборка
$ ./graldew clean build
# запуск PostgreSQL 13 в docker
$ docker compose up -d
# локальный запуск
$ ./gradlew bootRun --args='--spring.profiles.active=local'    
```