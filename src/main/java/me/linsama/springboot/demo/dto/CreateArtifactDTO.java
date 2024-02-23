package me.linsama.springboot.demo.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;
import me.linsama.springboot.demo.dto.impl.CreateDockerArtifactDTO;
import me.linsama.springboot.demo.dto.impl.CreateJarArtifactDTO;
import me.linsama.springboot.demo.entity.ArtifactType;

/**
 * CreateArtifactDTO
 *
 * @author Linsama
 */
@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CreateJarArtifactDTO.class, name = "JAR"),
        @JsonSubTypes.Type(value = CreateDockerArtifactDTO.class, name = "DOCKER"),
})
public abstract class CreateArtifactDTO {

    protected String name;

    protected String version;

    protected ArtifactType type;
}
