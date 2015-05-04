/**
 * Copyright (C) 2014-2015 SINTEF
 *
 *     Nicolas Ferry <nicolas.ferry@sintef.no>
 *     Brian Elvesæter <brian.elvesater@sintef.no>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.modelbased.sensapp.proasense.model;

import java.util.List;

import net.modelbased.sensapp.proasense.model.StringMeasure;


public class StringMeasureJsonModel extends MeasureJsonModel {
	
	public StringMeasureJsonModel() {
		super();
	}
	
	public StringMeasureJsonModel(String bn, String bu) {
		super(bn, bu);
	}
	
	public StringMeasureJsonModel(String bn, long bt, String bu, List<ValueJsonModel> e) {
		super(bn, bt, bu, e);
	}
	
	public StringMeasureJsonModel appendMeasure(String value, long time) {
		getE().add(new StringValueJsonModel(value, time));
		return this;
	}
	
	public StringMeasureJsonModel appendMeasure(StringMeasure measure) {
		if (!measure.getSensor().equals(getBn())) {
			throw new IllegalArgumentException("Incompatible sensor name: " + measure.getSensor());
		} 
		getE().add(new StringValueJsonModel(measure.getValue(), measure.getTime()));
		return this;
	}

	@Override
	public String toString() {
		return "MEASURE MODEL/ bn: " + getBn() + " - bt: " + getBt() + " - bu: " + getBu();
	}
}
