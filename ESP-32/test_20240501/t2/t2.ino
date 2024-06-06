int btn = 4;
void setup() {
  Serial.begin(115200);
  Serial.println("Hello ESP32!");
  pinMode(btn, INPUT_PULLDOWN);

}

void loop() {
  int btn_value = digitalRead(4);
  Serial.println(btn_value);
  delay(500);

}
