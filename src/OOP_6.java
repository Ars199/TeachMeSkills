public class OOP_6 {
    private OOP_6_Lightswitcher lightswitch;// есть свво выключатель,
    private String name;//стринг свво

    public Room (String name) {
        this.name = name;
    }

    public LightSwitch getLightswitch() {
        return lightswitch;
    }

    public void setLightswitch(LightSwitch lightswitch) {
        this.lightswitch = lightswitch;
    }

    public void toSwitch() {
        lightswitch.toSwitch();
    }
}

