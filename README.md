# Logging [![](https://jitpack.io/v/Col-E/logging.svg)](https://jitpack.io/#Col-E/logging)

This is a basic logging library that I use in my projects. 

### Examples

See: [Recaf](https://github.com/Col-E/Recaf)

### Using in your project

This project is hosted via JitPack.io. You can add this project to your maven project like so:
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
<dependencies>
	<dependency>
	    <groupId>com.github.Col-E</groupId>
	    <artifactId>logging</artifactId>
	    <version>1.0</version>
	</dependency>
</dependencies>
```

### Building

Pre-built: 

* [releases](https://github.com/Col-E/logging/releases)

Build-yourself: 

* clone / download the repo
* open a terminal in the directory with `pom.xml`
* run `mvn package`
    * Generates jar file in `/target` directory