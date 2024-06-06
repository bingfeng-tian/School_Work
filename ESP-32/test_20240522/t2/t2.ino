#include <LiquidCrystal_I2C.h>

#define I2C_ADDR 0x27
#define LCD_COLUMNS 16
#define LCD_LINES 2

LiquidCrystal_I2C lcd(I2C_ADDR,LCD_COLUMNS,LCD_LINES);
void setup() {
  lcd.init();
  lcd.backlight();

  lcd.setCursor(0,0);
  lcd.print(char(206));
  lcd.print(char(223));
  lcd.print(char(184));
  lcd.print(char(188));
  lcd.print(char(196));
  lcd.print(char(211));
  lcd.print(char(191));
  lcd.print(char(189));
  lcd.print(char(192));
  lcd.print(char(176));
  lcd.print(" GO");
}

void loop() {
  // put your main code here, to run repeatedly:

}
