import processing.core.PApplet;

public class Sketch extends PApplet {
	
	/*
  * Description: Drawing different variations of squares in each quadrant
  * Author: 
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 3; intRow < 300; intRow += 9){
      for(int intColumn = 0; intColumn < 300; intColumn += 9){
        intX = 3 + intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 300; intRow < 599; intRow += 20){
      for(int intColumn = 0; intColumn < 299; intColumn += 10){
        intX = 1 + intRow;  
        intY = 300 + 1 + intColumn; 
        
        if(intX % 2 != 0){
          fill(255); /*white*/
          noStroke();
          rect(intX, intY, 5, 5);
        }else{
          fill(0); // black
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 600; intRow < 900; intRow += 9){
      for(int intColumn = 300; intColumn < 600; intColumn += 9){
        if(intY % 2 == 0){
          fill(255);// white
          noStroke();
          rect(intX, intY, 5, 5);
        }else{
          fill(0);// black
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }

  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;
    
   for(int intRow = 0; intRow < 300; intRow+=10){
      for(int intColumn = 0; intColumn <= 300; intColumn+=10){
        if(intRow % 4 == 0 && intColumn % 4 == 0){
        intX = 900 + 3 + intRow;  
        intY = 300 + 3 + intColumn; 
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
        }
        else {
            intX = 900 + 3 + intRow;  
            intY = 300 + 3 + intColumn; 
            fill(0);
            noStroke();
            rect(intX, intY, 5, 5);

        }
        
        }
      }
    }
  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 297; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow < 300; intRow += 10){ 
        intX = 0 + 3 + intRow;
        intY = 3 + intColumn;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);         
      }
    }

  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;
    for(int intRow = 0; intRow < 300; intRow += 10){  
       for(int intColumn = 290; intColumn >= intRow; intColumn -= 10){  
        intX = 3 + intRow;         
        intY = 297 - 3 - intColumn;
         fill(255);
         noStroke();
         rect(intX, intY, 5, 5);
        }
      }
       

  }

   public void draw_section7(){
    int intX;
    int intY;

    for(int intColumn = 0; intColumn < 300; intColumn += 10){
       for(int intRow = 300 - intColumn; intRow >= 0; intRow -= 10){
        intX = 600 + 3 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
       } 
    }
  }
  
  public void draw_section8(){
    int intX;
    int intY;
    
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 10){
        intX = 900 + 3 + intRow;
        intY = 3 + intColumn;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);          
       }
     }
    }

}