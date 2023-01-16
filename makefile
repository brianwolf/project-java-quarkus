dev d:
	./mvnw compile quarkus:dev

package p:
	./mvnw package -Pnative -Dquarkus.native.container-build=true