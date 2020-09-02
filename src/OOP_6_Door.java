import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class OOP_6_Door {
    public static void main(String[] args) {
    Room room = new Room(name: "b");// создаем комнату
    Lightswitch lightswitch = new Lightswitch(name: rus);//создаем выключаетель
         Lightswitch lightswitch1 = new Lightswitch(name: en);
    room.setLightswitch(lightswitch);//
    Lightswitch mylightswitch = room.getLightswitch();
         System.out.println(myLightswitch.getName());
    }

}
