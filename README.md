Sample app to reproduce the problem at https://github.com/flyway/flyway/issues/763

```

➜  flyway_play_test git:(master) sbt
[info] Loading project definition from /Users/diwa/code/sandbox/flyway_play_test/project
[info] Set current project to flyway_play_test (in build file:/Users/diwa/code/sandbox/flyway_play_test/)
[flyway_play_test] $ flywayUrl
[info] jdbc:h2:file:target/devbar
[flyway_play_test] $ flywayLocations
[info] List(filesystem:conf/db/migrations/main)
[flyway_play_test] $ flywayInfo
[info] Database: jdbc:h2:file:target/devbar (H2 1.3)
[info] +----------------+----------------------------+---------------------+---------+
[info] | Version        | Description                | Installed on        | State   |
[info] +----------------+----------------------------+---------------------+---------+
[info] | 1              | Create person table        |                     | Pending |
[info] +----------------+----------------------------+---------------------+---------+
[success] Total time: 1 s, completed May 25, 2014 10:24:01 PM
[flyway_play_test] $ test:flywayUrl
[info] jdbc:h2:file:target/testbar
[flyway_play_test] $ test:flywayLocations
[info] List(filesystem:conf/db/migrations/main, filesystem:conf/db/migrations/test)
[flyway_play_test] $ test:flywayInfo
[info] Database: jdbc:h2:file:target/devbar (H2 1.3)
[info] +----------------+----------------------------+---------------------+---------+
[info] | Version        | Description                | Installed on        | State   |
[info] +----------------+----------------------------+---------------------+---------+
[info] | 1              | Create person table        |                     | Pending |
[info] +----------------+----------------------------+---------------------+---------+
[success] Total time: 0 s, completed May 25, 2014 10:24:25 PM
[flyway_play_test] $ flywayMigrate
[info] Database: jdbc:h2:file:target/devbar (H2 1.3)
[info] Validated 1 migration (execution time 00:00.003s)
[info] Creating Metadata table: "PUBLIC"."schema_version"
[info] Current version of schema "PUBLIC": << Empty Schema >>
[info] Migrating schema "PUBLIC" to version 1
[info] Successfully applied 1 migration to schema "PUBLIC" (execution time 00:00.027s).
[success] Total time: 0 s, completed May 25, 2014 10:25:09 PM
[flyway_play_test] $ test:flywayMigrate
[info] Database: jdbc:h2:file:target/devbar (H2 1.3)
[info] Validated 1 migration (execution time 00:00.003s)
[info] Current version of schema "PUBLIC": 1
[info] Schema "PUBLIC" is up to date. No migration necessary.
[success] Total time: 0 s, completed May 25, 2014 10:25:15 PM
```
