void setup() {
  size(600, 600);
  background(0, 0, 0);
}
void draw() {
  makeMagical();
  for(int i = 0; i<300; i++) {
    int randomNum = (int) random(600);
    fill(0, 0, 0);
    ellipse(getWormX(i), getWormY(i), 10, 10);
    if(mousePressed) {
      ellipse(getWormX(i), getWormY(i), 10, 10);
  }
  }
  
}
float frequency = .005;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 100, 200, 255, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
