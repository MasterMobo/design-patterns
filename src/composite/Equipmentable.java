package composite;

public interface Equipmentable {
    void add(Equipment equipment) throws Exception;

    void remove(Equipment equipment) throws Exception;

    double netPrice();
}
