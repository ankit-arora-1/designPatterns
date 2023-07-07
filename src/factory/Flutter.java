package factory;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.getUIFactoryFromPlatform(supportedPlatforms);
    }
}
