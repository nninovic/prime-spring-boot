# primefaces-spring-boot in embedded Tomcat

## Why itthis is not another Spring-Boot Jsf template
The intend of this small project is to serve as template for Spring Boot, Primefaces, PrettyFaces and Embedded Tomcat in Java 7

The reason I decided to build this small template project is that I have struggled in my big project to configure it correctly.

Precisely, the problem was with embedded tomcat configuration with PrettyFaces. At begennig everythig was smooth, during the configuration of Spring Boot and Primefaces, but introducing the PrettyFaces gave me the headache. I researched through the internet and found a lot github
projects, but unfortunately non of them suits my needs. Some was with a provided tomcat, some without PrettyFaces, some didn't work at all.

Here are the some of them, that helped me a lot during my research and might help you depending on your needs

* https://github.com/MeisterGit/FoundationServer
* https://github.com/stephanrauh/spring-boot-primefaces-template
* https://github.com/stephanrauh/JSF-on-Spring-Boot
* https://github.com/iamiddy/spring-boot-primefaces-template
* https://github.com/leveluplunch/037-integrate-jsf-spring-boot

Some of the code in my sample is copied from those projects with comments included as well because they are very usful

## PrettyFaces catch
To make the springboot work with PrettyFaces, the output folder must be set to WEB-INF/classes, so I put that in pom.xml
For more explanation about this topic you can read the comments in [this post](http://www.ocpsoft.org/support/topic/spring-boot-jsf-2-2-prettyfaces-failing-to-get-urlmapping-to-function/)

## Run the application
To run the application, just clone, run mvn:install, start the Application.main and run localhost:8080 in you browser


