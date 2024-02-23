package me.linsama.springboot.demo.dto.impl;

import lombok.Getter;
import lombok.Setter;
import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.ArtifactType;

/**
 * CreateDockerArtifactDTO
 *
 * @author Linsama
 */
@Getter
@Setter
public class CreateDockerArtifactDTO extends CreateArtifactDTO {

    private ArtifactType type = ArtifactType.DOCKER;

    private String image;
}
