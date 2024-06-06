#include "HomeSpan.h" 
#include "DEV_LED.h"     
#include "DEV_DHT.h"

void setup() {

  
  Serial.begin(115200);

  homeSpan.begin(Category::Bridges,"HomeSpan Bridge");

  new SpanAccessory();  
    new Service::AccessoryInformation();
      new Characteristic::Identify();

  new SpanAccessory();                                                          
    new Service::AccessoryInformation();
      new Characteristic::Identify();            
      new Characteristic::Name("Simple LED");
    new DEV_LED(13);                                                               // Create an On/Off LED attached to pin 16

  new SpanAccessory();                                                          
    new Service::AccessoryInformation();    
      new Characteristic::Identify();               
      new Characteristic::Name("PWM LED"); 
    new DEV_DimmableLED(32);                                                       // Create a Dimmable (PWM-driven) LED using attached to pin 17

  new SpanAccessory();                                                          
    new Service::AccessoryInformation();    
      new Characteristic::Identify();               
      new Characteristic::Name("RGB LED"); 
    new DEV_RgbLED(25,26,27);                                                   // Create an RGB LED attached to pins 32,22,23 (for R, G, and B LED anodes)
  
  new SpanAccessory();                                                          
    new Service::AccessoryInformation();    
      new Characteristic::Identify();               
      new Characteristic::Name("Temp Sensor"); 
    new DEV_TempSensor(); 

  new SpanAccessory();                                                          
    new Service::AccessoryInformation();    
      new Characteristic::Identify();               
      new Characteristic::Name("Humidity Sensor"); 
    new DEV_HumSensor();
} // end of setup()

//////////////////////////////////////

void loop(){
  
  homeSpan.poll();
  
} // end of loop()
