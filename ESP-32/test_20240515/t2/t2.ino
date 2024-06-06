int btn = 35, btn_Last = 0;
int segmentPins[] = { 13, 12, 14, 27, 26, 25, 33, 32 };
const byte seg_7[10] = {
  B01111110,
  B00110000,
  B01101101,
  B01111001,
  B00110011,
  B01011011,
  B01011111,
  B01110000,
  B01111111,
  B01110011
};

void display_seg(int num) {
  for (int i = 0; i < 8; i++) {
    digitalWrite(segmentPins[i], (seg_7[num] << i & 0x80) >> 7);
  }
}

void setup() {
  Serial.begin(115200);
  Serial.println("Ready");
  pinMode(btn, INPUT_PULLUP);
  for (int gpio = 0; gpio < 8; gpio++) {
    pinMode(segmentPins[gpio], OUTPUT);
  }
}
void loop() {
  int loopMillis = millis();
  if(digitalRead(btn)==HIGH) {
    if(loopMillis-btn_Last>50) {
      int rand = random(0,10);
      Serial.println(rand);
      display_seg(rand);
    }
    btn_Last = loopMillis;
  }
}