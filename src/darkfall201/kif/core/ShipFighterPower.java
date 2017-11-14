package darkfall201.kif.core;

import darkfall201.kif.ships.Carrier;
import darkfall201.kif.equipment.*;

import java.util.ArrayList;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class ShipFighterPower {

    private static Double fighterPower;

    public Double getFighterPower() {
        return fighterPower;
    }

    public static double calculateFighterPower(Carrier carrier){
        fighterPower=0.0;
        for(int slot=1;slot<5;slot++){
            Equipment slotEquipment=carrier.getEquipmentSlot().get(slot);
            if(slotEquipment instanceof Plane) {
                Plane plane=(Plane) slotEquipment;
                fighterPower+= floor(sqrt(carrier.getSlotsSize().get(slot))*plane.getAntiAir()+plane.calculateProficiencyFighterPower());

            }
        }

        return fighterPower;
    }


}
