void setup() {
    Serial.begin(115200);
    pinMode(2,OUTPUT);
}

void loop() {
    char inp;
    if(Serial.available())
    {
      inp =Serial.read(); 
      if(inp=='0') {
        Serial.println("LED燈熄滅");
        digitalWrite(2,LOW);
      }
      else if(inp=='1') {
        Serial.println("LED燈點亮");
        digitalWrite(2,HIGH);
      }
      delay(500);
    }
}