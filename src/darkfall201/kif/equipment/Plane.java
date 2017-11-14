package darkfall201.kif.equipment;

import java.util.ArrayList;

public class Plane extends Equipment {

    private String type;

    private Double antiAir;
    private Double torpedo;
    private Double bombing;
    private Double accuracy;
    private Double asw;
    private Double los;
    private Double evasion;

    private Integer proficiency;

    public String getType() {
        return type;
    }

    public Double getAntiAir() {
        return antiAir;
    }

    public Double getTorpedo() {
        return torpedo;
    }

    public Double getBombing() {
        return bombing;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public Double getAsw() {
        return asw;
    }

    public Double getLos() {
        return los;
    }

    public Double getEvasion() {
        return evasion;
    }

    public Integer getProficiency() {
        return proficiency;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAntiAir(Double antiAir) {
        this.antiAir = antiAir;
    }

    public void setTorpedo(Double torpedo) {
        this.torpedo = torpedo;
    }

    public void setBombing(Double bombing) {
        this.bombing = bombing;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public void setAsw(Double asw) {
        this.asw = asw;
    }

    public void setLos(Double los) {
        this.los = los;
    }

    public void setEvasion(Double evasion) {
        this.evasion = evasion;
    }

    public void setProficiency(Integer proficiency) {
        this.proficiency = proficiency;
    }

    public double calculateProficiencyFighterPower(){
        if (type.equals("fighter")){
            switch (proficiency){
                case 0:return 0;
                case 1:return 1;
                case 2:return 3;
                case 3:return 7;
                case 4:return 11;
                case 5:return 16;
                case 6:return 16;
                case 7:return 25;
            }
        }
        if (type.equals("seabomber")){
            switch (proficiency){
                case 0:return 0;
                case 1:return 1;
                case 2:return 2;
                case 3:return 3;
                case 4:return 3;
                case 5:return 5;
                case 6:return 5;
                case 7:return 9;
            }
        }
        if (type.equals("bomber")){
            switch (proficiency){
                case 0:return 0;
                case 1:return 1;
                case 2:return 1;
                case 3:return 2;
                case 4:return 2;
                case 5:return 2;
                case 6:return 2;
                case 7:return 3;
            }
        }
        return 0;
    }

    public static final class PlaneBuilder {
        protected String name="no-name";
        private String type="no-type";
        private Double antiAir=0.0;
        private Double torpedo=0.0;
        private Double bombing=0.0;
        private Double accuracy=0.0;
        private Double asw=0.0;
        private Double los=0.0;
        private Double evasion=0.0;
        private Integer proficiency=0;

        private PlaneBuilder() {
        }

        public static PlaneBuilder aPlane() {
            return new PlaneBuilder();
        }

        public PlaneBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder type(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder antiAir(Double antiAir) {
            this.antiAir = antiAir;
            return this;
        }

        public PlaneBuilder torpedo(Double torpedo) {
            this.torpedo = torpedo;
            return this;
        }

        public PlaneBuilder bombing(Double bombing) {
            this.bombing = bombing;
            return this;
        }

        public PlaneBuilder accuracy(Double accuracy) {
            this.accuracy = accuracy;
            return this;
        }

        public PlaneBuilder asw(Double asw) {
            this.asw = asw;
            return this;
        }

        public PlaneBuilder los(Double los) {
            this.los = los;
            return this;
        }

        public PlaneBuilder evasion(Double evasion) {
            this.evasion = evasion;
            return this;
        }

        public PlaneBuilder proficiency(Integer proficiency) {
            this.proficiency = proficiency;
            return this;
        }

        public Plane build() {
            Plane plane = new Plane();
            plane.antiAir = this.antiAir;
            plane.asw = this.asw;
            plane.evasion = this.evasion;
            plane.torpedo = this.torpedo;
            plane.type = this.type;
            plane.bombing = this.bombing;
            plane.accuracy = this.accuracy;
            plane.name = this.name;
            plane.los = this.los;
            plane.proficiency = this.proficiency;
            return plane;
        }

        public PlaneBuilder(String name) {
            this.name = name;
        }
    }
}
