<h3>Simple Maven template</h3>

mvn test

mvn compile

mvn package

java -jar target/projectname-1.0-SNAPSHOT.jar

In case you want to create a maven from scratch:
mvn archetype:generate -DgroupId=fi.vamk.studentid -DartifactId=projectname -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeGroupId=org.apache.maven.archetypes

To be able to run java -jar add a plug-in:

      <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.1.1</version>
          <configuration>
              <archive>
                  <manifest>
                      <mainClass>fi.vamk.studentid.App</mainClass>
                  </manifest>
              </archive>
              <descriptorRefs>
                  <descriptorRef>jar-with-dependencies</descriptorRef>
              </descriptorRefs>
          </configuration>
      </plugin>
