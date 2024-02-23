package me.linsama.springboot.demo.factory.impl;

import me.linsama.springboot.demo.dto.impl.CreateJarArtifactDTO;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.entity.ArtifactType;
import me.linsama.springboot.demo.entity.impl.JarArtifact;
import me.linsama.springboot.demo.factory.ArtifactFactory;
import org.springframework.stereotype.Component;

/**
 * JarArtifactFactory
 *
 * @author Linsama
 */
@Component
public class JarArtifactFactory implements ArtifactFactory<CreateJarArtifactDTO> {

    @Override
    public ArtifactType getType() {
        return ArtifactType.JAR;
    }

    @Override
    public Artifact createRealArtifact(CreateJarArtifactDTO dto) {
        var artifact = new JarArtifact();
        artifact.setName(dto.getArtifactId());
        artifact.setGroupId(dto.getGroupId());
        artifact.setArtifactId(dto.getArtifactId());
        artifact.setVersion(dto.getVersion());
        return artifact;
    }
}
