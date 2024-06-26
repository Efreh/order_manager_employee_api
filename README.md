# Order Manager Employee REST API

Этот репозиторий содержит исходный код для REST API, разработанного на базе Spring Boot, предназначенного для управления базой работников в составе основного приложения Order Manager. API предоставляет ряд эндпоинтов для создания, чтения, обновления и удаления заказов, а также для выполнения различных операций, связанных с управлением нарядами.

## Важные особенности

- **Простота использования**: API разработан с использованием принципов простоты и интуитивной работы.
- **Гибкость и расширяемость**: Архитектура API позволяет легко добавлять новые функции и эндпоинты, а также адаптировать его под различные потребности приложений.
- **Безопасность**: Все запросы к API защищены механизмом аутентификации и авторизации для обеспечения безопасности данных.

## Структура проекта

Репозиторий структурирован следующим образом:

- **src/main/java**: Исходные файлы Java, содержащие классы, контроллеры, сервисы и модели, необходимые для работы REST API.
- **src/main/resources**: Ресурсы, такие как файлы конфигурации, миграции базы данных и другие ресурсы.
- Для работы с базой SQL нужно создать и настроить файл src/main/resources/application.properties:  

spring.application.name=employee.rest.api
spring.jpa.hibernate.ddl-auto=update  
server.port=8080  
spring.datasource.url=jdbc:mysql://your_ip_adress:3306/order_db?useSSL=false&serverTimezone=UTC  
spring.datasource.username=USER  
spring.datasource.password=PASSWORD  

Где your_ip_adress - ip вашей MYSQL Базы данных,  
USER - Имя пользователя вашей MYSQL Базы данных,  
PASSWORD - Пароль вашей MYSQL Базы данных.  

## Использование

Для использования этого REST API в вашем приложении:

1. **Клонируйте репозиторий**: `git clone https://github.com/yourusername/order-manager.git`
2. **Настройте конфигурацию**: Настройте файлы конфигурации в соответствии с требованиями вашего приложения.
3. **Соберите проект**
4. **Запустите приложение**
5. **Обращайтесь к API**: Используйте эндпоинты API для управления заказами в вашем приложении.
