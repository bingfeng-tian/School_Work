int r_pin =11;
int g_pin =12;
int b_pin =13;

void setup() {
  // put your setup code here, to run once:
  pinMode(r_pin,OUTPUT);
  pinMode(g_pin,OUTPUT);
  pinMode(b_pin,OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  for(int R=0;R<256;R+=15){
    for(int G=0;G<256;G+=10){
      for(int B=0;B<256;B+=5){
        setColor(R,G,B);
        delay(5);
      }
    }
  }
}

void setColor(int r, int g, int b){
  digitalWrite(r_pin,r);
  digitalWrite(g_pin,g);
  digitalWrite(b_pin,b);
}