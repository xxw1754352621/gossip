/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.gossip.examples;

import org.apache.gossip.manager.GossipManager;

import java.io.IOException;

public class StandAloneNode03 extends StandAloneExampleBase {

  private static boolean WILL_READ = false;

  public static void main(String[] args) throws InterruptedException, IOException {
    args=new String[4];
    args[0]="udp://localhost:10002";
    args[1]="2";
    args[2]="udp://localhost:10000";
    args[3]="0";
    StandAloneNode03 example = new StandAloneNode03(args);
    example.exec(WILL_READ);
  }

  StandAloneNode03(String[] args) {
    args = super.checkArgsForClearFlag(args);
    super.initGossipManager(args);
  }

  @Override
  void printValues(GossipManager gossipService) {
    //System.out.println("执行gossip管理");
  }

}
