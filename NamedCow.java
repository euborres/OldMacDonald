class NamedCow extends Cow
{
  private String myName;
  public NamedCow(String type,String name,String Sound){
    myName = name;
  }
  public String getName(){return myName;}

}
