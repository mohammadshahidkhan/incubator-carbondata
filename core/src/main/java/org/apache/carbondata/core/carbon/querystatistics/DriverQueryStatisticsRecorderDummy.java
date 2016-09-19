/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.carbondata.core.carbon.querystatistics;

/**
 * Class will be used to record and log the query statistics
 */
public class DriverQueryStatisticsRecorderDummy implements QueryStatisticsRecorder{

  private DriverQueryStatisticsRecorderDummy() {

  }

  private static DriverQueryStatisticsRecorderDummy carbonLoadStatisticsImplInstance =
      new DriverQueryStatisticsRecorderDummy();

  public static DriverQueryStatisticsRecorderDummy getInstance() {
    return carbonLoadStatisticsImplInstance;
  }

  public void recordStatistics(QueryStatistic statistic) {

  }

  public void logStatistics() {

  }

  public void logStatisticsAsTableExecutor() {

  }

  /**
   * Below method will be used to add the statistics
   *
   * @param statistic
   */
  public synchronized void recordStatisticsForDriver(QueryStatistic statistic, String queryId) {

  }

  /**
   * Below method will be used to show statistic log as table
   */
  public void logStatisticsAsTableDriver() {

  }

}
