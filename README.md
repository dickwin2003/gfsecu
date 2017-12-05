# gfsecu
下载src和pom.xml即可 该项目为maven项目 myeclipse下载后pom.xml自动下载所需要的jar包


1>
数据库配置文件在：gfsecu\src\main\resources
安装好他们要求的postgresql数据库 我这里安装的是9.4可以咨询他们需要安装哪个版本
以下是配置信息url=jdbc:postgresql://127.0.0.1:5432/test （地址和数据库开放端口5432 以及数据库test）
连接数据库的用户名和密码以及驱动等
spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/test
spring.datasource.username=postgres
spring.datasource.password=root
spring.datasource.driver-class-name=org.postgresql.Driver

2>测试的建表数据脚本：client_info.sql 在postgresql中运行即可 建立后表在：数据库--架构--数据表可以查看/增加修改/查询

3>待执行pom.xml的jar包更新后 以及配置好数据库的表参数后
可以在项目run as spring boot app或run as java application或直接在IDE中找到com.lvyuan找到Application run起来就可以了


查看接口信息：http://localhost:8080/swagger/index.html

以及测试接口:http://localhost:8080/getUserInfo

http://localhost:8080/hello
