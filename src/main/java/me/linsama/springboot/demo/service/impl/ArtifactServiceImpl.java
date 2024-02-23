package me.linsama.springboot.demo.service.impl;

import lombok.RequiredArgsConstructor;
import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.Artifact;
import me.linsama.springboot.demo.factory.ArtifactFactoryRegistry;
import me.linsama.springboot.demo.service.ArtifactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ArtifactServiceImpl
 *
 * @author Linsama
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ArtifactServiceImpl implements ArtifactService {

    private final ArtifactFactoryRegistry factoryRegistry;

    @Override
    public Artifact createArtifact(CreateArtifactDTO createArtifactDTO) {
        var factory = factoryRegistry.getFactory(createArtifactDTO.getType());
        var artifact = factory.createArtifact(createArtifactDTO);

        // do something with artifact
        return artifact;
    }
}
