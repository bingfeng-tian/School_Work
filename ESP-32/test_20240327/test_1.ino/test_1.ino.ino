void setup() {
  // put your setup code here, to run once:
  pinMode(15,OUTPUT);  //RED
  pinMode(16,OUTPUT);  //GREEN
  pinMode(17,OUTPUT);  //BLUE
}

void loop() {
  // put your main code here, to run repeatedly:
    digitalWrite(15,HIGH);  //RED              //紫色
    digitalWrite(16,LOW);  //GREEN
    digitalWrite(17,HIGH);  //BLUE
    delay(2000);  

    digitalWrite(15,LOW);  //RED               //青色
    digitalWrite(16,HIGH);  //GREEN
    digitalWrite(17,HIGH);  //BLUE
    delay(2000);

    digitalWrite(15,HIGH);  //RED              //黃
    digitalWrite(16,HIGH);  //GREEN            
    digitalWrite(17,LOW);  //BLUE
    delay(2000);
    
    digitalWrite(15,HIGH);  //RED              //白色
    digitalWrite(16,HIGH);  //GREEN
    digitalWrite(17,HIGH);  //BLUE
    delay(2000);
}
