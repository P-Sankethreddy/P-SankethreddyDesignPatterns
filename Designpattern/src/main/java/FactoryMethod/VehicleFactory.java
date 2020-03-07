package FactoryMethod;
//import FactoryInterfaces.FourWheeler;
//
//import FactoryInterfaces.TwoWheeler;
//
//import FactoryInterfaces.ThreeWheeler;
//
//import FactoryInterfaces.Vehicle;

import FactoryInterfaces.*;
public class VehicleFactory
{
	
public static void main(String args[])
{
	Vehicle obj=new FourWheeler();
	obj.VehicleType();

}
}
