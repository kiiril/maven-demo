import com.github.romankh3.image.comparison.ImageComparisonUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit testing for image comparison")
class ImageComparatorTest {
    private final ImageComparator imageComparator = new ImageComparator();

    @Test
    public void shouldConfirmImageNotTheSame() {
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");
        BufferedImage image2 = ImageComparisonUtil.readImageFromResources("image2.jpeg");

        boolean theSameImages = imageComparator.isTheSameImage(image1, image2);

        assertFalse(theSameImages);
    }

    @Test
    public void shouldConfirmImagesTheSame() {
        //given
        BufferedImage image1 = ImageComparisonUtil.readImageFromResources("image1.png");

        //when
        boolean theSameImages = imageComparator.isTheSameImage(image1, image1);

        //then
        assertTrue(theSameImages);
    }
}