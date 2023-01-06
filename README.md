# CLI Commands REST API (Java Spring Boot)
Site link: https://cli-commands-0-production.up.railway.app/swagger-ui/index.html /commands-controller

#### With the plethora of CLI commands to learn, it is helpful to have an API which returns us commands that we often forget. This Commands API stores command line snippets along with a short description of what it does.(, as well as which platform it's for).
### The purpose of this project is to learn and practice concepts related to:
> - Building a REST API
> - Java Spring Boot
> - 3-tier Architectural Pattern
> - ...

#### More specifically, I used the following:
> - Dependency injection
> - Repository design pattern
> - PostgreSQL and Spring Data JPA
> - Data Transfer Objects (DTOs)
> - RESTful API guidelines
> - HTTP (GET, POST, PUT, DELETE, status codes)
> - Testing API Endpoints (SwaggerUI & Postman)
> - Unit testing (Mockito & AssertJ)
> -> Docker (Container, Image, Deploying on Docker Hub)
> - Railway (Deployment: Github repo + SQL database)

*Note: ..*

### Website Look:

![image](src/main/resources/imagesForGithub/screenshot.PNG)

[//]: # (### API Endpoints &#40;CRUD&#41;:)

[//]: # ()
[//]: # (![image]&#40;src/main/resources/imagesForGithub/api_endpoints.png&#41;)

### Application Architecture:

<p align="center">
<img src="src/main/resources/imagesForGithub/architecture2.gif" width="600">
</p>

[//]: # (![image]&#40;src/main/resources/imagesForGithub/architecture.png =250x250&#41;)
[//]: # ()
[//]: # (test)


[//]: # (## Sample endpoints using Postman:)

[//]: # (### [HttpPost] Creates a new command, returns Location header with link to resource, as well as the '201 Created' status code.)

[//]: # ()
[//]: # (![image]&#40;&#41;)

[//]: # (### [HttpPatch] Updates the value of the howTo attribute and returns the '204 No Content' status code.)

[//]: # ()
[//]: # (![image]&#40;&#41;)