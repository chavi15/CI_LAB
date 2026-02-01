# CILabProject

## Description
Simple Java Maven calculator project to demonstrate CI/CD using Jenkins.

## Tech Stack
- Java
- Maven
- Jenkins
- GitHub

## Project Structure
- src/main/java → application code
- src/test/java → JUnit tests
- Jenkinsfile → pipeline definition
- docker/ → Docker configuration
- scripts/ → build and deploy scripts

## Jenkins Jobs
1. Freestyle Job – Maven build & test
2. Multibranch Pipeline – main, feature, release branches

## How to Build
```bash
mvn clean test
