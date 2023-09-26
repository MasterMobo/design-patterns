package composite;

public abstract class PrimitiveEquipment extends Equipment{
    public PrimitiveEquipment(String name, double price) {
        super(name, price);
    }

    @Override
    public void add(Equipment equipment) throws Exception {
        throw new Exception("Can not add component to primitive component");
    }

    @Override
    public void remove(Equipment equipment) throws Exception {
        throw new Exception("Can not remove component from primitive component");
    }

    @Override
    public double netPrice() {
        return basePrice;
    }
}
