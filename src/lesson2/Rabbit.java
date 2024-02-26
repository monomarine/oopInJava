package lesson2;

public class Rabbit implements Herbivore{
   int speed;
   public Rabbit(int speed){
       this.speed = speed;
   }
    @Override
    public int GetSpeed() {
        return speed;
    }
    @Override
    public void SetSpeed(int x) {
        speed = x;
    }
    @Override
    public void Eat() {
        System.out.println("кролик кушает траву");
    }
    @Override
    public void Intersection(Predator other) {
        if(other.GetSpeed() > this.GetSpeed()) //хищник быстрее
            System.out.println("кролик съеден");
        else System.out.println("кролик убежал");
    }
}
