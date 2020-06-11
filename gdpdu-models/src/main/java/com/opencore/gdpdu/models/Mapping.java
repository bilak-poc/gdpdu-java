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

import java.util.StringJoiner;

public class Mapping {

  private String description;
  private String from;
  private String to;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Mapping.class.getSimpleName() + "[", "]")
      .add("description='" + description + "'")
      .add("from='" + from + "'")
      .add("to='" + to + "'")
      .toString();
  }

}