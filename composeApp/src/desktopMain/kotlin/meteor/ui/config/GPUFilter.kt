package meteor.ui.config

import org.bytedeco.opencv.global.opencv_imgproc

enum class GPUFilter(var filter: Int) {
    AREA(opencv_imgproc.CV_INTER_AREA),
    LINEAR(opencv_imgproc.CV_INTER_LINEAR),
    CUBIC(opencv_imgproc.CV_INTER_CUBIC),
    LANCZOS4(opencv_imgproc.CV_INTER_LANCZOS4)
}