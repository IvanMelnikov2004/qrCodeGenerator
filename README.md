# qrCodeGenerator
## Как развернуть
### Скопировать репозиторий
`git clone https://github.com/IvanMelnikov2004/qrCodeGenerator/tree/main`
### Перейти в проект
`cd qrCodeGenerator`
### Запустить проект
`mvn clean spring-boot:run`
## Развернуть через docker
`mvn clean package`
###
`docker build -t skillminer/qrcode-generator:latest .`
###
`docker tag skillminer/qrcode-generator:latest skillminer/qrcode-generator:latest`
###
`docker run -it --rm -p 8083:8083 --name qrcode-generator skillminer/qrcode-generator:latest`
###
`docker push skillminer/qrcode-generator:latest skillminer/qrcode-generator:latest`
