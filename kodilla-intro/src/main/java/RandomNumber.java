
public class RandomNumber {
    private int min;
    private int max;
    private int sum;

    public static void main(String[] args) {
        RandomNumber rn = new RandomNumber();
        rn.draw();
        System.out.println("Min random number was :" + rn.getMin());
        System.out.println("Max random number was :" + rn.getMax());
    }

    public void draw(){
        int maxRange = 31;
        int minRange = 0;
        this.min = maxRange;
        this.max = minRange;
        this.sum = 0;
        while(sum < 5000){
            int random = (int) ((Math.random() * (maxRange - minRange)) + minRange);
            if(random < this.min )
                this.min = random;
            if(random > this.max)
                this.max = random;
            this.sum += random;
        }
        System.out.println("Sum : " + this.sum);
    }

    public int getMin(){
        return this.min;
    }

    public int getMax(){
        return this.max;
    }
}
