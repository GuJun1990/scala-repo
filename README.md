# 学习Scala代码仓库
## Java和Scala混合编程Maven配置
1. 添加Scala依赖
```xml
<dependency>
    <groupId>org.scala-lang</groupId>
    <artifactId>scala-library</artifactId>
    <version>2.13.1</version>
</dependency>
```
2. 添加Scala编译插件
```xml
<plugin>
    <groupId>net.alchim31.maven</groupId>
    <artifactId>scala-maven-plugin</artifactId>
    <version>3.3.2</version>
    <executions>
        <execution>
            <goals>
                <goal>compile</goal>
                <goal>testCompile</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

* 编译
```shell script
mvn clean scala:compile package
```

* 运行
```shell script
java -cp target/xxx.jar org.example.xxx
```
