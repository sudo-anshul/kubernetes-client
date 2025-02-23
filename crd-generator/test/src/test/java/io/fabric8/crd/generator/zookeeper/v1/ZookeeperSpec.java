/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.crd.generator.zookeeper.v1;

import io.fabric8.generator.annotation.Default;
import io.fabric8.generator.annotation.Required;
import io.fabric8.kubernetes.model.annotation.SpecReplicas;
import lombok.Data;

@Data
public class ZookeeperSpec {

  @SpecReplicas
  private int size;
  @Required
  private String version;
  @Default("false")
  private boolean ephemeral;
}
