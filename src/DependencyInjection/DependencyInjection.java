package DependencyInjection;

public class DependencyInjection {
    public static void main(String[] args) {
        ClotheInterface clotheInterface = new Skirt();
        Girl girl = new Girl(clotheInterface);
        girl.wear();
    }
}


