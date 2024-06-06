int ledArray[5]={12,14,27,26,25};

void setup() {
  // put your setup code here, to run once:
  pinMode(12,OUTPUT);
  pinMode(14,OUTPUT);
  pinMode(27,OUTPUT);
  pinMode(26,OUTPUT);
  pinMode(25,OUTPUT);
  // Serial.begin(9600);
  // ledcSetup(0,5000,8);
  // ledcAttachPin(12,0);
}

void loop() {
  for(int i = 0;i<5;i++){
    digitalWrite(ledArray[i],HIGH);
    delay(250);
    digitalWrite(ledArray[i],LOW);
    delay(250);
  }
  for(int i = 4;i>=0;i--){
    digitalWrite(ledArray[i],HIGH);
    delay(250);
    digitalWrite(ledArray[i],LOW);
    delay(250);
  }
}

/*
  // put your main code here, to run repeatedly:
 
  for(int i = 0;i<=255;i+=1){
    ledcWrite(0,i);
    delay(10);
  }
  for(int i = 255;i>=0;i-=1){
    ledcWrite(0,i);
    delay(10);
  }

void loop(){
  if(i>255 || i<0)
    !plus;


  ledcWrite(0,i);
  delay(10);

  if(plus)
    i++;
  else
    i--;
  

}

*/
