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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1AWSElasticBlockStoreVolumeSourceFluentImpl<
        A extends V1AWSElasticBlockStoreVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1AWSElasticBlockStoreVolumeSourceFluent<A> {
  public V1AWSElasticBlockStoreVolumeSourceFluentImpl() {}

  public V1AWSElasticBlockStoreVolumeSourceFluentImpl(V1AWSElasticBlockStoreVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());
  }

  private String fsType;
  private Integer partition;
  private Boolean readOnly;
  private String volumeID;

  public String getFsType() {
    return this.fsType;
  }

  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }

  public Boolean hasFsType() {
    return this.fsType != null;
  }

  public Integer getPartition() {
    return this.partition;
  }

  public A withPartition(Integer partition) {
    this.partition = partition;
    return (A) this;
  }

  public Boolean hasPartition() {
    return this.partition != null;
  }

  public Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public String getVolumeID() {
    return this.volumeID;
  }

  public A withVolumeID(String volumeID) {
    this.volumeID = volumeID;
    return (A) this;
  }

  public Boolean hasVolumeID() {
    return this.volumeID != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AWSElasticBlockStoreVolumeSourceFluentImpl that =
        (V1AWSElasticBlockStoreVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (partition != null ? !partition.equals(that.partition) : that.partition != null)
      return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (volumeID != null ? !volumeID.equals(that.volumeID) : that.volumeID != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, partition, readOnly, volumeID, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (partition != null) {
      sb.append("partition:");
      sb.append(partition + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (volumeID != null) {
      sb.append("volumeID:");
      sb.append(volumeID);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
