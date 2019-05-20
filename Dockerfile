FROM openjdk:8
ADD target/enrutar-parametros.jar enrutar-parametros.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar" , "enrutar-parametros.jar"]