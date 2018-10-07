package equpiment;

public class Item
{
	protected String name_;
    protected double weight_;

    public Item()
    {
        name_ = "noname";
        weight_ = 1.0;
    }

    public Item(String name, double weight)
    {
        name_ = name;
        weight_ = 1.0;
        if (weight > 0.0 && weight <= 10.0)
        {
            weight_ = weight;
        }
    }
    
    public String getName()
    {
    	return name_;
    }
    
    public double getWeight()
    {
        return weight_;
    }

    public String toString()
    {
        return name_ + " " + String.valueOf(weight_);
    }
    
    public static void main(String args[])
    {
    	Item itemA = new Item();
    	System.out.println(itemA.toString());
    	
    	Item itemB = new Item("itemB", 5.6);
    	System.out.println(itemB.getName() + " " + itemB.getWeight());
    	
    	Item itemC = new Item("itemC", 55);
    	System.out.println(itemC.getName() + " " + itemC.getWeight());
    }
}
