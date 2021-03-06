/*
 * Copyright 2020 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.kafka.schemaregistry.maven;

import org.apache.maven.plugins.annotations.Parameter;

public class Reference {

  // For mojo, cannot have any constructors besides default constructor

  @Parameter(required = true)
  protected String name;

  @Parameter(required = true)
  protected String subject;

  @Parameter(required = false)
  protected Integer version;

  @Override
  public String toString() {
    return "Reference{"
        + "name='"
        + name
        + '\''
        + ", subject='"
        + subject
        + '\''
        + ", version="
        + version
        + '}';
  }
}
