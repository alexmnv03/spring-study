# Материалы с курса  Spring и Hibernate for Beginners

## java-config

В этом примере мы видим работу ComponentScan который указывает пакет для сканирования бинов
Сначала мы указываем бин tennisCoach и спринг находит его по имени в нашем пакете
А затем мы используем Qualifier и указываем какую из трех реализцаияй конкретно бин 
FortuneService - randomFortuneService

В классе BeanDefConfig мы создаю бин с помощью java кода. используем аннотации Configuration и Bean.
Результат метода помеченного аннотацие Bean и будет наш бин
