/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V2HorizontalPodAutoscalerFluentImpl<A extends V2HorizontalPodAutoscalerFluent<A>>
    extends BaseFluent<A> implements V2HorizontalPodAutoscalerFluent<A> {
  public V2HorizontalPodAutoscalerFluentImpl() {}

  public V2HorizontalPodAutoscalerFluentImpl(V2HorizontalPodAutoscaler instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());
  }

  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V2HorizontalPodAutoscalerSpecBuilder spec;
  private V2HorizontalPodAutoscalerStatusBuilder status;

  public String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public String getKind() {
    return this.kind;
  }

  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }

  public Boolean hasKind() {
    return this.kind != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    } else {
      this.metadata = null;
      _visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }

  public Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V2HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadata() {
    return new V2HorizontalPodAutoscalerFluentImpl.MetadataNestedImpl();
  }

  public V2HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V2HorizontalPodAutoscalerFluentImpl.MetadataNestedImpl(item);
  }

  public V2HorizontalPodAutoscalerFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public V2HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null ? getMetadata() : new V1ObjectMetaBuilder().build());
  }

  public V2HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadataLike(
      V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  /**
   * This method has been deprecated, please use method buildSpec instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2HorizontalPodAutoscalerSpec getSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public V2HorizontalPodAutoscalerSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }

  public A withSpec(V2HorizontalPodAutoscalerSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec != null) {
      this.spec = new V2HorizontalPodAutoscalerSpecBuilder(spec);
      _visitables.get("spec").add(this.spec);
    } else {
      this.spec = null;
      _visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }

  public Boolean hasSpec() {
    return this.spec != null;
  }

  public V2HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpec() {
    return new V2HorizontalPodAutoscalerFluentImpl.SpecNestedImpl();
  }

  public V2HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpecLike(
      V2HorizontalPodAutoscalerSpec item) {
    return new V2HorizontalPodAutoscalerFluentImpl.SpecNestedImpl(item);
  }

  public V2HorizontalPodAutoscalerFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }

  public V2HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(
        getSpec() != null ? getSpec() : new V2HorizontalPodAutoscalerSpecBuilder().build());
  }

  public V2HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpecLike(
      V2HorizontalPodAutoscalerSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec() : item);
  }

  /**
   * This method has been deprecated, please use method buildStatus instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2HorizontalPodAutoscalerStatus getStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public V2HorizontalPodAutoscalerStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }

  public A withStatus(V2HorizontalPodAutoscalerStatus status) {
    _visitables.get("status").remove(this.status);
    if (status != null) {
      this.status = new V2HorizontalPodAutoscalerStatusBuilder(status);
      _visitables.get("status").add(this.status);
    } else {
      this.status = null;
      _visitables.get("status").remove(this.status);
    }
    return (A) this;
  }

  public Boolean hasStatus() {
    return this.status != null;
  }

  public V2HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatus() {
    return new V2HorizontalPodAutoscalerFluentImpl.StatusNestedImpl();
  }

  public V2HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatusLike(
      V2HorizontalPodAutoscalerStatus item) {
    return new V2HorizontalPodAutoscalerFluentImpl.StatusNestedImpl(item);
  }

  public V2HorizontalPodAutoscalerFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }

  public V2HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(
        getStatus() != null ? getStatus() : new V2HorizontalPodAutoscalerStatusBuilder().build());
  }

  public V2HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatusLike(
      V2HorizontalPodAutoscalerStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2HorizontalPodAutoscalerFluentImpl that = (V2HorizontalPodAutoscalerFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) : that.spec != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, spec, status, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata + ",");
    }
    if (spec != null) {
      sb.append("spec:");
      sb.append(spec + ",");
    }
    if (status != null) {
      sb.append("status:");
      sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }

  class MetadataNestedImpl<N>
      extends V1ObjectMetaFluentImpl<V2HorizontalPodAutoscalerFluent.MetadataNested<N>>
      implements V2HorizontalPodAutoscalerFluent.MetadataNested<N>, Nested<N> {
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }

    V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V2HorizontalPodAutoscalerFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  class SpecNestedImpl<N>
      extends V2HorizontalPodAutoscalerSpecFluentImpl<V2HorizontalPodAutoscalerFluent.SpecNested<N>>
      implements V2HorizontalPodAutoscalerFluent.SpecNested<N>, Nested<N> {
    SpecNestedImpl(V2HorizontalPodAutoscalerSpec item) {
      this.builder = new V2HorizontalPodAutoscalerSpecBuilder(this, item);
    }

    SpecNestedImpl() {
      this.builder = new V2HorizontalPodAutoscalerSpecBuilder(this);
    }

    V2HorizontalPodAutoscalerSpecBuilder builder;

    public N and() {
      return (N) V2HorizontalPodAutoscalerFluentImpl.this.withSpec(builder.build());
    }

    public N endSpec() {
      return and();
    }
  }

  class StatusNestedImpl<N>
      extends V2HorizontalPodAutoscalerStatusFluentImpl<
          V2HorizontalPodAutoscalerFluent.StatusNested<N>>
      implements V2HorizontalPodAutoscalerFluent.StatusNested<N>, Nested<N> {
    StatusNestedImpl(V2HorizontalPodAutoscalerStatus item) {
      this.builder = new V2HorizontalPodAutoscalerStatusBuilder(this, item);
    }

    StatusNestedImpl() {
      this.builder = new V2HorizontalPodAutoscalerStatusBuilder(this);
    }

    V2HorizontalPodAutoscalerStatusBuilder builder;

    public N and() {
      return (N) V2HorizontalPodAutoscalerFluentImpl.this.withStatus(builder.build());
    }

    public N endStatus() {
      return and();
    }
  }
}
