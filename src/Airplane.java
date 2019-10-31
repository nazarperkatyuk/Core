public abstract class Airplane {

    public void StartingEngines(){
        int time = (int) (Math.random() * 5);
        System.out.println("До взльоту лишилось " + time + " хвилин...");
    }

    public void PlaneTakeOff (){
        int km = (int) (Math.random() * 1000);
        System.out.println("Літак пройде на повному баку " + km + " км.");
    }

    public void LendingOfThePlane (){
        System.out.println("Літак іде на посадку...");
    }

      int length;
      int weight;
      int wight;

    public Airplane(int length, int weight, int wight) {
        this.length = length;
        this.weight = weight;
        this.wight = wight;
    }
}