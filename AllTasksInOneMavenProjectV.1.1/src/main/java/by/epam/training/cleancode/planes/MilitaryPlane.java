package by.epam.training.cleancode.planes;

import by.epam.training.cleancode.models.MilitaryType;

public class MilitaryPlane extends Plane {

    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                        '}');
    }

    @Override
    public boolean equals(Object military) {
        if (this == military) return true;
        if (!(military instanceof MilitaryPlane)) return false;
        if (!super.equals(military)) return false;
        MilitaryPlane militaryPlane = (MilitaryPlane) military;
        return militaryType == militaryPlane.militaryType;
    }
}
