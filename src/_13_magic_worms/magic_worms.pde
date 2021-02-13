int randomNum = 300;
void setup() {
  size(600, 600);
  background(0, 0, 0);
}
void draw() {
  for(int i = 0; i<300; i++) {
    fill(255, 0, 0);
    ellipse(0+2*i, 0+2*i, 10, 10);
  }
}
