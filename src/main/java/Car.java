import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getInteriorFeatures() {
    String featuresListed = "";
    if(feature[0] != null){
    for (int k = 0; k < feature.length; k++) {
      if(feature[k] instanceof InteriorFeature){
      if (featuresListed.length() == 0) {
        featuresListed += "\n" + this.feature[k];
      } else {
        featuresListed += this.feature[k];
      }
    }}
    }else {
      featuresListed += "\n" + "Interior [No Interior Features]"+
      "\n"+ "Exterior [No Exterior Features]"+"\n";
    }
    return featuresListed;
  }

  public String getExteriorFeatures() {
    String featuresListed = "";
    if(feature[0] != null){
      for (int k = 0; k < feature.length; k++) {
        if(feature[k] instanceof ExteriorFeature){
          if (featuresListed.length() == 0) {
            featuresListed += this.feature[k];
          } else {
            featuresListed += this.feature[k];
          }
        }
      }
    }
    return featuresListed;
  }


    @Override
    public String toString () {
      return super.toString() +
          "Features : " +
          getInteriorFeatures() +
          getExteriorFeatures() +
          "Car Axle : " + carAxle;
    }
  }

