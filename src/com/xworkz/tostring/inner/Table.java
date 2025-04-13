package com.xworkz.tostring.inner;

public class Table {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Table(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Table [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

    @Override
    public int hashCode() {
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Table table = (Table) obj;
        return propertyTwo == table.propertyTwo &&
                propertyThree == table.propertyThree &&
                propertyOne.equals(table.propertyOne);
    }

}
