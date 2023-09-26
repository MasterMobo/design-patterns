/*  In Composite, primitive elements (ones with no children) and composite elements (ones with children) are treated equal by the client.
    That is, they provide the same interface (methods) to the client.
 */
package composite;

public class Main {
    public static void main(String[] args) {
        GPU gpu = new GPU("i7-2000", 250.0);
        CPU cpu = new CPU("RTX-4049Ti", 455.0);
        Fan fan = new Fan("RGP Fan", 30.0);
        MotherBoard motherBoard = new MotherBoard("Asus Motherboard", 170.0);
        Chassis chassis = new Chassis("Crosshair Chassis", 200.0);

        try {
            motherBoard.add(gpu);
            motherBoard.add(cpu);
            chassis.add(motherBoard);
            chassis.add(fan);

            System.out.println(chassis.netPrice());

            // Invalid adding to primitive component
            fan.add(cpu);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}