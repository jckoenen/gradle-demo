### Gradle Demo

All commands are assumed to be run from the project root.

Example commands to generate a few local releases:

```shell
./gradlew -Prelease impl:publishToMavenLocal # publish impl release
./gradlew api:publishToMavenLocal # publish api snapshot

# OR
./gradlew publishToMavenLocal # publish api & impl snapshots
./gradlew -Prelease publishToMavenLocal # publish api & impl releases
```

Example pom generated when publishing `impl` release:
```shell
cat "$HOME/.m2/repository/com/holidu/hx/gradle-demo/impl/0.2/impl-0.2.pom"
```
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <!-- This module was also published with a richer model, Gradle metadata,  -->
  <!-- which should be used instead. Do not delete the following line which  -->
  <!-- is to indicate to Gradle or any Gradle module metadata file consumer  -->
  <!-- that they should prefer consuming it instead. -->
  <!-- do_not_remove: published-with-gradle-metadata -->
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.holidu.hx.gradle-demo</groupId>
  <artifactId>impl</artifactId>
  <version>0.2</version>
  <dependencies>
    <dependency>
      <groupId>com.holidu.hx.gradle-demo</groupId>
      <artifactId>api</artifactId>
      <version>0.1</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>org.jetbrains.kotlin</groupId>
      <artifactId>kotlin-stdlib</artifactId>
      <version>2.0.0</version>
      <scope>compile</scope>
    </dependency>
    <dependency>
      <groupId>com.google.guava</groupId>
      <artifactId>guava</artifactId>
      <version>33.0.0-jre</version>
      <scope>runtime</scope>
    </dependency>
  </dependencies>
</project>
```
