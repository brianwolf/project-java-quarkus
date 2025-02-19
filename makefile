DOCKER_GROUP=brianwolf94
APP_NAME=quarkus
VERSION=1.0.0

dev:
	./mvnw quarkus:dev

compile c:
	./mvnw install -Dnative -DskipTests -Dquarkus.native.container-build=true

linux l:
	./target/$(APP_NAME)-$(VERSION)-runner


docker-build db:
	docker build . -t docker.io/$(DOCKER_GROUP)/$(APP_NAME):$(VERSION)
