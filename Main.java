import java.util.ArrayList;
import java.util.List;

// Інтерфейс спостерігача
interface Observer {
    void update(String message);
}

// Спостерігач
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " отримав(ла) повідомлення: " + message);
    }
}

// Суб'єкт
class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void doSomethingImportant() {
        // Якщо відбулися зміни, сповіщаємо спостерігачів
        System.out.println("Важлива подія відбулася!");
        notifyObservers("Деталі події");
    }
}

