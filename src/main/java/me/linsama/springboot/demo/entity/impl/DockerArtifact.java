package me.linsama.springboot.demo.entity.impl;

import lombok.Getter;
import lombok.Setter;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.entity.ArtifactType;

/**
 * DockerArtifact
 *
 * @author Linsama
 */
@Getter
@Setter
public class DockerArtifact extends Artifact {

    private String image;

    @Override
    public ArtifactType getType() {
        return ArtifactType.DOCKER;
    }

    @Override
    public String getPath() {
        return String.format("%s:%s", image, version);
    }
}
