public class Rocket implements SpaceShip {
    private int currentWeight;
    private int weight;
    private int maxCargo;
    private double totalWeight =currentWeight+weight;
    private int cost;
    public boolean launch()
    {
        return true;
    }
    public boolean land()
    {
        return true;
    }
    public boolean canCarry(Item item)
    {
        if(maxCargo>(currentWeight+item.getWeight()))
            return true;
        else
        {
            System.out.println("Can't carry item:"+item.getName()+"\tweight: "+item.getWeight());
            return false;
        }
    }
    public void carry(Item item)
    {
        System.out.println("Carrying item: "+item.getName()+"\tWeight: "+item.getWeight());
        currentWeight+=item.getWeight();
    }

    public double getMaxCargo()
    {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo)
    {
        this.maxCargo=maxCargo;
    }
    public void setCost(int cost)
    {
        this.cost=cost;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(int weight)
    {
        this.weight=weight;
    }
    public double getTotalWeight()
    {
        totalWeight=getCurrentWeight()+getWeight();
        return totalWeight;
    }
    public int getCurrentWeight()
    {
        return currentWeight;
    }
    public void setCurrentWeight(int currentWeight)
    {
        this.currentWeight=currentWeight;
    }

}
