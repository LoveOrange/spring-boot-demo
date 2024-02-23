package me.linsama.springboot.demo.factory.impl;

import me.linsama.springboot.demo.dto.impl.CreateDockerArtifactDTO;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.entity.ArtifactType;
import me.linsama.springboot.demo.entity.impl.DockerArtifact;
import me.linsama.springboot.demo.factory.ArtifactFactory;
import org.springframework.stereotype.Component;

/**
 * DockerArtifactFactory
 *
 * @author Linsama
 */
@Component
public class DockerArtifactFactory implements ArtifactFactory<CreateDockerArtifactDTO> {

    @Override
    public ArtifactType getType() {
        return ArtifactType.DOCKER;
    }

    @Override
    public Artifact createRealArtifact(CreateDockerArtifactDTO dto) {
        var artifact = new DockerArtifact();
        artifact.setName(dto.getName());
        artifact.setVersion(dto.getVersion());
        artifact.setImage(dto.getImage());
        return artifact;
    }
}
