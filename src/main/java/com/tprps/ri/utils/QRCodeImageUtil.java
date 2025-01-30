package com.tprps.ri.utils;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class QRCodeImageUtil {
    public static BufferedImage convertToImage(byte[] imageData) {
        try {
            return ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (IOException e) {
            throw new RuntimeException("Error converting byte array to image", e);
        }
    }
}
