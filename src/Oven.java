public class Oven {
    private void periodicMaintenance() {}
    private double Ovenlength;
    private double Ovenheight;
    private double Ovendepth;
    private String OvenConstructor_Name;
    private String OvenPackage_Name;
    private String OvenPackage_Type;
    private double OvenEnergy_Consume;

    public Oven(double Ovenlength,
                  double Ovenheight,
                  double Ovendepth,
                  String OvenConstructor_Name,
                  String OvenPackage_Name,
                  String OvenPackage_Type,
                  double OvenEnergy_Consume
    ) {
        this.Ovenlength= Ovenlength;
        this.Ovenheight= Ovenheight;
        this.Ovendepth= Ovendepth;
        this.OvenConstructor_Name= OvenConstructor_Name;
        this.OvenPackage_Type= OvenPackage_Type;
        this.OvenPackage_Name= OvenPackage_Name;
        this.OvenEnergy_Consume=OvenEnergy_Consume;
    }
    public void setOvenlength(double newOvenlenght){
        Ovenlength = newOvenlenght;
    }
    public void setFridgeheight(double newOvenheight){
        Ovenheight= newOvenheight;
    }
    public void setOvendepth(double newOvendepth){
        Ovendepth= newOvendepth;
    }
    public void setOvenConstructor_Name(String newOvenConstructor_Name){
        OvenConstructor_Name= newOvenConstructor_Name;
    }

    public void setOvenPackage_Type(String newOvenPackage_Type) {
        OvenPackage_Type = newOvenPackage_Type;
    }

    public void setOvenPackage_Name(String newOvenPackage_Name) {
        OvenPackage_Name = newOvenPackage_Name;
    }

    public void setOvenEnergy_Consume(double newOvenEnergy_Consume) {
        OvenEnergy_Consume = newOvenEnergy_Consume;
    }
}