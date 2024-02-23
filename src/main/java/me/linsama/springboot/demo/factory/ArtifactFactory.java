package me.linsama.springboot.demo.factory;

import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.entity.ArtifactType;

/**
 * ArtifactFactory
 *
 * @author Linsama
 */
public interface ArtifactFactory<T extends CreateArtifactDTO> {

    ArtifactType getType();

    Artifact createRealArtifact(T dto);

    default Artifact createArtifact(CreateArtifactDTO dto) {
        // This is safe because the generic type is checked in the implementation
        // noinspection unchecked
        return createRealArtifact((T) dto);
    }
}
