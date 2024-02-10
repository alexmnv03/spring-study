# Аннотации

Аннотации - это специальные комментарии , метки, метаданные, которые нужны для передачи 
определенной информации

Конфигурация с помощью аннотаций- это более короткий и быстрый вариант по сравнению с xml

Происходит сканирование классов и поиск аннотации, например @Component а далее создание и 
регистрация бина в контейнере

Но чтобы запустить процесс сканирования мы должны указать где это сканирование делать.
Это единственное , что мы будем делать в xml-конфигурации

@Component("catBean") - задаем id бину = catBean
@Component - Spring сам задает id бину = cat, тут всегда действует принцип берется имя класса и 
первая буква делается прописной

Но если у нас в клссе две заглавные буквы, то в этом слуае его id не меняется
@Component
class SQLmy  - id=SQLmy