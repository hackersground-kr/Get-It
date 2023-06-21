package kr.hackerground.getit.deps.global.common.imageStore;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Image {
    String originalImageName;
    String storeImageName;
    String imagePath;

    public static Image newDefaultImage() {
        return new Image("default.png", "default.png", "https://hg3498-app.azurewebsites.net/resources/static/images/default.png");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return originalImageName.equals(image.originalImageName) && storeImageName.equals(image.storeImageName) && imagePath.equals(image.imagePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalImageName, storeImageName, imagePath);
    }
}
