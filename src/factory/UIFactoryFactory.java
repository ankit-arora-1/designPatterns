package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryFromPlatform(SupportedPlatforms supportedPlatforms) {
        if(supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndroidUIFactory();
        } else if(supportedPlatforms == SupportedPlatforms.IOS) {
            return new IosUIFactory();
        }

        return null;
    }
}
