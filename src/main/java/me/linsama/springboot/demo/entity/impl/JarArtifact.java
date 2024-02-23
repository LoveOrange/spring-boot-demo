package me.linsama.springboot.demo.entity.impl;

import lombok.Getter;
import lombok.Setter;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.entity.ArtifactType;

/**
 * JarArtifact
 *
 * @author Linsama
 */
@Getter
@Setter
public class JarArtifact extends Artifact {

    private String groupId;

    private String artifactId;

    @Override
    public ArtifactType getType() {
        return ArtifactType.JAR;
    }

    @Override
    public String getPath() {
        return String.format("%s:%s:%s", groupId, artifactId, version);
    }
}
