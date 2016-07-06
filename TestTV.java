public class TestTV 
{
   public static void main(String[] args) 
   {
      TV tv1 = new TV(); 
      tv1.turnOn(); 
      tv1.setChannel(30); 
      tv1.setVolume(3);
      
      TV tv2 = new TV(); 
      tv2.turnOn(); 
      tv2.channelUp(); 
      tv2.channelUp(); 
      tv2.volumeUp();
      
      TV tv3 = new TV();
      tv3.turnOn();
      System.out.println("Is tv3 on? : " + tv3.on);
      tv3.channelUp(); 
      tv3.channelUp();
      tv3.channelDown();
      System.out.println("The tv3 channel is : " + tv3.channel);
      tv3.volumeUp();
      tv3.volumeUp();
      tv3.volumeUp();
      tv3.volumeUp();
      System.out.println("The tv3 volume is : " + tv3.volumeLevel);
      tv3.turnOff();
      System.out.println("Is tv3 on? : " + tv3.on);
      
      
      System.out.println("\ntv1's channel is " + tv1.channel 
         + " and volume level is " + tv1.volumeLevel);
      System.out.println("tv2's channel is " + tv2.channel 
         + " and volume level is " + tv2.volumeLevel);
   }
}