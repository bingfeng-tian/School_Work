//光敏電阻搭配LED亮滅
//20240507

const byte analogPin = A0;
const byte LED = 2;

void setup() {
  // put your setup code here, to run once:
  pinMode(LED,OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  int value;
  value = analogRead(analogPin);
  Serial.println(value);
  if(value>350){
    digitalWrite(LED,HIGH);
  }   else{
    digitalWrite(LED,LOW);
  }
  delay(500);
}
