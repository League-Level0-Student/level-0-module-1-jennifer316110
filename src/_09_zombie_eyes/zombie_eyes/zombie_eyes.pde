
void setup() {
  PImage face = loadImage("face.jpg");
  size(700,525);
  face.resize(width, height);
  image(face, 0, 0);
 
}
void draw() {
  println(mouseX + "   " + mouseY);
  ellipse(206, 170, 50, 50);
  fill(mouseX, 105, mouseY);
  ellipse(311, 36, 50, 50);
}
