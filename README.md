# bootcamp-springboot-telkom-2019

Ref: 
- Spring Dependency Injection: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html
- Spring JDBC: https://docs.spring.io/spring-boot/docs/2.1.6.RELEASE/reference/htmlsingle/#boot-features-configure-datasource

## Create user database

```sql
create user bootcamp identified by 'bootcamp';

create database perpustakaan;

grant all privileges on *.* to bootcamp@'%' identified by 'bootcamp';
```
