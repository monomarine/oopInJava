package lesson2;

public interface Herbivore {
    int GetSpeed();
    void SetSpeed(int x);
    void Eat();
    void Intersection(Predator other);
}
