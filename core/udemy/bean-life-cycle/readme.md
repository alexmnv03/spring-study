# Материалы с курса  Spring и Hibernate for Beginners

## жизненный цикл бина

В примере BeanLifeCycleDemoApp показан жиненнй цикл бина myCoach
конфигурация находится в файле beanLifeCycle-applicationContext.xml
в которой прописан сам бин TrackCoach и его два метода Init and destroy


В примере SetterDemoApp показан жиненнй цикл бина myCricketCoach класс CricketCoach
конфигурация находится в файле applicationContext.xml
мы видим что мы вызываем его методы theCoach.getDailyWorkout(), но перед этим происходит вызов
конструктора и установка всех его свойств и тольк опосле этого отработают наше методы и мы 
можем получить все его свойства

