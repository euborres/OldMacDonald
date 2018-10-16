class Chick implements Animal
{     
  private String myType;
  private String mySound;
  public Chick(String type, String sound){
   myType = type;
   mySound = sound;
  }
  public Chick(){
   myType = "unknown";
   mySound = "unknown";
  }
  public Chick(String type, String sound, String sound2){
    myType = type;
    int random = (int)(Math.random() * 2);
    if(random < 1){
       mySound = sound; 
    }
    else{
        mySound = sound2;
    }
  }
  public String getSound(){return mySound;}
  public String getType(){return myType;}
}
