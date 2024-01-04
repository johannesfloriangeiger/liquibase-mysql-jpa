Liquibase with MySQL and JPA
=

Checkout the code, run MySQL in Docker via

```
docker run \
    -e MYSQL_ROOT_PASSWORD=password \
    -e MYSQL_DATABASE=test \
    -e MYSQL_USER=user \
    -e MYSQL_PASSWORD=password \
    -p 3306:3306 \
    mysql
```

followed by the Liquibase migration

```
mvn liquibase:update
```

to verify that the Liquibase migration successfully created the table with the correct entry, run the unit test that
uses JPA

```
mvn clean test
```

or the manual check using the MySQL command line client

```
mysql --host=localhost \
    --port=3306 \
    --user=user \
    --password=password \
    --protocol=tcp \
    --execute="SELECT * FROM employees;" \
    test
```

