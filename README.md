# Microsoft Build OpenJDK

## Demo Quickstart Microsoft Build of OpenJDK

```
$ mvn package -Dmaven.test.skip=true
```

```shell
$ docker build -t demo-msopenjdk .
$ docker run -p 8080:8080 demo-msopenjdk
```