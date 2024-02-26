package lesson2;

public class Wolf implements Predator{
    int speed;
    @Override
    public int GetSpeed() {
        return speed;
    }
    @Override
    public void SetSpeed(int x) {
        this.speed = x;
    }
    public Wolf(int x) {
        SetSpeed(x);
    }

    @Override
    public void Eat(Herbivore other) {
        if(Intersection(other)){
            System.out.println("съел");
        }
        else{
            System.out.println("остался голодный");
        }
    }
    @Override
    public boolean Intersection(Herbivore other) {
        if(other.GetSpeed()> this.GetSpeed()) {
            System.out.println("жертва убежала");
            return false;
        }
        else {
            System.out.println("жертва поймана");
            return true;
        }
    }
}
