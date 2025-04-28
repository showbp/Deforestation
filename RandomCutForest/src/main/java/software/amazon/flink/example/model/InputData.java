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

package software.amazon.flink.example.model;
import com.fasterxml.jackson.annotation.JsonProperty;
public class InputData {
    @JsonProperty("Systolic")
    private int Systolic;
    @JsonProperty("Diastolic")
    private int Diastolic;
    @JsonProperty("No")
	private int No;
    public int getSystolic() {
        return Systolic;
    }

    public void setSystolic(int Systolic) {
        this.Systolic = Systolic;
    }

    public int getDiastolic() {
        return Diastolic;
    }

    public void setDiastolic(int Diastolic) {
        this.Diastolic = Diastolic;
    }
    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }
    @Override
    public String toString() {
        return "InputData{" +
                "Systolic=" + Systolic +
                ", Diastolic=" + Diastolic +
				", No=" + No +
                '}';
    }
}

