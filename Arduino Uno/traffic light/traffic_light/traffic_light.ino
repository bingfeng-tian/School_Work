//紅綠燈 traffic light
//20240507

//紅綠燈控制
int redled =10; 
int yellowled =7;
int greenled =4;
void setup()
{
  pinMode(redled, OUTPUT);
  pinMode(yellowled, OUTPUT);
  pinMode(greenled, OUTPUT);
}
void loop()
{
  digitalWrite(redled, HIGH);
  delay(2250);
  digitalWrite(redled, LOW);
  digitalWrite(greenled, HIGH);
  delay(1750);
  digitalWrite(greenled, LOW);  
  digitalWrite(yellowled, HIGH);
  delay(1000);
  digitalWrite(yellowled, LOW);

}