package studio7;

public class Die {
    
    private int sides;

    public Die(int initSides) 
    {
        this.sides = initSides;
    }

    public int getRoll()
    {
        return (int)(Math.random() * this.sides + 1);
    }

    public static void main(String[] args)
    {
        Die roll1 = new Die(10);
        System.out.println(roll1.getRoll());

    }
}
