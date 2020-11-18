public class AirCondition {
    private void periodicMaintenance() {}
    private double AirConditionlength;
    private double AirConditionheight;
    private double AirConditiondepth;
    private String AirConditionConstructor_Name;
    private String AirConditionPackage_Name;
    private String AirConditionPackage_Type;
    private double AirConditionEnergy_Consume;

    public AirCondition(double AirConditionlength,
                double AirConditionheight,
                double AirConditiondepth,
                String AirConditionConstructor_Name,
                String AirConditionPackage_Name,
                String AirConditionPackage_Type,
                double AirConditionEnergy_Consume
    ) {
        this.AirConditionlength= AirConditionlength;
        this.AirConditionheight= AirConditionheight;
        this.AirConditiondepth= AirConditiondepth;
        this.AirConditionConstructor_Name= AirConditionConstructor_Name;
        this.AirConditionPackage_Type= AirConditionPackage_Type;
        this.AirConditionPackage_Name= AirConditionPackage_Name;
        this.AirConditionEnergy_Consume= AirConditionEnergy_Consume;
    }
    public void setAirConditionlength(double newAirConditionlenght){
        AirConditionlength = newAirConditionlenght;
    }
    public void setAirConditionheight(double newAirConditionheight){
        AirConditionheight= newAirConditionheight;
    }
    public void setAirConditiondepth(double newAirConditiondepth){
        AirConditiondepth= newAirConditiondepth;
    }
    public void setOvenConstructor_Name(String newAirConditionConstructor_Name){
        AirConditionConstructor_Name= newAirConditionConstructor_Name;
    }

    public void setAirConditionPackage_Type(String newAirConditionPackage_Type) {
        AirConditionPackage_Type = newAirConditionPackage_Type;
    }

    public void setAirConditionPackage_Name(String newAirConditionPackage_Name) {
        AirConditionPackage_Name = newAirConditionPackage_Name;
    }

    public void setAirConditionEnergy_Consume(double newAirConditionEnergy_Consume) {
        AirConditionEnergy_Consume = newAirConditionEnergy_Consume;
    }
}

