package darkfall201.kif.ships;

import darkfall201.kif.equipment.Equipment;
import darkfall201.kif.equipment.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class Ship {

    protected String name;
    protected HashMap<Integer,Equipment> equipmentSlot=new HashMap<>();
    protected Integer maxSlots;
    protected boolean canCarryPlanes=false;
    protected ArrayList<Boolean> slotsEquipped=new ArrayList<>(Arrays.asList(false,false,false,false,false));
    protected Integer currentSlot=1;
    protected boolean hasReinforcementExpansion=false;

    public HashMap<Integer, Equipment> getEquipmentSlot() {
        return equipmentSlot;
    }
    public String getName() {
        return name;
    }
    public void putEquipmentOnReinforcementExpansion(Equipment equipment){

    }

    public void putEquipment(Equipment equipment){
        if(equipment instanceof Plane && !canCarryPlanes)
            return;
        equipmentSlot.put(currentSlot,equipment);
        slotsEquipped.add(currentSlot,true);
        currentSlot++;
    }
    public void removeEquipment(){
        if(!slotsEquipped.get(1))
            return;
        equipmentSlot.remove(currentSlot);
        slotsEquipped.set(currentSlot,false);
        currentSlot--;
    }

    public Integer getMaxSlots() {
        return maxSlots;
    }


}
