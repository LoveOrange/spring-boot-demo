package me.linsama.springboot.demo.dto.impl;

import lombok.Getter;
import lombok.Setter;
import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.ArtifactType;

/**
 * CreateJarArtifactDTO
 *
 * @author Linsama
 */
@Getter
@Setter
public class CreateJarArtifactDTO extends CreateArtifactDTO {

    private ArtifactType type = ArtifactType.JAR;

    private String groupId;

    private String artifactId;
}
