package lesson2;

public interface Predator {
    int GetSpeed();
    void SetSpeed(int x);
    void Eat(Herbivore other);
    boolean Intersection(Herbivore other);
}
