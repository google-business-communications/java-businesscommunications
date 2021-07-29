# [Google's Business Communications: Java Client](https://github.com/google-business-communications/java-businesscommunications)

[Business Communications](https://developers.google.com/business-communications/business-messages/reference/business-communications/rest) is an API for creating, managing, and launching agents for Google's Verified SMS and Business Messages platforms.

## Documentation

The documentation for the Business Commmunications API can be found [here](https://developers.google.com/business-communications/business-messages/reference/business-communications/rest).

## Quickstart

### Before you begin

1.  [Register with Business Messages](https://developers.google.com/business-communications/business-messages/guides/set-up/register).
1.  Once registered, follow the instructions to [enable the APIs for your project](https://developers.google.com/business-communications/business-messages/guides/set-up/register#enable-api).

### Installing the client library

The Business Communications library is hosted on Maven central.
To use the library in your project, add the following to the dependencies section of your
project’s build.gradle.

```
repositories {
   mavenCentral()
}

dependencies {
   compile group: 'com.google.apis', name: 'google-api-services-businesscommunications', version: '1.25.4'
}
```

If using maven, add the following to your pom.xml file.

```xml
<dependency>
  <groupId>com.google.apis</groupId>
  <artifactId>google-api-services-businesscommunications</artifactId>
  <version>1.25.4</version>
</dependency>
```

### Using the client library

```java
/**
 * Initializes credentials used by the Business Communications API.
 *
 * @param credentialsFileLocation The location for the GCP service account key file.
 */
private static BusinessCommunications.Builder getBusinessCommunicationsBuilder(String credentialsFileLocation) {
  System.out.println("Initializing credentials for the Business Communications API.");

  BusinessCommunications.Builder builder = null;
  try {
    GoogleCredential credential = GoogleCredential
        .fromStream(
            BusinessCommunicationsApi.class.getResourceAsStream("/" + credentialsFileLocation));

    credential = credential.createScoped(Arrays.asList(
        "https://www.googleapis.com/auth/businesscommunications"));

    credential.refreshToken();

    HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
    JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance();

    // Create instance of the Business Communications API
    builder = new BusinessCommunications
        .Builder(httpTransport, jsonFactory, null)
        .setApplicationName(credential.getServiceAccountProjectId());

    // Set the API credentials and endpoint
    builder.setHttpRequestInitializer(credential);
  } catch (Exception e) {
    e.printStackTrace();
  }

  return builder;
}

public static void main(String args[]) {
  try {
    // Create client library reference
    BusinessCommunications.Builder builder = getBusinessCommunicationsBuilder("your-service-account-key-file-location");

  	// Create a request to create a new brand with the name "Test Brand"
    BusinessCommunications.Brands.Create request = builder
        .build().brands().create(new Brand().setDisplayName("Test Brand"));

    Brand brand = request.execute();

    // Print newly created brand object
    System.out.println(brand.toPrettyString());
  } catch (Exception e) {
    e.printStackTrace();
  }
}
```

## Samples

See [code examples](https://github.com/google-business-communications/bc-bm-java-command-line-examples) to see example
usage for most API features. The samples' `README.md` has instructions for running the samples.

| Sample                      | Source Code                       |
| --------------------------- | --------------------------------- |
| Brand CRUD Operations | [source code](https://github.com/google-business-communications/bc-bm-java-command-line-examples/blob/master/src/main/java/com/google/businesscommunications/businessmessages/samples/BrandSample.java) |
| Agent CRUD Operations | [source code](https://github.com/google-business-communications/bc-bm-java-command-line-examples/blob/master/src/main/java/com/google/businesscommunications/businessmessages/samples/AgentSample.java) |
| Location CRUD Operations | [source code](https://github.com/google-business-communications/bc-bm-java-command-line-examples/blob/master/src/main/java/com/google/businesscommunications/businessmessages/samples/LocationSample.java) |

## Contributing

Contributions welcome! See the [Contributing Guide](https://github.com/google-business-communications/java-businesscommunications/CONTRIBUTING.md).

## License

Apache Version 2.0

See [LICENSE](https://github.com/google-business-communications/java-businesscommunications/LICENSE)
