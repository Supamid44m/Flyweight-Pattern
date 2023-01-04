public class Player implements Basketball {
    
    private String position;
    

    public Player(String position) {
        this.position = position;
    }

   
    public void setPosition(String position){
      this.position=position;
        
    }

    @Override
    public void showPosition() {
        System.out.println("Player:"+position);
        
    }
    
    
}
