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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface CoreV1EventListFluent<A extends CoreV1EventListFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public A addToItems(Integer index, CoreV1Event item);

  public A setToItems(Integer index, CoreV1Event item);

  public A addToItems(io.kubernetes.client.openapi.models.CoreV1Event... items);

  public A addAllToItems(Collection<CoreV1Event> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.CoreV1Event... items);

  public A removeAllFromItems(Collection<CoreV1Event> items);

  public A removeMatchingFromItems(Predicate<CoreV1EventBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<CoreV1Event> getItems();

  public List<CoreV1Event> buildItems();

  public CoreV1Event buildItem(Integer index);

  public CoreV1Event buildFirstItem();

  public CoreV1Event buildLastItem();

  public CoreV1Event buildMatchingItem(Predicate<CoreV1EventBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<CoreV1EventBuilder> predicate);

  public A withItems(List<CoreV1Event> items);

  public A withItems(io.kubernetes.client.openapi.models.CoreV1Event... items);

  public Boolean hasItems();

  public CoreV1EventListFluent.ItemsNested<A> addNewItem();

  public CoreV1EventListFluent.ItemsNested<A> addNewItemLike(CoreV1Event item);

  public CoreV1EventListFluent.ItemsNested<A> setNewItemLike(Integer index, CoreV1Event item);

  public CoreV1EventListFluent.ItemsNested<A> editItem(Integer index);

  public CoreV1EventListFluent.ItemsNested<A> editFirstItem();

  public CoreV1EventListFluent.ItemsNested<A> editLastItem();

  public CoreV1EventListFluent.ItemsNested<A> editMatchingItem(
      Predicate<CoreV1EventBuilder> predicate);

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata();

  public V1ListMeta buildMetadata();

  public A withMetadata(V1ListMeta metadata);

  public Boolean hasMetadata();

  public CoreV1EventListFluent.MetadataNested<A> withNewMetadata();

  public CoreV1EventListFluent.MetadataNested<A> withNewMetadataLike(V1ListMeta item);

  public CoreV1EventListFluent.MetadataNested<A> editMetadata();

  public CoreV1EventListFluent.MetadataNested<A> editOrNewMetadata();

  public CoreV1EventListFluent.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item);

  public interface ItemsNested<N>
      extends Nested<N>, CoreV1EventFluent<CoreV1EventListFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }

  public interface MetadataNested<N>
      extends Nested<N>, V1ListMetaFluent<CoreV1EventListFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
