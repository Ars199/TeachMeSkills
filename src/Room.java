class Room {  // OOP_6_Door
    public static void main(String[] args) {
        Room room = new Room ("b");// создаем комнату
        LightSwitch lightswitch = new LightSwitch ("rus");//создаем выключаетель
        LightSwitch lightSwitch1 = new LightSwitch ("eng");
        room.setLightSwitch (lightswitch);//
        LightSwitch myLightSwitch = room.getLightSwitch();
        System.out.println(myLightSwitch.getName());
    }
}
