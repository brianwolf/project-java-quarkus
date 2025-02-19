# java-quarkus

> Ejemplo de proyecto de java 17 con quarkus

![alt](docs/img/quarkus_logo.png)

## :gear: Requisitos

* Java 21
* Apache Maven 3.8.4

## :tada: Uso

```bash

# correr usando dev
make r

# compilar a binario
make p
```

## :beetle: Debugger

### vscode

launch.json

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Remote Debug (Attach Quarkus)",
            "request": "attach",
            "hostName": "localhost",
            "port": 5005
        },
        {
            "type": "java",
            "name": "Remote Debug (Attach OpenLiberty)",
            "request": "attach",
            "hostName": "localhost",
            "port": 7777
        },
    ]
}
```

## :books: Referencias

* [Iconos](https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md)
* [Readme de quarkus](docs/README.md)

## :grin: Autor

> **Brian Lobo**

* Github: [brianwolf](https://github.com/brianwolf)
* Docker Hub:  [brianwolf94](https://hub.docker.com/u/brianwolf94)
