package tech.jhipster.operator.crds.app;

import io.fabric8.kubernetes.api.model.HasMetadata;

public interface CustomService extends HasMetadata {
    ServiceSpec getSpec();
    String getKind();
}
