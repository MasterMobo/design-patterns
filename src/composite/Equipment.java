package composite;

public abstract class Equipment implements Equipmentable{
    protected String name;
    protected double basePrice;
    public Equipment(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public abstract void add(Equipment equipment) throws Exception;

    @Override
    public abstract void remove(Equipment equipment) throws Exception;

    @Override
    public abstract double netPrice();
}
