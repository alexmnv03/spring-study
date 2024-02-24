# Конфигурация Spring контейнера с помошщью Java кода

Мы можем это сделать двумя способами

@Configuration
@ComponentScan("path_package")
class MyConfig(){...}

@Configuration - означает что это конфигурация
@ComponentScan - задает какой пакет надо сканировать на поиск бинов и др аннотаций


