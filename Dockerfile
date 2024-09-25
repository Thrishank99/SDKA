FROM openjdk:17
EXPOSE 8080
ADD target/springboot-application.war springboot-application.war
ENTRYPOINT ["java","-war","/springboot-application.war"]