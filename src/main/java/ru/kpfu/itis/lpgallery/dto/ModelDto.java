package ru.kpfu.itis.lpgallery.dto;

import lombok.Data;
import ru.kpfu.itis.lpgallery.models.Category;
import ru.kpfu.itis.lpgallery.models.User;

@Data
public class ModelDto {
    private User author;
    private String name;
    private String description;
    private String smallDescription;
    private String filePath;
    private String videoLessonHref;
    private String imagePath;
    private String difficulty;
    private Category category;
}
