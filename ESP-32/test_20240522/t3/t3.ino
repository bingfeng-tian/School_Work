#include <LiquidCrystal_I2C.h>
#include <Keypad.h>

const byte ROWS = 4;  // 列數(橫的)
const byte COLS = 4;  // 行數(直的)
//鍵盤上每一個按鍵的名稱
char keys[ROWS][COLS] = {
  { 'F', 'E', 'D', 'C' },
  { 'B', '3', '6', '9' },
  { 'A', '2', '5', '8' },
  { 'O', '1', '4', '7' }
};
byte rowPins[ROWS] = { 13, 12, 14, 27 };  //定義列的腳位
byte colPins[COLS] = { 26, 25, 33, 32 };  //定義行的腳位

byte colLcd = 0, rowLcd = 0;

//初始化鍵盤
Keypad keypad = Keypad(makeKeymap(keys), rowPins, colPins, ROWS, COLS);

#define I2C_ADDR 0x27
#define LCD_COLUMNS 16
#define LCD_LINES 2

LiquidCrystal_I2C lcd(I2C_ADDR, LCD_COLUMNS, LCD_LINES);
void setup() {
  Serial.begin(9600);
  Serial.println("Ready...");

  lcd.init();
  lcd.backlight();
}

void loop() {
  // put your main code here, to run repeatedly:
  char key = keypad.getKey();

  if (key != NO_KEY) {
    Serial.println(key);
    lcd.setCursor(colLcd, rowLcd);
    lcd.print(key);
    if (colLcd == 15){
        rowLcd = (rowLcd==0)?1:0;
        colLcd = 0;
      }
    else {
      colLcd++;
    }
  }

  delay(10);
}
