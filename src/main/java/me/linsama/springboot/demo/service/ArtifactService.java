package me.linsama.springboot.demo.service;

import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.Artifact;

/**
 * ArtifactService
 *
 * @author Linsama
 */
public interface ArtifactService {

    Artifact createArtifact(CreateArtifactDTO createArtifactDTO);
}
