public class ObserverPatternExample {
    public static void main(String[] args) {
        // Створюємо суб'єкт
        Subject subject = new Subject();

        // Створюємо спостерігачів
        Observer observer1 = new ConcreteObserver("Спостерігач 1");
        Observer observer2 = new ConcreteObserver("Спостерігач 2");

        // Додаємо спостерігачів до суб'єкта
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Важлива подія відбулася, і всі спостерігачі будуть повідомлені
        subject.doSomethingImportant();

        // Видаляємо одного зі спостерігачів
        subject.removeObserver(observer1);

        // Ще одна важлива подія
        subject.doSomethingImportant();
    }
}
