# Transport and Logistics
A Transport and Logistics Workspace Project with Spring Boot 3.0.3, JDK 17 & Gradle.

Services are developed in the following modules:
* **Load Manager** - Load Manager Service in order to manage load related functionalities.
* **Service Discovery** - Service Discovery Service in order to discover other services.
* **User Manager** - User Manager Service in order to manage user related functionalities.
* **Vehicle Manager** - Vehicle Manager Service in order to manage vehicle related functionalities.

## Table of Contents

1. [How to Contribute](#how-to-contribute)
2. [Requirements](#requirements)
3. [Version Control Standards](#version-control-standards)
4. [Postman Collection](#postman-collection)
5. [Copyright](#copyright)

## How to Contribute

For the contributor covenant to this project, please check the Code of Conduct file.

[![Contributor Covenant][contributor]](CODE_OF_CONDUCT.md)

### Credits

Please check the [Contributors List](CONTRIBUTORS.md) to see who makes this open-source alive.

## Requirements

For building and running the application belows are required;

- [Spring Boot 3.0.0][spring-boot-version]
- [JDK 17][java-version]
- [Gradle 7.6 or above][gradle-version]
- [PostgreSQL][postgresql-version]
- [Flyway Migration][flyway-migration]
- Eureka Client
- Spring Cloud Config Server
- Spring Boot Actuator

## Version Control Standards

Below version control standards should be followed within the project;

- The default branch is [master branch][master-branch-github-link].
- Feature enhancements or defect fixes should not be committed to the default branch, they should be coded in feature or bug branches.
- Issues should be created for each feature or fix in the [Transport and Logistics Workspace GitHub Repository Project][transport-and-logistics-workspace-github].
- Pull request (PR) should be created for each feature/bug branch to [master branch][master-branch-github-link].
- While creating a PR "[Feature]: ", "[Bug]: " or "[Doc]: " prefix should be used to identify the PR type.
- PRs should be linked with a valid issue in the [Transport and Logistics Workspace GitHub Repository Project][transport-and-logistics-workspace-github].
- If validations are passed in the [master branch][master-branch-github-link], then a merge branch request is created with "merge branch" label & a linked PR to the [master branch][master-branch-github-link].

## Postman Collection

N/A

## Copyright

GNU General Public License v3.0
Permissions of this strong copyleft license are conditioned on making available complete source code of licensed works and modifications, which include larger works using a licensed work, under the same license. Copyright and license notices must be preserved. Contributors provide an express grant of patent rights.
Please check the [LICENSE](LICENSE) file for more details.

[spring-boot-version]: https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Release-Notes
[java-version]: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
[gradle-version]: https://gradle.org/releases/
[postgresql-version]: https://www.postgresql.org/
[flyway-migration]: https://flywaydb.org/documentation/
[contributor]: https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg
[transport-and-logistics-workspace-github]: https://github.com/Onuraktasj/transport-and-logistics-spring-boot-mikroservice-project
[master-branch-github-link]: https://github.com/Onuraktasj/transport-and-logistics-spring-boot-mikroservice-project/tree/master
