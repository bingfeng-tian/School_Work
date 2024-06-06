#include <LiquidCrystal_I2C.h>

#define I2C_ADDR 0x27
#define LCD_COLUMNS 16
#define LCD_LINES 2

LiquidCrystal_I2C lcd(I2C_ADDR,LCD_COLUMNS,LCD_LINES);

byte name1[8] = {
  B00000,
  B00000,
  B01110,
  B00100,
  B01110,
  B00100,
  B11111,
  B00000
};

byte name2[8] = {
  B00000,
  B00000,
  B00100,
  B00100,
  B10101,
  B10101,
  B00100,
  B01100
};

byte name3_1[8] = {
  B00000,
  B00111,
  B00101,
  B00111,
  B00101,
  B00111,
  B00000,
  B00000
};

byte name3_2[8] = {
  B00000,
  B01110,
  B01010,
  B01110,
  B01010,
  B01110,
  B01010,
  B00010
};

void setup() {
  lcd.init();
  lcd.backlight();
  lcd.createChar(0, name1);
  lcd.createChar(1, name2);
  lcd.createChar(2, name3_1);
  lcd.createChar(3, name3_2);
  lcd.clear();
  lcd.print("Custom Character");
}

void loop() {
  lcd.setCursor(0, 1);
  lcd.write(byte(0));
  lcd.setCursor(2, 1);
  lcd.write(byte(1));
  lcd.setCursor(4, 1);
  lcd.write(byte(2));
  lcd.setCursor(6, 1);
  lcd.write(byte(3));
}