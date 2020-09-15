# [Google's Business Communications: Java Client](https://github.com/google-business-communications/java-businesscommunications)

[Business Communications](https://developers.google.com/business-communications/business-messages/reference/business-communications/rest) is an API for creating, managing, and launching agents for Google's Verified SMS and Business Messages platforms.

## Setup Instructions
The Business Communications library is hosted on Maven central.
To use the library in your project, add the following to the dependencies section of your
project’s build.gradle.

```
repositories {
   mavenCentral()
}

dependencies {
   compile group: 'com.google.apis', name: 'google-api-services-businesscommunications', version: '1.25.0'
}
```

If using maven, add the following to your pom.xml file.

```xml
<dependency>
	<groupId>com.google.apis</groupId>
	<artifactId>google-api-services-businesscommunications</artifactId>
	<version>1.25.0</version>
</dependency>
```

## Contributing

Contributions welcome! See the [Contributing Guide](https://github.com/google-business-communications/java-businesscommunications/CONTRIBUTING.md).

## License

Apache Version 2.0

See [LICENSE](https://github.com/google-business-communications/java-businesscommunications/LICENSE)
