# Материалы с курса  Spring и Hibernate for Beginners

## constructor-injection

В данном примере мы видим как можно инжектить бины в конструкторе, с 4-ой версии Spring мы можем 
не ставить аннотацию на конструктуре, теперь спринг сделат это автоматом
ТАк же видно как работает Autowired ищет бины по типу поля, т.е. мы инжектив FortuneService, а 
он сам наодит подходящий каласс HappyFortuneService, который имплементит этот интерфейс по типу.

Но как он сможет найти класс, если их будет несколько, и все имплементят интерфейс FortuneService?
Для этого существует аннотация Qualifier, мы рассмотрим ее в другом уроке

В пример AnnotationFieldApp мы реализовали внедрение зависимости через поле
