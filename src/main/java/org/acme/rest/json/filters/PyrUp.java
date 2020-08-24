package org.acme.rest.json.filters;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class PyrUp implements Filter{

    @Override
    public Mat process(Mat src) {
        Mat dst = src;
        Imgproc.pyrUp(src, dst);
        return dst;
    }
}
