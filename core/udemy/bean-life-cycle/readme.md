# Материалы с курса  Spring и Hibernate for Beginners

## жизненный цикл бина

В примере BeanLifeCycleDemoApp показан жиненнй цикл бина myCoach
конфигурация находится в файле beanLifeCycle-applicationContext.xml
в которой прописан сам бин TrackCoach и его два метода Init and destroy


В примере SetterDemoApp показан жизненый цикл бина myCricketCoach класс CricketCoach
конфигурация находится в файле applicationContext.xml
мы видим что мы вызываем его методы theCoach.getDailyWorkout(), но перед этим происходит вызов
конструктора и установка всех его свойств и только опосле этого отработают наши методы и мы 
можем получить все его свойства

Так же мы видим как происходдит инициализация сервиса myFortuneService через конструктор
HelloSpringApp тоже самое толлько без сеттеров

В примере BeanScopeDemoApp показан scope бина myCoach класс CricketCoach
конфигурация находится в файле beanScope-applicationContext.xml
задаем бину свойство scope="prototype"
и затем создаем два бина и мы видим что это совершенно разные бины, т.е. prototype работает

