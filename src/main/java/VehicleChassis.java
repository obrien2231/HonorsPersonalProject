public class VehicleChassis implements Chassis{

  public String chassisName;


  public VehicleChassis(){
    this.chassisName = Chassis.CHASSIS;

  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  public Chassis getChassisType() {
    return this;
  }

  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  public String toString() {
    return "Chassis Name " + chassisName;
  }

  public static void main(String[] args) {
    Chassis newCar1 = new VehicleChassis();
    Chassis newCar2 = new VehicleChassis("unibody");
  }
}
