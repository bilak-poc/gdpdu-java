/*
 * Licensed to OpenCore GmbH & Co. KG under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information regarding copyright ownership.
 * OpenCore GmbH & Co. KG licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package com.opencore.gdpdu.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ForeignKey {

  private List<String> names = new ArrayList<>();
  private String references;
  private Map<String, String> aliases = new HashMap<>();

  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  /**
   * Enthält Informationen über Verknüpfungen.
   * In diesem Falle die referenzierte Tabelle.
   */
  public String getReferences() {
    return references;
  }

  public void setReferences(String references) {
    this.references = references;
  }

  public Map<String, String> getAliases() {
    return aliases;
  }

  public void setAliases(Map<String, String> aliases) {
    this.aliases = aliases;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ForeignKey.class.getSimpleName() + "[", "]")
      .add("names=" + names)
      .add("references='" + references + "'")
      .add("aliases=" + aliases)
      .toString();
  }

}
