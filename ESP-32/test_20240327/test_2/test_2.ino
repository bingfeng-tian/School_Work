const int pin_R = 15;
const int pin_G = 16;
const int pin_B = 17;
#define FADESPEED 5

void setup() {
  pinMode(pin_R,OUTPUT);  //RED
  pinMode(pin_G,OUTPUT);  //GREEN
  pinMode(pin_B,OUTPUT);  //BLUE
  analogWrite(pin_R, 0);
  analogWrite(pin_G, 0);
  analogWrite(pin_B, 0);
}

//黃->白->藍
void loop() {
  int r,g,b,y;
  analogWrite(pin_B, 0);
  // 亮黃
  for(y=0;y<256;y++) {
    analogWrite(pin_R, y);
    analogWrite(pin_G, y);
    delay(FADESPEED);
  }
  //亮綠
  for(g=0;g<256;g++) {
    analogWrite(pin_B, g);
    delay(FADESPEED);
  }
  //亮紅
  for(b=255;b>=0;b--) {
    analogWrite(pin_G, b);
    analogWrite(pin_R, b);
    delay(FADESPEED);
  }
}
