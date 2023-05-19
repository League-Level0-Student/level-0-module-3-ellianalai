
void setup() {
 
  // set the size of your sketch
  size(800,800);
}

void draw() {
  for (int i = 0; i <10;i++){
    if (i%2 == 1){
      fill(#FF0000);
  }
  else{
    fill(#000000);
  }
    ellipse(400,400,width-i*80,height-i*80);
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
