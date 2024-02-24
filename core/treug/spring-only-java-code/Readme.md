# Конфигурация Spring контейнера с помошщью Java кода

Мы можем это сделать двумя способами

1. 1- ый способ
@Configuration
@ComponentScan("path_package")
class MyConfig(){...}

@Configuration - означает что это конфигурация
@ComponentScan - задает какой пакет надо сканировать на поиск бинов и др аннотаций

В классе MyConfigTest приведен пример данного варианта

2. 2- й способ

