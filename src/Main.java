import MotorLandVehicles.Car;
import MotorVehicles.Engine;
import MotorVehicles.FuelType;
import MotorVehicles.MotorVehicle;
import MotorWaterVehicles.Sail;
import MotorWaterVehicles.Yacht;

public class Main {
    public static void main(String[] args){
        Engine engineCar=new Engine(1111,2222, FuelType.LPG);
        Engine engineTekne=new Engine(12500,25041, FuelType.BENZIN);
        Engine engineYat=new Engine(12500,25041, FuelType.HIDROJEN);
        System.out.println("-----------------------------------------");
        Car car=new Car("Golf",1999,engineCar,"20abd111",4,4);
        System.out.println(car);

        System.out.println("-----------------------------------------");
        Sail sail=new Sail("tekne",2022,engineTekne,"20tekne20",220,360,
                2000000,"aliminyum",3,"yelkenli");
        System.out.println(sail);

        System.out.println("-----------------------------------------");
        Yacht yacht=new Yacht("Yat",2012,engineYat,"20yat20",940,980,
                555000,"titanyum",7,18,"suzuki");
        System.out.println(yacht);
        
        System.out.println("-----------------------------------------");

    }
}
