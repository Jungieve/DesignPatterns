package DesignPatterns.Creational.FactoryMethod;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class JpegReader implements ImageReader{
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        this.decodedImage = new DecodedImage(image);
    }

    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
