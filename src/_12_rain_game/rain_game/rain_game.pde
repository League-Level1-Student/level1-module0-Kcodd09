int y=0;
int randomNum  = 300;
int score = 0; 
void setup() {
  size(600, 600);
  
  
  
}
void draw() {
  background(167, 161, 161);
  fill(182, 202, 237); 
  stroke(3, 97, 255);
  ellipse(randomNum, 2*y++, 10, 20);
  fill(116, 118, 121);
  stroke(0, 0, 0);
  rect(mouseX, 550, 40, 50);
  if(y > 292.5) {
    y = 15;
    randomNum = (int) random(600);
    fill(182, 202, 237); 
    stroke(3, 97, 255);
    ellipse(randomNum, 2*y++, 10, 20); 
  }
  checkCatch(mouseX);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  
}
void checkCatch(int x) {
  if(x > mouseX && x<mouseX+40) {
    score++;
  }
  else {
    score--;
  }
  if(score<0) {
    score = 0;
  }
  println("Your score is now " + score);
}
