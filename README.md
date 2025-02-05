# Калькулятор комплексных чисел
## Использованные принципы SOLID:
1.Single Responsibility Principle (SRP): Каждый класс отвечает за одну задачу (например, ComplexNumber для представления комплексного числа, BasicComplexCalculator для операций с комплексными числами).

2.Open/Closed Principle (OCP): Классы Logger и ComplexCalculator можно расширять без изменения их исходного кода.

3.Liskov Substitution Principle (LSP): Реализации интерфейсов ComplexCalculator и Logger могут взаимозаменяться.

4.Interface Segregation Principle (ISP): Интерфейсы Logger и ComplexCalculator разделены на несколько специализированных интерфейсов.

5.Dependency Inversion Principle (DIP): Классы зависят от абстракций (интерфейсов), а не от конкретных реализаций.

## Использованные паттерны проектирования:

Фабричный метод: LoggerFactory используется для создания объектов логирования.

Стратегия: Использование интерфейса Logger для различных типов логирования.

## Логирование
Пример показан на основе консольного логирования.В фафле CalculatorApplication.java пример демонстрирует основные операции с комплексными числами (сложение, умножение и деление) и выводит результаты в консоль с использованием логирования Для использования логирования в файл необходимо использовать FileLogger в LoggerFactory и передать путь к файлу.Пример:

Logger logger = LoggerFactory.getLogger("file", "path/to/logfile.log");

