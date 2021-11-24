package com.gridnine.testing;


import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Flight> flights = FlightBuilder.createFlights();
        for(Flight flight:flights){
            System.out.println("Not Filtered: "+flight);
        }
        System.out.println("************************************************");
      for(Flight flight:flights){
          if(new TimeOnLandFilter().validation(flight)){
             System.out.println("TimeOnLandFiltered:"+flight);
         }
      }
        System.out.println("************************************************");
      for (Flight flight:flights){
          if(new IncorrectFlight().validation(flight)){
              System.out.println("IncorrectFlight Filtered: "+ flight);
          }
      }
        System.out.println("************************************************");
        for (Flight flight:flights){
            if(new MissedFlightFilter().validation(flight)){
                System.out.println("MissedFlight Filtered: "+ flight);
            }
        }

}
}
