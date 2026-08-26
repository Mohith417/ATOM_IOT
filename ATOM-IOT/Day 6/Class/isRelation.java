package Day6;

public class isRelation {
    public static void main() {
//        Phone p1  = new Phone();
//        Sim s1 = new Sim();
//        JioSim j1 = new JioSim();
//        p1.call(j1);
       Sim s1 = new JioSim();

    }
}
class Phone{
    public void call(Sim s){
        s.connect();
      System.out.println("Calling....");
    }
    public void videoCall(JioSim s){
        s.dataConnect();
        System.out.println("Video calling....");
    }
}
class Sim{
    public void connect(){
        System.out.println("Connecting....");

    }
}
class JioSim extends Sim{
    public void dataConnect(){
        System.out.println("Internet Connected....");
    }
}
