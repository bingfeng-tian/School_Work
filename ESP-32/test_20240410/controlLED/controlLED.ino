int lightPin[5] = {12,14,27,26,25};

void control_LED(int num) {
  for(int i=0;i<5;i++) {
    if(i<=num){
      digitalWrite(lightPin[i],HIGH);
    }
    else {
      digitalWrite(lightPin[i],LOW);
    }
  }
}

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(13,INPUT);

  pinMode(12,OUTPUT); //藍
  pinMode(14,OUTPUT); //綠
  pinMode(27,OUTPUT); //黃
  pinMode(26,OUTPUT); //紅
  pinMode(25,OUTPUT); //白
}

void loop() {
  // put your main code here, to run repeatedly:
  int data = analogRead(13);
  data = map(data,500,4095,0,5);
  control_LED(data);
  // switch(data){
  //   case 0: digitalWrite(12,HIGH);
  //   digitalWrite(14,LOW);
  //   digitalWrite(27,LOW);
  //   digitalWrite(26,LOW);
  //   digitalWrite(25,LOW);
  //   break;
  //   case 1: digitalWrite(12,HIGH);digitalWrite(14,HIGH);digitalWrite(27,LOW);
  //   digitalWrite(26,LOW);
  //   digitalWrite(25,LOW);
  //   break;
  //   case 2:digitalWrite(12,HIGH);digitalWrite(14,HIGH);digitalWrite(27,HIGH);digitalWrite(26,LOW);
  //   digitalWrite(25,LOW);
  //   break;
  //   case 3: digitalWrite(12,HIGH);
  //   digitalWrite(14,HIGH);
  //   digitalWrite(27,HIGH);
  //   digitalWrite(26,HIGH);
  //   digitalWrite(25,LOW);
  //   break;
  //   default: digitalWrite(12,HIGH);
  //   digitalWrite(14,HIGH);
  //   digitalWrite(27,HIGH);
  //   digitalWrite(26,HIGH);
  //   digitalWrite(25,HIGH);
  //   break;
  // }
  Serial.println(data);
  delay(500);
}
