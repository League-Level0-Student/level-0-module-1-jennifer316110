PImage pepperoni;
void setup() {
    size(500, 500);
    fill(#DEB35E);
    ellipse(250,230,450,450);
    
  void draw() {  
    fill(#CE0A21);
    ellipse(250,230,430,430);
    fill(#FFFFFF);
    ellipse(250,230,400,400);
    
    
    pepperoni = loadImage("ppronni.png");
    
}
void draw() {
    image(pepperoni,200,200, 100, 200);
}
}
