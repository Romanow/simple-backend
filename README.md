# Simple Backend

[![Build project](https://github.com/Romanow/simple-backend/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/Romanow/simple-backend/actions/workflows/build.yml)

### Сборка и локальный запуск

```shell
# сборка
$ ./graldew clean build
# запуск PostgreSQL 13 в docker
$ docker compose up postgres -d
# локальный запуск
$ ./gradlew bootRun --args='--spring.profiles.active=local'    
```