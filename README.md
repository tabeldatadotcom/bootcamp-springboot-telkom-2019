# bootcamp-springboot-telkom-2019

Ref: 
- Spring Dependency Injection: https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html
- Spring JDBC: https://docs.spring.io/spring-boot/docs/2.1.6.RELEASE/reference/htmlsingle/#boot-features-configure-datasource
- Spring Web MVC: https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/mvc.html
- Convert data to millisecond: https://currentmillis.com

## Create user database

```sql
create user bootcamp identified by 'bootcamp';

create database perpustakaan;

grant all privileges on *.* to bootcamp@'%' identified by 'bootcamp';
```

## tools

[postman download](https://www.getpostman.com)

## Request

- Save data

```curl
curl -X POST \
  http://localhost:9090/buku \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 113' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:9090' \
  -H 'Postman-Token: 6b584161-02c9-454e-b075-c50092edb53a,59335e84-c8fc-4fe8-b8c0-2d31687c0f3b' \
  -H 'User-Agent: PostmanRuntime/7.17.1' \
  -H 'cache-control: no-cache' \
  -d '{
	"id": 4,
	"nama": "Ilmu Komputer 3",
	"isbn": "12345",
	"tahunTerbit": 2015,
	"tanggalTerbit": 1571818990239
}'
```

- get list of data

```curl
curl -X GET \
  http://localhost:9090/buku/list \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Host: localhost:9090' \
  -H 'Postman-Token: 6078ef1d-22a6-4e5e-83bc-81a0777fef67,011e675c-974d-499b-94d6-f6f863b40b3c' \
  -H 'User-Agent: PostmanRuntime/7.17.1' \
  -H 'cache-control: no-cache'
```

- get data by id

```curl
curl -X GET \
  http://localhost:9090/buku/1 \
  -H 'Postman-Token: 99c7251e-6873-43b7-aac2-168dd331f35b' \
  -H 'cache-control: no-cache'
```


- delete data by id

```curl
curl -X DELETE \
  http://localhost:9090/buku/1 \
  -H 'Postman-Token: 8e8bb299-ae2c-40cc-80ed-ad7d485ba8a9' \
  -H 'cache-control: no-cache'
```
