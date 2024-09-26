package model;

public class Produto extends Item{
    private boolean industrial;

    public void setIndustrial(boolean industrial) {
        this.industrial = industrial;
    }

    public boolean isIndustrial() {
        return industrial;
    }

}
