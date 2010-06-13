package mnist.tools.test;

import java.io.IOException;

import mnist.tools.MnistManager;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        testParser();
    }

    public static void testParser() throws IOException {
        MnistManager m = new MnistManager("/home/apankov/Desktop/Uni/IAS/assignments/NN/t10k-images.idx3-ubyte",
                "/home/apankov/Desktop/Uni/IAS/assignments/NN/t10k-labels.idx1-ubyte");
        m.copyToFile(10, "/home/apankov/Desktop/Uni/IAS/assignments/NN/t10k-images-small.idx3-ubyte",
                "/home/apankov/Desktop/Uni/IAS/assignments/NN/t10k-labels.idx1-ubyte");

        /*m.setCurrent(740);
        int[][] image = m.readImage();
        System.out.println("Label:" + m.readLabel());

        System.out.println("Image length: " + m.getImages().getEntryLength());
        System.out.println("Current Index: " + m.getImages().getCurrentIndex());

        System.out.println("Label length: " + m.getLabels().getEntryLength());
        System.out.println("Label Index: " + m.getLabels().getCurrentIndex());

        MnistManager.writeImageToPpm(image, "/home/apankov/Desktop/Uni/IAS/assignments/NN/10000.ppm");*/
    }

}
