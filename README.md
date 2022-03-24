

## Build without Docker

```bash
./mvnw clean install
```

## Build with Docker

```bash
./mvnw jib:dockerBuild -Djib.to.image=student-management:v1
```

## Run with Docker

```bash
docker run --name student-management -p 8080:8080 student-management:v1
```

## Build to Docker Hub

```bash
docker login

./mvnw clean install jib:build -Djib.to.image=helmiz21/student-management:v1

or

./mvnw clean install jib:build -Djib.to.image=helmiz21/student-management:v1 -D jib.to.auth.username=helmiz21 -Djib.to.auth.password=pswd
```

## Profiles

```bash
# Check active profile
./mvnw help:active-profiles

# dockerhub
./mvnw clean install -P build-frontend -P jib-push-to-dockerhub -D app.image.tag=1

# local
./mvnw clean install -P build-frontend -P jib-push-to-local -D app.image.tag=1
```
