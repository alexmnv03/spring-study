# Материалы с курса  Spring и Hibernate for Beginners

## IOC 

В даном примере мы в xml-файле определяем бин myCoach как класс TrackCoach и с создав контекст 
мы получаем наш бин. Далее вызвав его метод мы видим что это имеено реализация TrackCoach, то 
что мы и прописали в настройках.

Рассмотри пример как мы можем изменить имя бина - AnnotComDemoApp
Укажем в аннотиции Component, класса TennisCoach имя бина и дальше уже внедряем этот компоннет 
по этому имени 
