*******Run directly without packaging the app through mvn

Install java 17
mvn spring-boot:run







******RUN via jar file

Install java 17 to your system 

java -jar target/your-app-name-0.0.1-SNAPSHOT.jar





******RUN via container 

run below commands 

docker build -t spring-boot-app .

docker run -p 8080:8080 spring-boot-app
