/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.seznam.euphoria.beam.window;

import java.util.Objects;
import org.apache.beam.sdk.extensions.euphoria.core.client.dataset.windowing.Window;


/**
 * Window used as type parameter of {@link BeamWindowing}.
 */
final class UnsupportedWindow extends Window<UnsupportedWindow> {

  private UnsupportedWindow(){
    //Do not instantiate
  }

  @Override
  public int compareTo(UnsupportedWindow o) {
    throw new UnsupportedOperationException();
  }

  @Override
  public long maxTimestamp() {
    throw new UnsupportedOperationException();
  }

  @Override
  public int hashCode() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean equals(Object obj) {
    return Objects.equals(this, obj);
  }


}
