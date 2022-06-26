package DependencyInjection;

public class Girl {
    private ClotheInterface clotheInterface;

    public Girl(ClotheInterface anything) {
        clotheInterface = anything;
    }

    public void wear() {
        clotheInterface.wear();
    }
}
