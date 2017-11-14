package darkfall201.kif.ships;

import java.util.ArrayList;
import java.util.Arrays;

public class Carrier extends Ship{

    private String planeType;

    private ArrayList<Integer> slotsSize=new ArrayList<>(5);

    public String getPlaneType() {
        return planeType;
    }

    public ArrayList<Integer> getSlotsSize() {
        return slotsSize;
    }

    public static final class CarrierBuilder {
        protected String name;
        protected Integer maxSlots;
        private String planeType;
        private ArrayList<Integer> slotsSize=new ArrayList<>(Arrays.asList(0,0,0,0,0));
        private CarrierBuilder() {
        }

        public static CarrierBuilder aCarrier() {
            return new CarrierBuilder();
        }

        public CarrierBuilder planeType(String planeType) {
            this.planeType = planeType;
            return this;
        }

        public CarrierBuilder slotsSize(Integer slotSize1,Integer slotSize2,Integer slotSize3,Integer slotSize4) {
            this.slotsSize.set(1,slotSize1);
            this.slotsSize.set(2,slotSize2);
            this.slotsSize.set(3,slotSize3);
            this.slotsSize.set(4,slotSize4);
            return this;
        }

        public CarrierBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CarrierBuilder maxSlots(Integer maxSlots) {
            this.maxSlots = maxSlots;
            return this;
        }

        public Carrier build() {
            Carrier carrier = new Carrier();
            carrier.maxSlots = this.maxSlots;
            carrier.slotsSize = this.slotsSize;
            carrier.planeType = this.planeType;
            carrier.name = this.name;
            return carrier;
        }
    }
}
