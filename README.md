# Spock Framework Testing with Docker set up for development and testing 

This is a example of how to make Spock work with Spring Boot 3.0, Java 17 and Maven.

The essential packages are: </br>
* spring-boot-starter-test
* spock-core
* spock-spring
* gmavenplus-plugin

And plugins:
* gmavenplus-plugin
* maven-surefire-plugin

## How this works.
In this case we run our postgres database **always** in a docker container.
For development purposes you just run ``docker compose up`` to start the project.
The docker-compose file runs the app with the argument which is the database host name.
We defined it in the docker-compose file as container_name: **db**.

So for development the **application.properties** host is set to db via the arguments.

In the case of running the tests in our IDE (for example Intellij Idea) to benefit of the UI for the tests, the default host name is set to **localhost**. Keep in mind that you still have to run the database in the container with ``docker compose up database``.

If you want to run the tests in the container go to the **Scripts** section of this readme.

## Scripts
The scripts in this projects are:
* clean-volumes.sh

The clean volumes script cleans the volumes of the container. By doing that postgres will re-initialize the **init.sql** file so all changes you have made to that sql script will be applied.