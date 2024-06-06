int segmentPins[] = {13,12,14,27,26,25,33,32};
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
  for(int i = 0;i < 8;i++)
  {
    digitalWrite(segmentPins[i], (seg_7[num] << i & 0x80) >> 7);
  }
}

void setup()
{
  Serial.begin(115200);
  for(int gpio = 0;gpio < 8;gpio++){
    pinMode(segmentPins[gpio],OUTPUT);
  }
}
void loop()
{
  int rand_num = random(0,10);
  display_seg(rand_num);
  delay(500);
}