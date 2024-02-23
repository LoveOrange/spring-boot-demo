package me.linsama.springboot.demo.factory;

import me.linsama.springboot.demo.dto.CreateArtifactDTO;
import me.linsama.springboot.demo.entity.ArtifactType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * ArtifactFactoryRegistry
 *
 * @author Linsama
 */
@Component
public class ArtifactFactoryRegistry {

    private final Map<ArtifactType, ArtifactFactory<? extends CreateArtifactDTO>> registry;

    public ArtifactFactoryRegistry(List<ArtifactFactory<? extends CreateArtifactDTO>> factories) {
        registry = factories.stream().collect(Collectors.toMap(ArtifactFactory::getType, Function.identity()));
    }

    public ArtifactFactory<? extends CreateArtifactDTO> getFactory(ArtifactType type) {
        return registry.get(type);
    }
}
