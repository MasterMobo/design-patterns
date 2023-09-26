package composite;

import java.util.ArrayList;

public class CompositeEquipment extends Equipment{
    private ArrayList<Equipment> equipments;

    public CompositeEquipment(String name, double price) {
        super(name, price);
        equipments = new ArrayList<>();
    }

    @Override
    public void add(Equipment equipment){
        equipments.add(equipment);
    }

    @Override
    public void remove(Equipment equipment) {
        equipments.add(equipment);
    }


    @Override
    public double netPrice() {
        double total = basePrice;
        for (Equipment e: equipments) {
            total += e.netPrice();
        }
        return total;
    }
}
