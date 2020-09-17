import java.util.Date;

public interface Engine {
  public Engine setEngineCylinders(int engineCylinders);
  public Engine setEngineManufacturedDate(Date date);
  public Engine setEngineManufacturer(String manufacturer);
  public Engine setEngineMake(String engineMake);
  public Engine setEngineModel(String engineModel);
  public Engine setDriveTrain(String driveTrain);
  public Engine setEngineType(String fuel);
}
