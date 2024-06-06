
#include <Adafruit_NeoPixel.h>
Adafruit_NeoPixel ring = Adafruit_NeoPixel(25,4);
void setup() {
  // put your setup code here, to run once:
  ring.begin();
  ring.setBrightness(255);
  ring.show();
}

void loop() {
  // put your main code here, to run repeatedly:
  colorWipe(255,0,0,50);
  colorWipe(255,128,0,50);
  colorWipe(255,255,0,50);
  colorWipe(0,255,0,50);
  colorWipe(0,255,255,50);
  colorWipe(0,0,255,50);
  colorWipe(255,0,255,50);

}

void colorWipe(byte r,byte g,byte b,int wait){
  for(unsigned i = 0;i < ring.numPixels();i++){
    ring.setPixelColor(i,r,g,b);
    ring.show();
    delay(wait);
  }
}
